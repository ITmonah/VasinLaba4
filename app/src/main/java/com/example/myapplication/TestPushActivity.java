package com.example.myapplication;

import android.app.NotificationManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class TestPushActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_push);
    }

    public void pushBtn(View view) {
        MyPushNotification myPushNotification = new MyPushNotification(this,getSystemService(NotificationManager.class));
        myPushNotification.sendNotify("Nice","Pencil");
    }
}