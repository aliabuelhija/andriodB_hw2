package com.example.toasttest;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.toast_instyle.StyleToast;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialiseViews();

    }

    private void initialiseViews() {

        Button btnDefault = findViewById(R.id.btnDefault);
        btnDefault.setOnClickListener(this);

        Button btnSuccess = findViewById(R.id.btnSuccess);
        btnSuccess.setOnClickListener(this);

        Button btnError = findViewById(R.id.btnError);
        btnError.setOnClickListener(this);

        Button btnWarning = findViewById(R.id.btnWarning);
        btnWarning.setOnClickListener(this);

        Button btnInfo = findViewById(R.id.btnInfo);
        btnInfo.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btnDefault) {
            StyleToast.makeText(this, Toast.LENGTH_SHORT,R.layout.toast,"Hey to my Toast").show();
        } else if (view.getId() == R.id.btnSuccess) {
            StyleToast.makeText(this, Toast.LENGTH_SHORT, StyleToast.SUCCESS,"Toast is working",false).show();
        } else if (view.getId() == R.id.btnError) {
            StyleToast.makeText(this, Toast.LENGTH_SHORT, StyleToast.ERROR,"Username is not valid",false).show();
        } else if (view.getId() == R.id.btnWarning) {
            StyleToast.makeText(this, Toast.LENGTH_SHORT, StyleToast.WARNING,"Out Of Memory",false).show();
        } else if (view.getId() == R.id.btnInfo) {
            StyleToast.makeText(this, Toast.LENGTH_SHORT, StyleToast.INFO,"This is a customised Toast",false).show();
        }
    }


}