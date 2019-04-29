package com.example.activitylaunch;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.e("SecondActivity", "SecondActivity的TaskID：" + getTaskId());

        setContentView(R.layout.activity_second);
        Button btnRestart = findViewById(R.id.btn_restart_second);
        btnRestart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this,SecondActivity.class);
                startActivity(intent);
            }
        });
        Button btnStartThird = findViewById(R.id.btn_start_third);
        btnStartThird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);
                startActivity(intent);
            }
        });
    }
}
