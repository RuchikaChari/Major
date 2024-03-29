package com.example.eduhub;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends Activity
{@Override
    public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
     
    /**
     * Creating all buttons instances
     * */
    
    // Dashboard News feed button
    Button btn_scheduler = (Button) findViewById(R.id.btn_sch);
     
    // Dashboard Friends button
    Button btn_calendar= (Button) findViewById(R.id.btn_cal);
     
    // Dashboard Messages button
    Button btn_resource= (Button) findViewById(R.id.btn_res);
     
    // Dashboard Places button
    Button btn_notification = (Button) findViewById(R.id.btn_not);
     
    // Dashboard Extra button
    Button btn_extra = (Button) findViewById(R.id.btn_note);
     
    // Dashboard Attendance button
    Button btn_att = (Button) findViewById(R.id.btn_att);
     
    /**
     * Handling all button click events
     * */
     
    // Listening to News Feed button click
    btn_scheduler.setOnClickListener(new View.OnClickListener() {
         
        @Override
        public void onClick(View view) {
            // Launching News Feed Screen
            Intent i = new Intent(getApplicationContext(), SchedulerActivity.class);
            startActivity(i);
        }
    });
     
   // Listening Friends button click
    btn_calendar.setOnClickListener(new View.OnClickListener() {
         
        @Override
        public void onClick(View view) {
            // Launching News Feed Screen
            Intent i = new Intent(getApplicationContext(), CalendarActivity.class);
            startActivity(i);
        }
    });
     
    // Listening Messages button click
    btn_resource.setOnClickListener(new View.OnClickListener() {
         
        @Override
        public void onClick(View view) {
            // Launching News Feed Screen
            Intent i = getPackageManager().getLaunchIntentForPackage("com.dropbox.android");//new Intent(getApplicationContext(), ResourceActivity.class);
            startActivity(i);
        }
    });
     
    // Listening to Places button click
    btn_notification.setOnClickListener(new View.OnClickListener() {
         
        @Override
        public void onClick(View view) {
            // Launching News Feed Screen
            Intent i = new Intent(getApplicationContext(), NotificationActivity.class);
            startActivity(i);
        }
    });
     
    // Listening to Extras button click
    btn_extra.setOnClickListener(new View.OnClickListener() {
         
        @Override
        public void onClick(View view) {
            // Launching News Feed Screen
            Intent i = new Intent(getApplicationContext(), Extra.class);
            startActivity(i);
        }
    });
     
    // Listening to Photos button click
    btn_att.setOnClickListener(new View.OnClickListener() {
         
        @Override
        public void onClick(View view) {
            // Launching News Feed Screen
            Intent i = new Intent(getApplicationContext(), Attendance.class);
            startActivity(i);
        }
    });
}
}