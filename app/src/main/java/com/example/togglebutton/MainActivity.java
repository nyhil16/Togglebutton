package com.example.togglebutton;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    private ToggleButton tb;
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tb = (ToggleButton) findViewById(R.id.toggleButton);
        tv = (TextView) findViewById(R.id.txtLabel);
    }

    public void cambiar(View view) {
        if(tb.isChecked()) {
            tv.setText("ACTIVADO");
            tv.setTextColor(Color.parseColor("#14f000"));
        } else {
            tv.setText("DESACTIVADO");
            tv.setTextColor(Color.parseColor("#f0000c"));
        }
    }
}