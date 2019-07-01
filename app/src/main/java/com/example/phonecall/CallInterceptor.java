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
            Toast.makeText(context, "Phone call", Toast.LENGTH_SHORT).show();
            Intent i=new Intent(context, PhoneCall.class);
            i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(i);


        } catch (Exception e) {
            error=e.toString();


            e.printStackTrace();
        }


    }
}
