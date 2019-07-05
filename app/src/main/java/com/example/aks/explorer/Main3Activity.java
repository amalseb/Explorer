package com.example.aks.explorer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3munnar);
        TextView text1=(TextView) findViewById(R.id.lnkmun);
        text1.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
