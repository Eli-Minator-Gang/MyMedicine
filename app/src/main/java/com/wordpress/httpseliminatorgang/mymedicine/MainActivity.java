package com.wordpress.httpseliminatorgang.mymedicine;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

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
                startActivity(new Intent(MainActivity.this, QRCodeActivity.class));
            }
        });
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

        return super.onOptionsItemSelected(item);
    }
}
