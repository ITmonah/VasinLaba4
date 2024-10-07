package com.example.myapplication;

import android.app.NotificationManager;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        MyPushNotification myPushNotification = new MyPushNotification(this,getSystemService(NotificationManager.class));
        myPushNotification.sendNotify("Вечер","Спать!");
    }

    public void nextPage(View view) {
        Intent intent = new Intent(getApplicationContext(),ForthActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
        startActivity(intent);
    }
}