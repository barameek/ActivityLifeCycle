package com.mycompany.activitylifecycle;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), SecondActivity.class);
                startActivity(i);
            }
        });

        Log.i("Baramee","onCreate");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.i("Baramee","onDestroy");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.i("Baramee","onPause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Log.i("Baramee","onRestart");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.i("Baramee","onStop");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();

        Log.i("Baramee","onPostResume");
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();

        Log.i("Baramee","onBackPressed");

    }







}
