package com.example.aks.explorer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Main9Activity extends AppCompatActivity {
    ImageView im111;
    ImageView im112;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_9top);
        im111=(ImageView) findViewById(R.id.mun);
        im112=(ImageView) findViewById(R.id.vag);

        im111.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view111) {
                Intent intent111 = new Intent(Main9Activity.this,
                        Main3Activity.class);
                startActivity(intent111);
            }
        });

        im112.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view112) {
                Intent intent112 = new Intent(Main9Activity.this,
                        Main4Activity.class);
                startActivity(intent112);
            }
        });
    }
}
