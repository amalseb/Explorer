package com.example.aks.explorer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Main10Activity extends AppCompatActivity {
    ImageView im221;
    ImageView im222;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_10camp);
        im221=(ImageView) findViewById(R.id.mun);
        im222=(ImageView) findViewById(R.id.vag);

        im221.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view221) {
                Intent intent221 = new Intent(Main10Activity.this,
                        Main3Activity.class);
                startActivity(intent221);
            }
        });

        im222.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view222) {
                Intent intent222 = new Intent(Main10Activity.this,
                        Main4Activity.class);
                startActivity(intent222);
            }
        });
    }
}
