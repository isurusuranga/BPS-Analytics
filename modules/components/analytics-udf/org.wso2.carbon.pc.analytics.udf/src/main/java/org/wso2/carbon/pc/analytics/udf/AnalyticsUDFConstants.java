package org.wso2.carbon.pc.analytics.udf;

/**
 * AnalyticsUDFConstants class holds the constants of AnalyticsUDF class
 */
public class AnalyticsUDFConstants {
	public static final String DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";
	public static final String DATE_FORMAT_WITHOUT_TIME = "yyyy-MM-dd";
	public static final String MONTH_FORMAT = "MMM";
	public static final String DATE_SEPARATOR = "-";
	public static final String SPACE_SEPARATOR = " ";
	public static final String COLON_SEPARATOR = ":\\d*$";
	public static final int SECOND = 1000;
	public static final int MINUTE = 60 * SECOND;
	public static final int HOUR = 60 * MINUTE;
	public static final int DAY = 24 * HOUR;
}
