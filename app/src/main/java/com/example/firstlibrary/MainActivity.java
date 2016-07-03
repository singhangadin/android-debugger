package com.example.firstlibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import io.github.angads25.debugger.Debugger;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Debugger bugger=Debugger.getInstance();
        bugger.e("TAG","Log Message");
    }
}
