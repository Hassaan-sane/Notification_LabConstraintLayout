package com.example.sane.labconstraintlayout;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.NotificationCompat;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button Notifybtn = (Button) findViewById(R.id.button);

        Notifybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//                NotificationManager NM = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
//                String Id = "Channel 1";
//                String msg = "THIS IS A MESSAGE";
//
//                int importance = NotificationManager.IMPORTANCE_HIGH;
//                NotificationChannel mChannel = new NotificationChannel(Id,msg,importance);
//                NM.createNotificationChannel(mChannel);

                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                PendingIntent pendingIntent = PendingIntent.getActivity(getApplicationContext(),
                        (int) System.currentTimeMillis(), i, 0);
                NotificationCompat.Builder mBuilder =
                        (NotificationCompat.Builder) new NotificationCompat.Builder(getApplicationContext())
                                .setSmallIcon(R.drawable.notification_icon)
                                .setContentTitle("NOTIFICAtion")
                                .setContentText("subtes=xttt")
                                .setContentIntent(pendingIntent);
                NotificationManager NM = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
                NM.notify(0, mBuilder.build());

            }
        });


    }
}
