package com.example.aks.explorer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Main13Activity extends AppCompatActivity {
    ImageView im551;
    ImageView im552;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_13forest);
        im551=(ImageView) findViewById(R.id.vag);
        im552=(ImageView) findViewById(R.id.alp);

        im551.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view551) {
                Intent intent551 = new Intent(Main13Activity.this,
                        Main4Activity.class);
                startActivity(intent551);
            }
        });
        im552.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view552) {
                Intent intent552 = new Intent(Main13Activity.this,
                        Main7Activity.class);
                startActivity(intent552);
            }
        });
    }
}
