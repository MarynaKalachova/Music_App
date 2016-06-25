package com.example.android.mymusicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.view.View.OnClickListener;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView offline = (TextView) findViewById(R.id.offline_category);

        offline.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent offlineIntent = new Intent (MainActivity.this, OfflineActivity.class);
                startActivity(offlineIntent);
            }
        });
    }
}
