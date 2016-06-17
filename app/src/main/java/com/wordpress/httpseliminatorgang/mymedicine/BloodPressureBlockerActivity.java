package com.wordpress.httpseliminatorgang.mymedicine;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Cedric on 04.06.2016.
 */
public class BloodPressureBlockerActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blood_pressure_blocker);


    }


    public void PlayText1(View view) {
        MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.blood_pressure_blocker);
        mp.start();
    }

    public void OpenBrowser1(View view) {
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mainboardprozessor.jimdo.com/myprofile/blood-pressure-blocker/"));
        startActivity(i);
    }
}