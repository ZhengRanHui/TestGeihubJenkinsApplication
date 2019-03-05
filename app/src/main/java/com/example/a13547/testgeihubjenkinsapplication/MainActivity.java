package com.example.a13547.testgeihubjenkinsapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView main_act_tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        main_act_tv = findViewById(R.id.main_act_tv);

        main_act_tv.setText("second commit");
    }
}
