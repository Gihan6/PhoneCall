package com.example.phonecall;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;


public class CallInterceptor extends BroadcastReceiver {

    String error="";
    @Override
    public void onReceive(Context context, Intent intent) {

        try {

            Intent serviceIntent = new Intent(context, BroadcastService.class);
            context.startService(serviceIntent);



        } catch (Exception e) {
            error=e.toString();


            e.printStackTrace();
        }


    }
}
