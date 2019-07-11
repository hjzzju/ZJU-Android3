package com.hjz.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText edittext;
    private Button button1, button2, button3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = (Button) findViewById(R.id.main_button1);
        button1.setText("Recycler");
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, RcmdActivity.class);
                startActivity(i);
            }
        });

        button2 = (Button) findViewById(R.id.main_button2);
        button2.setText("Fragment");
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, FragActivity.class);
                startActivity(i);
            }
        });

        button3 = (Button) findViewById(R.id.main_button3);
        button3.setText("ClockView");
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, ClockActivity.class);
                startActivity(i);
            }
        });
    }


}
