package com.example.afinal;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class optionActivity extends Activity {
    Button mybt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        mybt = (Button) findViewById(R.id.ok);
        mybt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
