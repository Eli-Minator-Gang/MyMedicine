package com.wordpress.httpseliminatorgang.mymedicine;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Cedric on 07.06.2016.
 */
public class MyProfileActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_profile);


    }

    public void OpenBrowserProfile(View view) {
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mainboardprozessor.jimdo.com/"));
        startActivity(i);
    }
}
