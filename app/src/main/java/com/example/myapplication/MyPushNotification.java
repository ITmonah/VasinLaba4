package com.example.myapplication;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import android.support.v4.app.NotificationCompat;

public class MyPushNotification {
    private static String CHANNEL_ID = "Base channel";
    private static String CHANNEL_DESC = "Its Base channel";
    private static final int NOTIFY_ID = 123;
    private NotificationManager notificationManager;
    private Context context;

    public MyPushNotification(Context context, NotificationManager manager){
        notificationManager=manager;
        this.context=context;
        createNotificationChannel();
    }

    public void sendNotify(String title,String text){
        NotificationCompat.Builder builder = new NotificationCompat.Builder(context,CHANNEL_ID)
                .setContentTitle(title)
                .setContentText(text)
                .setSmallIcon(R.drawable.ic_baseline_two_wheeler_24);
        notificationManager.notify(NOTIFY_ID,builder.build());
    }

    private void createNotificationChannel(){
        if (Build.VERSION.SDK_INT>=Build.VERSION_CODES.O){
            int importance = NotificationManager.IMPORTANCE_DEFAULT;
            NotificationChannel channel = new NotificationChannel(CHANNEL_ID,CHANNEL_ID,importance);
            channel.setDescription(CHANNEL_DESC);
            notificationManager.createNotificationChannel(channel);
        }
    }
}
