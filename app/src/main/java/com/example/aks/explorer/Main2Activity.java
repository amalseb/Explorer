package com.example.aks.explorer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class Main2Activity extends AppCompatActivity {
    ImageView im1;
    ImageView im2;
    ImageView im3;
    ImageView im4;
    ImageView im5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2home);
        im1=(ImageView) findViewById(R.id.mun);
        im2=(ImageView) findViewById(R.id.vag);
        im3=(ImageView) findViewById(R.id.koc);
        im4=(ImageView) findViewById(R.id.kot);
        im5=(ImageView) findViewById(R.id.alp);

        im1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view1) {
                Intent intent1 = new Intent(Main2Activity.this,
                        Main3Activity.class);
                startActivity(intent1);
            }
        });

        im2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view2) {
                Intent intent2 = new Intent(Main2Activity.this,
                        Main4Activity.class);
                startActivity(intent2);
            }
        });
        im3.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view3) {
                Intent intent3 = new Intent(Main2Activity.this,
                        Main5Activity.class);
                startActivity(intent3);
            }
        });
        im4.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view4) {
                Intent intent4 = new Intent(Main2Activity.this,
                        Main6Activity.class);
                startActivity(intent4);
            }
        });
        im5.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view5) {
                Intent intent5 = new Intent(Main2Activity.this,
                        Main7Activity.class);
                startActivity(intent5);
            }
        });
    }
}
