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
public class AthletesFoodActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_athletes_food);

    }

    public void PlayText3(View view) {
        MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.athlete_s_food);
        mp.start();
    }

    public void OpenBrowser3(View view) {
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mainboardprozessor.jimdo.com/myprofile/athlete-s-food/"));
        startActivity(i);
    }
}
