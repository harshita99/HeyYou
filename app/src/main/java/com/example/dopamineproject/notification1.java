package com.example.dopamineproject;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.TaskStackBuilder;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;

import androidx.core.app.NotificationCompat;

public class notification1 {
    //public static NotificationManager movie;

    public static void movieNotification(Context context) {
        NotificationCompat.Builder movie =
                new NotificationCompat.Builder(context)
                        .setSmallIcon(R.drawable.ic_smile) //set icon for notification
                        .setContentTitle("Want to watch a movie?") //set title of notification
                        .setContentText("Here are some movies to watch when you're sad,glum or bummed out.")//this is notification message
                        .setAutoCancel(true) // makes auto cancel of notification
                        .setPriority(NotificationCompat.PRIORITY_DEFAULT); //set priority of notification

        Bitmap bitmap_image = BitmapFactory.decodeResource(context.getResources(), R.drawable.ic_smile);
        NotificationCompat.BigPictureStyle s = new NotificationCompat.BigPictureStyle().bigPicture(bitmap_image);
        movie.setStyle(s);

        Intent i1 = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://galadarling.com/article/33-movies-to-watch-when-youre-sad-glum-or-bummed-out/"));
        TaskStackBuilder TSB = TaskStackBuilder.create(context);
        TSB.addParentStack(MainActivity.class);
        // Adds the Intent that starts the Activity to the top of the stack
        TSB.addNextIntent(i1);
        PendingIntent resultPendingIntent =
                TSB.getPendingIntent(0, PendingIntent.FLAG_UPDATE_CURRENT);

        movie.setContentIntent(resultPendingIntent);

        NotificationManager NM1 = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
        // mId allows you to update the notification later on.

        NM1.notify(0, movie.build());

    }

    //public static NotificationManager quote;

    public static void quoteNotification(Context context) {
        NotificationCompat.Builder quote =
                new NotificationCompat.Builder(context)
                        .setSmallIcon(R.drawable.ic_smile) //set icon for notification
                        .setContentTitle("HeyYou!") //set title of notification
                        .setContentText("Quote of the day")//this is notification message
                        .setAutoCancel(true) // makes auto cancel of notification
                        .setPriority(NotificationCompat.PRIORITY_DEFAULT); //set priority of notification

        Bitmap bitmap_image = BitmapFactory.decodeResource(context.getResources(), R.drawable.ic_smile);
        NotificationCompat.BigPictureStyle s = new NotificationCompat.BigPictureStyle().bigPicture(bitmap_image);
        quote.setStyle(s);
        Intent i1 = new Intent(context, Quote.class);
        TaskStackBuilder TSB = TaskStackBuilder.create(context);
        TSB.addParentStack(MainActivity.class);
        // Adds the Intent that starts the Activity to the top of the stack
        TSB.addNextIntent(i1);
        PendingIntent resultPendingIntent =
                TSB.getPendingIntent(1, PendingIntent.FLAG_UPDATE_CURRENT);

        quote.setContentIntent(resultPendingIntent);

        NotificationManager NM1 = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
        // mId allows you to update the notification later on.

        NM1.notify(1, quote.build());
    }

   // public static NotificationManager notif1;

    public static void Notification(Context context) {
        NotificationCompat.Builder notif1 =
                new NotificationCompat.Builder(context)
                        .setSmallIcon(R.drawable.ic_smile) //set icon for notification
                        .setContentTitle("HEY YOU!") //set title of notification
                        .setContentText("Want to track your mood?")//this is notification message
                        .setAutoCancel(true) // makes auto cancel of notification
                        .setPriority(NotificationCompat.PRIORITY_DEFAULT); //set priority of notification

        Bitmap bitmap_image = BitmapFactory.decodeResource(context.getResources(), R.drawable.ic_smile);
        NotificationCompat.BigPictureStyle s = new NotificationCompat.BigPictureStyle().bigPicture(bitmap_image);
        notif1.setStyle(s);

        Intent i1 = new Intent(context, Home_page.class);
        TaskStackBuilder TSB = TaskStackBuilder.create(context);
        TSB.addParentStack(MainActivity.class);
        // Adds the Intent that starts the Activity to the top of the stack
        TSB.addNextIntent(i1);
        PendingIntent resultPendingIntent =
                TSB.getPendingIntent(2, PendingIntent.FLAG_UPDATE_CURRENT);

        notif1.setContentIntent(resultPendingIntent);

        NotificationManager NM1 = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
        // mId allows you to update the notification later on.

        NM1.notify(0, notif1.build());
    }
}
