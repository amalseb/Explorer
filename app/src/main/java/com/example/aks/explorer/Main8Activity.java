package com.example.aks.explorer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Main8Activity extends AppCompatActivity {
    ImageView im11;
    ImageView im22;
    ImageView im33;
    ImageView im44;
    ImageView im55;
    ImageView im66;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_8realhome);
        im11=(ImageView) findViewById(R.id.topspots);
        im22=(ImageView) findViewById(R.id.campping);
        im33=(ImageView) findViewById(R.id.adventure);
        im44=(ImageView) findViewById(R.id.beach);
        im55=(ImageView) findViewById(R.id.jungle);
        im66=(ImageView) findViewById(R.id.allspots);

        im11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view11) {
                Intent intent11 = new Intent(Main8Activity.this,
                        Main9Activity.class);
                startActivity(intent11);
            }
        });
        im22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view22) {
                Intent intent22 = new Intent(Main8Activity.this,
                        Main10Activity.class);
                startActivity(intent22);
            }
        });
        im33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view33) {
                Intent intent33 = new Intent(Main8Activity.this,
                        Main11Activity.class);
                startActivity(intent33);
            }
        });
        im44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view44) {
                Intent intent44 = new Intent(Main8Activity.this,
                        Main12Activity.class);
                startActivity(intent44);
            }
        });
        im55.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view55) {
                Intent intent55 = new Intent(Main8Activity.this,
                        Main13Activity.class);
                startActivity(intent55);
            }
        });
        im66.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view66) {
                Intent intent66 = new Intent(Main8Activity.this,
                        Main2Activity.class);
                startActivity(intent66);
            }
        });

    }
}
