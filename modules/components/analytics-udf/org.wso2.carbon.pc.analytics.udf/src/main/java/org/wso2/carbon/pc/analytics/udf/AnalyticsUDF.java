package org.wso2.carbon.pc.analytics.udf;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/**
 * AnalyticsUDF class provides methods to compute summarized results for both process and task instances
 * which published to the Data Analytics Server through the BPMN Data Publisher. The generated jar
 * is embedded into the spark engine in DAS as a UDF so that we can invoke these methods as sql functions
 * in spark console.
 */
public class AnalyticsUDF {
	/**
	 * Convert given datetime string to date
	 *
	 * @param date in the format of eg:Thu Sep 24 09:35:56 IST 2015
	 * @return date (eg: 2015-09-24)
	 */
	private static String dateFormatter(String date) {
		String[] dateArray = date.split(AnalyticsUDFConstants.SPACE_SEPARATOR);
		try {
			// convert a given month which is in the format of string to an integer
			Date dateMonth = new SimpleDateFormat(AnalyticsUDFConstants.MONTH_FORMAT, Locale.ENGLISH).parse(dateArray[1]);
			Calendar cal = Calendar.getInstance();
			cal.setTime(dateMonth);
			// months begin from 0, therefore add 1
			int month = cal.get(Calendar.MONTH) + 1;
			String dateString = dateArray[5] + AnalyticsUDFConstants.DATE_SEPARATOR + month + AnalyticsUDFConstants.DATE_SEPARATOR + dateArray[2];
			DateFormat df = new SimpleDateFormat(AnalyticsUDFConstants.DATE_FORMAT_WITHOUT_TIME);
			return df.format(df.parse(dateString));
		} catch (ParseException e) {
			return null;
		}
	}

	/**
	 * Get time stamp
	 *
	 * @param date in the format of eg:Thu Sep 24 09:35:56 IST 2015
	 * @return time stamp of the given date
	 */
	private static Timestamp getTimestamp(String date) {
		try {
			DateFormat df = new SimpleDateFormat(AnalyticsUDFConstants.DATE_FORMAT_WITHOUT_TIME);
			Date parsedTimeStamp = df.parse(AnalyticsUDF.dateFormatter(date));
			Timestamp timestamp = new Timestamp(parsedTimeStamp.getTime());
			return timestamp;
		} catch (ParseException e) {
			return null;
		}
	}

	/**
	 * Get date as a string
	 *
	 * @param date in the format of eg:Thu Sep 24 09:35:56 IST 2015
	 * @return date (eg: 2015-09-24)
	 */
	public String dateStr(String date) {
		return AnalyticsUDF.dateFormatter(date);
	}

	/**
	 * Get time as a long value
	 *
	 * @param date in the format of eg:Thu Sep 24 09:35:56 IST 2015
	 * @return long value of the date. This needs to pass rest api search url in DAS
	 */
	public long getTime(String date) {
		return AnalyticsUDF.getTimestamp(date).getTime();
	}

	/**
	 * Get process version
	 *
	 * @param processName
	 * @return version of the process
	 */
	public String getProcessVersion(String processName) {
		return processName.split(AnalyticsUDFConstants.COLON_SEPARATOR)[0];
	}

	/**
	 * Convert duration in milliseconds to hours
	 *
	 * @param duration in milliseconds
	 * @return hours as integer value
	 */
	public long getHours(long duration) {
		return TimeUnit.MILLISECONDS.toMinutes(duration);
	}
}
