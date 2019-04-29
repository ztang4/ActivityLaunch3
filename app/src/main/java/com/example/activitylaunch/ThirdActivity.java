package com.example.activitylaunch;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class ThirdActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.e("ThirdActivity", "ThirdActivity的TaskID：" + getTaskId());

        setContentView(R.layout.activity_third);
        Button btnStartSecond = findViewById(R.id.btn3_start_second);
        btnStartSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ThirdActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });
    }
}

