package com.example.ivan.exampleapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button act_change;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButton ();
    }

    public void addListenerOnButton () {
        act_change = (Button)findViewById(R.id.act_change);
        act_change.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent1 = new Intent(MainActivity.this, Main2Activity.class);
                        startActivity(intent1);
                    }
                }
        );
    }
}
