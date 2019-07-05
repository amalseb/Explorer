package com.example.aks.explorer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Main11Activity extends AppCompatActivity {
    ImageView im331;
    ImageView im332;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_11adventure);
        im331=(ImageView) findViewById(R.id.vag);
        im332=(ImageView) findViewById(R.id.kot);

        im331.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view331) {
                Intent intent331 = new Intent(Main11Activity.this,
                        Main4Activity.class);
                startActivity(intent331);
            }
        });
        im332.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view332) {
                Intent intent332 = new Intent(Main11Activity.this,
                        Main6Activity.class);
                startActivity(intent332);
            }
        });
    }
}
