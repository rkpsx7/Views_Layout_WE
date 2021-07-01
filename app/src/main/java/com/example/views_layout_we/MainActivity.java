package com.example.views_layout_we;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button mBTnGo1;
    private Button mBTnGo2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();

        mBTnGo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Layout_1_Activity.class);
                startActivity(intent);
            }
        });

        mBTnGo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(),Layout_2_Activity.class);
                startActivity(intent);
            }
        });
    }

    private void initViews() {
        mBTnGo1 = findViewById(R.id.btnGo1);
        mBTnGo2 = findViewById(R.id.btnGo2);
    }
}