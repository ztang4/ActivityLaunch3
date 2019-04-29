package com.example.activitylaunch;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;


import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import android.util.Log;

public class FirstActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.e("FirstActivity", "FirstActivity的TaskID：" + getTaskId());

        setContentView(R.layout.activity_first);
        Button btnSecond = findViewById(R.id.btn_start_second);
        btnSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                byte[] bytes = new byte[]{0x00,0x01,0x02,0x03,0x04,0x05};
                com.example.activitylaunch.serial.SerialPort serialttyS1;
                //OutputStream ttyS1OutputStream;
                try {

                    serialttyS1 = new com.example.activitylaunch.serial.SerialPort(new File("/dev/ttyS0 "),115200,0);
                    //ttyS1OutputStream = serialttyS1.getOutputStream();
                    //ttyS1OutputStream.write(bytes);
                }catch (IOException e) {
                    e.printStackTrace();
                    Intent intent = new Intent(FirstActivity.this,SecondActivity.class);
                    //startActivity(intent);
                }


            }
        });
    }
}
