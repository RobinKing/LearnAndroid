package com.robincn.broadcastbestpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button forceOffline = (Button) findViewById(R.id.force_offline);
        forceOffline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("com.robincn.broadcastbestpractice.FORCE_OFFLINE");
                intent.setComponent(new ComponentName("com.robincn.broadcastbestpractice",
                        "com.robincn.broadcastbestpractice.BaseActivity"));
                sendBroadcast(intent);
            }
        });
    }
}
