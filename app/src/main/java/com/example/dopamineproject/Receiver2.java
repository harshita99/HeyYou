package com.example.dopamineproject;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class Receiver2 extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent)
    {
      /*Intent service1 = new Intent(context, MyAlarmService.class);
        context.startService(service1);*/
        Log.i("App", "called receiver method");
        try{
            notification1.quoteNotification(context);

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

