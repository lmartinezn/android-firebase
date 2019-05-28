package cat.tecnocampus.mobileapps.androidfirebase;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    public static final String CHANNEL_ID = "123456789";
    public static final int NOTIFICATION_ID = 44;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        createNotficationChannel();
    }

    private void createNotficationChannel() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            String tag = "TEST_NOTIS";
            NotificationChannel channel = new NotificationChannel(
                    CHANNEL_ID,
                    tag,
                    NotificationManager.IMPORTANCE_DEFAULT
            );

            NotificationManager manager = getSystemService(NotificationManager.class);
            manager.createNotificationChannel(channel);
        }
    }
}
