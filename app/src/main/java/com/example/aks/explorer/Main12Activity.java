package com.example.aks.explorer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Main12Activity extends AppCompatActivity {
    ImageView im441;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_12beach);
        im441=(ImageView) findViewById(R.id.koc);

        im441.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view441) {
                Intent intent441 = new Intent(Main12Activity.this,
                        Main5Activity.class);
                startActivity(intent441);
            }
        });
    }
}
