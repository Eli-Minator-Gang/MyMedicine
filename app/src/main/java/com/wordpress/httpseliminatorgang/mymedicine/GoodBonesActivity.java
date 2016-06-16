package com.wordpress.httpseliminatorgang.mymedicine;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Cedric on 04.06.2016.
 */
public class GoodBonesActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_good_bones);


    }

    public void PlayText2(View view) {
        MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.good_bones);
        mp.start();
    }
}
