package com.wordpress.httpseliminatorgang.mymedicine;

import android.Manifest;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final int REQUEST_CAMERA = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ActivityCompat.checkSelfPermission(MainActivity.this, Manifest.permission.CAMERA)
                        != PackageManager.PERMISSION_GRANTED) {
                    // Camera permission has not been granted.

                    requestCameraPermission();

                } else {

                    // Camera permissions is already available, show the camera preview.
                    startActivity(new Intent(MainActivity.this, QRCodeActivity.class));
                }

            }
        });
    }

    private void requestCameraPermission() {

        // BEGIN_INCLUDE(camera_permission_request)
        if (ActivityCompat.shouldShowRequestPermissionRationale(this,
                Manifest.permission.CAMERA)) {
            // Provide an additional rationale to the user if the permission was not granted
            // and the user would benefit from additional context for the use of the permission.
            // For example if the user has previously denied the permission.

            Toast.makeText(getApplicationContext(), ("Caution: On Android 6 the camera does not work on some devices!!! To scan the QR code you need the camera."), Toast.LENGTH_LONG).show();

            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.CAMERA},
                    REQUEST_CAMERA);
        } else {

            // Camera permission has not been granted yet. Request it directly.
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.CAMERA},
                    REQUEST_CAMERA);
        }
        // END_INCLUDE(camera_permission_request)
    }
    public void openNewActivity1(View view) {
        Intent intent = new Intent(this, BloodPressureBlockerActivity.class);
        startActivity(intent);
    }
    public void openNewActivity2(View view) {
        Intent intent = new Intent(this, GoodBonesActivity.class);
        startActivity(intent);
    }public void openNewActivity3(View view) {
        Intent intent = new Intent(this, AthletesFoodActivity.class);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_profile) {
            startActivity(new Intent(MainActivity.this, MyProfileActivity.class));
            return true;
        }
        if (id == R.id.action_imprint) {
            startActivity(new Intent(MainActivity.this, ImprintActivity.class));
            return true;
        }
        if (id == R.id.action_contact) {
            Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mainboardprozessor.jimdo.com/contact/"));
            startActivity(i);
        }

        return super.onOptionsItemSelected(item);
    }
}
