package com.herbeat.constants;

public final class APIConstants 
{
	public static String fileNameWithActivity_Record = "Activity_Record";
	public static String fileNameWithTodayEMAtime = "TodayEMAtime";
	public static String fileNameWithSet_Goal = "set_goal";
	public static String fileNameWithEMAtime_Notification = "EMAtime_Notification";
	public static String fileNameWithSelected_Activity = "selected_Activity";
	public static String fileNameWithRemaining_Activity_Message = "remaining Activity_Message";
	public static String fileNameWithHeartRate = "heartRate";
	public static String fileNameWithChecking_Activity = "checking_Activity";
	public static String fileNameWithWatching_Video = "watching_video";
	public static String fileNameWithWatch_Disconnected = "Watch_Disconnected";
	public static String fileNameWithWifi_Disconnected = "Wifi_Disconnect";
	public static String fileNameWithBluetoothConnection = "BluetoothConnection";
	public static String fileNameWithPhoneBattery = "phoneBattery";
	public static String fileNameWithInterventionMessage = "Intervention_Message";
	
	public static String Insert_into_activity_record = "INSERT INTO activity_record(USERNAME, USER_SITTING_DURATION, USER_WALKING_DURATION, USER_STEP_COUNT, DISTANCE_COVERED_IN_MILES, USER_HEART_RATE, ACTIVITY_TIME) VALUES(?,?,?,?,?,?,?)";
	public static String Insert_into_ema_schedule_perday = "INSERT INTO ema_schedule_perday(USERNAME, EMA_TIME, ACTIVITY_TIME) VALUES(?,?,?)";
	public static String Insert_into_user_goals = "INSERT INTO user_goals(USERNAME, USER_READINESS_LEVEL, USER_WALK_TARGET, USER_CURRENT_ENERGY, ACTIVITY_TIME) VALUES(?,?,?,?,?)";
	public static String Insert_into_ematime_notification_fired = "INSERT INTO ematime_notification_fired(USERNAME, NOTIFICATION_FIRED_TIME) VALUES(?,?)";
	public static String Insert_into_selected_activity = "INSERT INTO selected_activity(USERNAME, USER_SELECTED_ACTIVITY, USER_COMPANY, USER_CURR_LOCATION, USER_FOOD_HABIT, USER_FEELINGS, ACTIVITY_TIME) VALUES(?,?,?,?,?,?,?)";
	public static String Insert_into_heartrate_checking = "INSERT INTO heartrate_checking(USERNAME, USER_HEART_RATE, ACTIVITY_TIME) VALUES(?,?,?)";
	public static String Insert_into_checking_activity = "INSERT INTO checking_activity_record(USERNAME, WALK, STEP_COUNT, SITTING, ACTIVITY_TIME) VALUES(?,?,?,?,?)";
	public static String Insert_into_watch_disconnected = "INSERT INTO watch_disconnected(USERNAME, ACTIVITY_TIME) VALUES(?,?)";
	public static String Insert_into_wifi_disconnected = "INSERT INTO wifi_disconnected(USERNAME, ACTIVITY_TIME) VALUES(?,?)";
	public static String Insert_into_intervention_msg = "INSERT INTO intervention_msg(USERNAME, MESSAGE, ACTIVITY_TIME) VALUES(?,?,?)";
	public static String Insert_into_remaining_activity_msg = "INSERT INTO remaining_activity_msg(USERNAME, REMAINING_ACTIVITY_MSG, ACTIVITY_TIME) VALUES(?,?,?)";
	public static String Insert_into_user_watching_video = "INSERT INTO user_watching_video(USERNAME, VIDEO_TITLE, ACTIVITY_TIME) VALUES(?,?,?)";
	public static String Insert_into_bluetooth_connection_failed = "INSERT INTO bluetooth_connection_failed(USERNAME, ACTIVITY_TIME) VALUES(?,?)";
	public static String Insert_into_phonebattery_checking = "INSERT INTO phonebattery_checking(USERNAME, REMAINING_BATTERY, ACTIVITY_TIME) VALUES(?,?,?)";
}
