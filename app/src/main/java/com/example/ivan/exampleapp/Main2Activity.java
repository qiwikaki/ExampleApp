package com.example.ivan.exampleapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static java.lang.Math.sin;

public class Main2Activity extends AppCompatActivity {

    private Button act_change2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        addListenerOnButton2();
    }

    public void addListenerOnButton2 () {
        act_change2 = (Button)findViewById(R.id.act_change2);
        act_change2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        EditText kurs11 = (EditText)findViewById(R.id.editText11);
                        EditText kurs12 = (EditText)findViewById(R.id.editText12);
                        EditText kurs13 = (EditText)findViewById(R.id.editText13);
                        EditText kurs14 = (EditText)findViewById(R.id.editText14);
                        EditText kurs15 = (EditText)findViewById(R.id.editText15);
                        EditText kurs16 = (EditText)findViewById(R.id.editText16);
                        EditText kurs17 = (EditText)findViewById(R.id.editText17);
                        EditText kurs18 = (EditText)findViewById(R.id.editText18);

                        EditText kurs21 = (EditText)findViewById(R.id.editText21);
                        EditText kurs22 = (EditText)findViewById(R.id.editText22);
                        EditText kurs23 = (EditText)findViewById(R.id.editText23);
                        EditText kurs24 = (EditText)findViewById(R.id.editText24);
                        EditText kurs25 = (EditText)findViewById(R.id.editText25);
                        EditText kurs26 = (EditText)findViewById(R.id.editText26);
                        EditText kurs27 = (EditText)findViewById(R.id.editText27);
                        EditText kurs28 = (EditText)findViewById(R.id.editText28);



                        Intent intent = new Intent(Main2Activity.this, Main3Activity.class);

                        intent.putExtra("kurs11", kurs11.getText().toString());
                        intent.putExtra("kurs12", kurs12.getText().toString());
                        intent.putExtra("kurs13", kurs13.getText().toString());
                        intent.putExtra("kurs14", kurs14.getText().toString());
                        intent.putExtra("kurs15", kurs15.getText().toString());
                        intent.putExtra("kurs16", kurs16.getText().toString());
                        intent.putExtra("kurs17", kurs17.getText().toString());
                        intent.putExtra("kurs18", kurs18.getText().toString());

                        intent.putExtra("kurs21", kurs21.getText().toString());
                        intent.putExtra("kurs22", kurs22.getText().toString());
                        intent.putExtra("kurs23", kurs23.getText().toString());
                        intent.putExtra("kurs24", kurs24.getText().toString());
                        intent.putExtra("kurs25", kurs25.getText().toString());
                        intent.putExtra("kurs26", kurs26.getText().toString());
                        intent.putExtra("kurs27", kurs27.getText().toString());
                        intent.putExtra("kurs28", kurs28.getText().toString());

                        startActivity(intent);
                    }
                }
        );
    }
}
