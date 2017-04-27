/**
 * Copyright 2005-2015 WSO2, Inc. (http://wso2.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.wso2.carbon.bps.analytics.core;

/**
 * Keep all the constants which are used in the project
 */
public class AnalyticConstants {
	public static final String COLUMN_FINISHED_TIME = "finishedTime";
	public static final String ANALYTICS_AGGREGATE = "analytics/aggregates";
	public static final String ANALYTICS_SEARCH = "analytics/search";

	public static final String AVG = "AVG";
	public static final String COUNT = "COUNT";
	public static final String SUM = "SUM";

	public static final String DURATION = "duration";
	public static final String AVG_EXECUTION_TIME = "avgExecutionTime";
	public static final String PROCESS_INSTANCE_COUNT = "processInstanceCount";
	public static final String TASK_INSTANCE_COUNT = "taskInstanceCount";
	public static final String PROCESS_USAGE_TABLE = "PROCESS_USAGE_SUMMARY_DATA";
	public static final String TASK_USAGE_TABLE = "TASK_USAGE_SUMMARY_DATA";
	public static final String USER_INVOLVE_TABLE = "USER_INVOLVE_SUMMARY_DATA";
	public static final String PROCESS_DEFINITION_KEY = "processDefKey";
	public static final String TASK_DEFINITION_KEY = "taskDefId";
	public static final String PROCESS_VERSION = "processVer";
	public static final String ASSIGN_USER = "assignUser";
	public static final String AVG_WAITING_TIME = "avgWaitingTime";
	public static final String TOTAL_INVOLVED_TIME = "totalInvolvedTime";
	public static final String COMPLETED_TOTAL_TASKS = "completedTotalTasks";
	public static final String TOTAL_INSTANCE_COUNT = "totalInstanceCount";
	public static final String ALL = "*";

	public static final String PC_CONFIGURATION_FILE_NAME = "pc.xml";
	public static final String PC_NAMESPACE = "http://wso2.org/pc/config";
	public static final String ANALYTICS = "analytics";
	public static final String PROPERTY = "property";
	public static final String CONFIG_BASE_URL = "dasBaseUrl";
	public static final String CONFIG_USER_NAME = "dasUsername";
	public static final String CONFIG_PASSWORD = "dasPassword";
	public static final String NAME = "name";
	public static final String VALUE = "value";
}
