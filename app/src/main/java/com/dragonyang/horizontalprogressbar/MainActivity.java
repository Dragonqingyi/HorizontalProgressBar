package com.dragonyang.horizontalprogressbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {
    ProgressBar bar1,bar2,bar3;
    Button b1,b2,b3,b4,b5,b6,s1,s2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bar1 = findViewById(R.id.proBar1);
        bar2 = findViewById(R.id.proBar2);
        bar3 = findViewById(R.id.proBar3);

        b1 = findViewById(R.id.dec1);
        b2 = findViewById(R.id.plus1);
        b3 = findViewById(R.id.dec2);
        b4 = findViewById(R.id.plus2);
        b5 = findViewById(R.id.dec3);
        b6 = findViewById(R.id.plus3);
        s1 = findViewById(R.id.s1);
        s2 = findViewById(R.id.s2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bar1.incrementProgressBy(-1);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bar1.incrementProgressBy(1);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bar2.incrementProgressBy(-1);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bar2.incrementProgressBy(1);
            }
        });
        s1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bar2.incrementSecondaryProgressBy(-1);
            }
        });
        s2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bar2.incrementSecondaryProgressBy(1);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bar3.incrementProgressBy(-1);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bar3.incrementProgressBy(1);
            }
        });
    }
}
