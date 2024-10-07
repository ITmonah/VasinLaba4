package com.example.myapplication;

import android.app.NotificationManager;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class TestPushActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_push);
        MyPushNotification myPushNotification = new MyPushNotification(this,getSystemService(NotificationManager.class));
        myPushNotification.sendNotify("День","Скоро конец рабочего дня");
    }

    public void nextPage(View view) {
        Intent intent = new Intent(getApplicationContext(),ThirdActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
        startActivity(intent);
    }
}