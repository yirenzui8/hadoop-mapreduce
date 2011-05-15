/**
* Licensed to the Apache Software Foundation (ASF) under one
* or more contributor license agreements.  See the NOTICE file
* distributed with this work for additional information
* regarding copyright ownership.  The ASF licenses this file
* to you under the Apache License, Version 2.0 (the
* "License"); you may not use this file except in compliance
* with the License.  You may obtain a copy of the License at
*
*     http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

package org.apache.hadoop.yarn.conf;

public class YARNApplicationConstants {

  public static final String HADOOP_MAPREDUCE_CLIENT_APP_JAR_NAME =
      "hadoop-mapreduce-client-app-1.0-SNAPSHOT.jar";

  // This should be the directory where splits file gets localized on the node
  // running ApplicationMaster.
  public static final String JOB_SUBMIT_DIR = "jobSubmitDir";
  
  // This should be the name of the localized job-configuration file on the node
  // running ApplicationMaster and Task
  public static final String JOB_CONF_FILE = "job.xml";
  // This should be the name of the localized job-jar file on the node running
  // individual containers/tasks.
  public static final String JOB_JAR = "job.jar";

  public static final String NM_HOSTS_CONF_KEY = "NM_HOSTS";

  public static final String APPS_STAGING_DIR_KEY = "yarn.apps.stagingDir";

  public static final String APPS_HISTORY_STAGING_DIR_KEY = "yarn.apps.history.stagingDir";
  
  public static final String YARN_MAPREDUCE_APP_JAR_PATH =
      "$YARN_HOME/modules/" + HADOOP_MAPREDUCE_CLIENT_APP_JAR_NAME;

  public static final String LOCAL_DIR_ENV = "YARN_LOCAL_DIRS";

  // TODO: Move into MR.
  public static final String MR_APPMASTER_COMMAND_OPTS =
      "yarn.appMaster.commandOpts";
  
  public static final String AM_RM_SCHEDULE_INTERVAL = 
    "yarn.appMaster.scheduler.interval";
  
  public static final int DEFAULT_AM_RM_SCHEDULE_INTERVAL = 2000;
}
