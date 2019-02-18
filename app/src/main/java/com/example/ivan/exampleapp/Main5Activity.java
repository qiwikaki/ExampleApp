package com.example.ivan.exampleapp;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class Main5Activity extends AppCompatActivity {
//Переделать нахрен это по стандарту

    /*double RuOnDelta0,RuOnDelta15,RuOnDelta30,RuOnDelta45,RuOnDelta60,RuOnDelta75,RuOnDelta90,RuOnDelta105,
            RuOnDelta120,RuOnDelta135,RuOnDelta150,RuOnDelta165,RuOnDelta180,RuOnDelta195,RuOnDelta210,RuOnDelta225,
            RuOnDelta240,RuOnDelta255,RuOnDelta270,RuOnDelta285,RuOnDelta300,RuOnDelta315,RuOnDelta330,RuOnDelta345,RuOnDelta360;

    double RuOffDelta0,RuOffDelta15,RuOffDelta30,RuOffDelta45,RuOffDelta60,RuOffDelta75,RuOffDelta90,
            RuOffDelta105,RuOffDelta120,RuOffDelta135,RuOffDelta150,RuOffDelta165,RuOffDelta180,RuOffDelta195,
            RuOffDelta210,RuOffDelta225,RuOffDelta240,RuOffDelta255,RuOffDelta270,RuOffDelta285,RuOffDelta300,
            RuOffDelta315,RuOffDelta330,RuOffDelta345,RuOffDelta360;*/

    private Button graph, calculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        addListenerOnButton ();


        Intent intentTable = getIntent();


        Double RuOnDelta0 = intentTable.getDoubleExtra("RuOnDelta0",0);
        Double RuOnDelta15 = intentTable.getDoubleExtra("RuOnDelta15",0);
        Double RuOnDelta30 = intentTable.getDoubleExtra("RuOnDelta30",0);
        Double RuOnDelta45 = intentTable.getDoubleExtra("RuOnDelta45",0);
        Double RuOnDelta60 = intentTable.getDoubleExtra("RuOnDelta60",0);
        Double RuOnDelta75 = intentTable.getDoubleExtra("RuOnDelta75",0);
        Double RuOnDelta90 = intentTable.getDoubleExtra("RuOnDelta90",0);
        Double RuOnDelta105 = intentTable.getDoubleExtra("RuOnDelta105",0);
        Double RuOnDelta120 = intentTable.getDoubleExtra("RuOnDelta120",0);
        Double RuOnDelta135 = intentTable.getDoubleExtra("RuOnDelta135",0);
        Double RuOnDelta150 = intentTable.getDoubleExtra("RuOnDelta150",0);
        Double RuOnDelta165 = intentTable.getDoubleExtra("RuOnDelta165",0);
        Double RuOnDelta180 = intentTable.getDoubleExtra("RuOnDelta180",0);
        Double RuOnDelta195 = intentTable.getDoubleExtra("RuOnDelta195",0);
        Double RuOnDelta210 = intentTable.getDoubleExtra("RuOnDelta210",0);
        Double RuOnDelta225 = intentTable.getDoubleExtra("RuOnDelta225",0);
        Double RuOnDelta240 = intentTable.getDoubleExtra("RuOnDelta240",0);
        Double RuOnDelta255 = intentTable.getDoubleExtra("RuOnDelta255",0);
        Double RuOnDelta270 = intentTable.getDoubleExtra("RuOnDelta270",0);
        Double RuOnDelta285 = intentTable.getDoubleExtra("RuOnDelta285",0);
        Double RuOnDelta300 = intentTable.getDoubleExtra("RuOnDelta300",0);
        Double RuOnDelta315 = intentTable.getDoubleExtra("RuOnDelta315",0);
        Double RuOnDelta330 = intentTable.getDoubleExtra("RuOnDelta330",0);
        Double RuOnDelta345 = intentTable.getDoubleExtra("RuOnDelta345",0);
        Double RuOnDelta360 = intentTable.getDoubleExtra("RuOnDelta360",0);

        Double RuOffDelta0 = intentTable.getDoubleExtra("RuOffDelta0",0);
        Double RuOffDelta15 = intentTable.getDoubleExtra("RuOffDelta15",0);
        Double RuOffDelta30 = intentTable.getDoubleExtra("RuOffDelta30",0);
        Double RuOffDelta45 = intentTable.getDoubleExtra("RuOffDelta45",0);
        Double RuOffDelta60 = intentTable.getDoubleExtra("RuOffDelta60",0);
        Double RuOffDelta75 = intentTable.getDoubleExtra("RuOffDelta75",0);
        Double RuOffDelta90 = intentTable.getDoubleExtra("RuOffDelta90",0);
        Double RuOffDelta105 = intentTable.getDoubleExtra("RuOffDelta105",0);
        Double RuOffDelta120 = intentTable.getDoubleExtra("RuOffDelta120",0);
        Double RuOffDelta135 = intentTable.getDoubleExtra("RuOffDelta135",0);
        Double RuOffDelta150 = intentTable.getDoubleExtra("RuOffDelta150",0);
        Double RuOffDelta165 = intentTable.getDoubleExtra("RuOffDelta165",0);
        Double RuOffDelta180 = intentTable.getDoubleExtra("RuOffDelta180",0);
        Double RuOffDelta195 = intentTable.getDoubleExtra("RuOffDelta195",0);
        Double RuOffDelta210 = intentTable.getDoubleExtra("RuOffDelta210",0);
        Double RuOffDelta225 = intentTable.getDoubleExtra("RuOffDelta225",0);
        Double RuOffDelta240 = intentTable.getDoubleExtra("RuOffDelta240",0);
        Double RuOffDelta255 = intentTable.getDoubleExtra("RuOffDelta255",0);
        Double RuOffDelta270 = intentTable.getDoubleExtra("RuOffDelta270",0);
        Double RuOffDelta285 = intentTable.getDoubleExtra("RuOffDelta285",0);
        Double RuOffDelta300 = intentTable.getDoubleExtra("RuOffDelta300",0);
        Double RuOffDelta315 = intentTable.getDoubleExtra("RuOffDelta315",0);
        Double RuOffDelta330 = intentTable.getDoubleExtra("RuOffDelta330",0);
        Double RuOffDelta345 = intentTable.getDoubleExtra("RuOffDelta345",0);
        Double RuOffDelta360 = intentTable.getDoubleExtra("RuOffDelta360",0);

        String ka1 = intentTable.getStringExtra("ka1");
        String ka2 = intentTable.getStringExtra("ka2");

        //Double ka2 = intentTable.getDoubleExtra("A2", 0);


        TextView textResult11 = (TextView)findViewById(R.id.result11);
        TextView textResult12 = (TextView)findViewById(R.id.result12);
        TextView textResult13 = (TextView)findViewById(R.id.result13);
        TextView textResult14 = (TextView)findViewById(R.id.result14);
        TextView textResult15 = (TextView)findViewById(R.id.result15);
        TextView textResult16 = (TextView)findViewById(R.id.result16);
        TextView textResult17 = (TextView)findViewById(R.id.result17);
        TextView textResult18 = (TextView)findViewById(R.id.result18);
        TextView textResult19 = (TextView)findViewById(R.id.result19);
        TextView textResult110 = (TextView)findViewById(R.id.result110);
        TextView textResult111 = (TextView)findViewById(R.id.result111);
        TextView textResult112 = (TextView)findViewById(R.id.result112);
        TextView textResult113 = (TextView)findViewById(R.id.result113);
        TextView textResult114 = (TextView)findViewById(R.id.result114);
        TextView textResult115 = (TextView)findViewById(R.id.result115);
        TextView textResult116 = (TextView)findViewById(R.id.result116);
        TextView textResult117 = (TextView)findViewById(R.id.result117);
        TextView textResult118 = (TextView)findViewById(R.id.result118);
        TextView textResult119 = (TextView)findViewById(R.id.result119);
        TextView textResult120 = (TextView)findViewById(R.id.result120);
        TextView textResult121 = (TextView)findViewById(R.id.result121);
        TextView textResult122 = (TextView)findViewById(R.id.result122);
        TextView textResult123 = (TextView)findViewById(R.id.result123);
        TextView textResult124 = (TextView)findViewById(R.id.result124);
        TextView textResult125 = (TextView)findViewById(R.id.result125);

        TextView textResult21 = (TextView)findViewById(R.id.result21);
        TextView textResult22 = (TextView)findViewById(R.id.result22);
        TextView textResult23 = (TextView)findViewById(R.id.result23);
        TextView textResult24 = (TextView)findViewById(R.id.result24);
        TextView textResult25 = (TextView)findViewById(R.id.result25);
        TextView textResult26 = (TextView)findViewById(R.id.result26);
        TextView textResult27 = (TextView)findViewById(R.id.result27);
        TextView textResult28 = (TextView)findViewById(R.id.result28);
        TextView textResult29 = (TextView)findViewById(R.id.result29);
        TextView textResult210 = (TextView)findViewById(R.id.result210);
        TextView textResult211 = (TextView)findViewById(R.id.result211);
        TextView textResult212 = (TextView)findViewById(R.id.result212);
        TextView textResult213 = (TextView)findViewById(R.id.result213);
        TextView textResult214 = (TextView)findViewById(R.id.result214);
        TextView textResult215 = (TextView)findViewById(R.id.result215);
        TextView textResult216 = (TextView)findViewById(R.id.result216);
        TextView textResult217 = (TextView)findViewById(R.id.result217);
        TextView textResult218 = (TextView)findViewById(R.id.result218);
        TextView textResult219 = (TextView)findViewById(R.id.result219);
        TextView textResult220 = (TextView)findViewById(R.id.result220);
        TextView textResult221 = (TextView)findViewById(R.id.result221);
        TextView textResult222 = (TextView)findViewById(R.id.result222);
        TextView textResult223 = (TextView)findViewById(R.id.result223);
        TextView textResult224 = (TextView)findViewById(R.id.result224);
        TextView textResult225 = (TextView)findViewById(R.id.result225);

        TextView resultA1 = (TextView)findViewById(R.id.A1);
        TextView resultA2 = (TextView)findViewById(R.id.A2);


        resultA1.setText(ka1);
        resultA2.setText(ka2);
       // resultA2.setText(new DecimalFormat("##.##").format(ka2));

        DecimalFormatSymbols otherSymbols = new DecimalFormatSymbols(Locale.US);
        String pattern = "##0.0";
        DecimalFormat decimalFormat = new DecimalFormat(pattern, otherSymbols);



        textResult11.setText(decimalFormat.format(RuOnDelta0));
        textResult12.setText(decimalFormat.format(RuOnDelta15));
        textResult13.setText(decimalFormat.format(RuOnDelta30));
        textResult14.setText(decimalFormat.format(RuOnDelta45));
        textResult15.setText(decimalFormat.format(RuOnDelta60));
        textResult16.setText(decimalFormat.format(RuOnDelta75));
        textResult17.setText(decimalFormat.format(RuOnDelta90));
        textResult18.setText(decimalFormat.format(RuOnDelta105));
        textResult19.setText(decimalFormat.format(RuOnDelta120));
        textResult110.setText(decimalFormat.format(RuOnDelta135));
        textResult111.setText(decimalFormat.format(RuOnDelta150));
        textResult112.setText(decimalFormat.format(RuOnDelta165));
        textResult113.setText(decimalFormat.format(RuOnDelta180));
        textResult114.setText(decimalFormat.format(RuOnDelta195));
        textResult115.setText(decimalFormat.format(RuOnDelta210));
        textResult116.setText(decimalFormat.format(RuOnDelta225));
        textResult117.setText(decimalFormat.format(RuOnDelta240));
        textResult118.setText(decimalFormat.format(RuOnDelta255));
        textResult119.setText(decimalFormat.format(RuOnDelta270));
        textResult120.setText(decimalFormat.format(RuOnDelta285));
        textResult121.setText(decimalFormat.format(RuOnDelta300));
        textResult122.setText(decimalFormat.format(RuOnDelta315));
        textResult123.setText(decimalFormat.format(RuOnDelta330));
        textResult124.setText(decimalFormat.format(RuOnDelta345));
        textResult125.setText(decimalFormat.format(RuOnDelta360));

        textResult21.setText(decimalFormat.format(RuOffDelta0));
        textResult22.setText(decimalFormat.format(RuOffDelta15));
        textResult23.setText(decimalFormat.format(RuOffDelta30));
        textResult24.setText(decimalFormat.format(RuOffDelta45));
        textResult25.setText(decimalFormat.format(RuOffDelta60));
        textResult26.setText(decimalFormat.format(RuOffDelta75));
        textResult27.setText(decimalFormat.format(RuOffDelta90));
        textResult28.setText(decimalFormat.format(RuOffDelta105));
        textResult29.setText(decimalFormat.format(RuOffDelta120));
        textResult210.setText(decimalFormat.format(RuOffDelta135));
        textResult211.setText(decimalFormat.format(RuOffDelta150));
        textResult212.setText(decimalFormat.format(RuOffDelta165));
        textResult213.setText(decimalFormat.format(RuOffDelta180));
        textResult214.setText(decimalFormat.format(RuOffDelta195));
        textResult215.setText(decimalFormat.format(RuOffDelta210));
        textResult216.setText(decimalFormat.format(RuOffDelta225));
        textResult217.setText(decimalFormat.format(RuOffDelta240));
        textResult218.setText(decimalFormat.format(RuOffDelta255));
        textResult219.setText(decimalFormat.format(RuOffDelta270));
        textResult220.setText(decimalFormat.format(RuOffDelta285));
        textResult221.setText(decimalFormat.format(RuOffDelta300));
        textResult222.setText(decimalFormat.format(RuOffDelta315));
        textResult223.setText(decimalFormat.format(RuOffDelta330));
        textResult224.setText(decimalFormat.format(RuOffDelta345));
        textResult225.setText(decimalFormat.format(RuOffDelta360));
    }

    public void addListenerOnButton () {

        graph = (Button)findViewById(R.id.graph);
        calculate = (Button)findViewById(R.id.calculateButton);

        graph.setOnClickListener (
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Intent intentGraph = new Intent(Main5Activity.this, Main4Activity.class);

                        TextView textResult11 = (TextView)findViewById(R.id.result11);
                        TextView textResult12 = (TextView)findViewById(R.id.result12);
                        TextView textResult13 = (TextView)findViewById(R.id.result13);
                        TextView textResult14 = (TextView)findViewById(R.id.result14);
                        TextView textResult15 = (TextView)findViewById(R.id.result15);
                        TextView textResult16 = (TextView)findViewById(R.id.result16);
                        TextView textResult17 = (TextView)findViewById(R.id.result17);
                        TextView textResult18 = (TextView)findViewById(R.id.result18);
                        TextView textResult19 = (TextView)findViewById(R.id.result19);
                        TextView textResult110 = (TextView)findViewById(R.id.result110);
                        TextView textResult111 = (TextView)findViewById(R.id.result111);
                        TextView textResult112 = (TextView)findViewById(R.id.result112);
                        TextView textResult113 = (TextView)findViewById(R.id.result113);
                        TextView textResult114 = (TextView)findViewById(R.id.result114);
                        TextView textResult115 = (TextView)findViewById(R.id.result115);
                        TextView textResult116 = (TextView)findViewById(R.id.result116);
                        TextView textResult117 = (TextView)findViewById(R.id.result117);
                        TextView textResult118 = (TextView)findViewById(R.id.result118);
                        TextView textResult119 = (TextView)findViewById(R.id.result119);
                        TextView textResult120 = (TextView)findViewById(R.id.result120);
                        TextView textResult121 = (TextView)findViewById(R.id.result121);
                        TextView textResult122 = (TextView)findViewById(R.id.result122);
                        TextView textResult123 = (TextView)findViewById(R.id.result123);
                        TextView textResult124 = (TextView)findViewById(R.id.result124);
                        TextView textResult125 = (TextView)findViewById(R.id.result125);

                        TextView textResult21 = (TextView)findViewById(R.id.result21);
                        TextView textResult22 = (TextView)findViewById(R.id.result22);
                        TextView textResult23 = (TextView)findViewById(R.id.result23);
                        TextView textResult24 = (TextView)findViewById(R.id.result24);
                        TextView textResult25 = (TextView)findViewById(R.id.result25);
                        TextView textResult26 = (TextView)findViewById(R.id.result26);
                        TextView textResult27 = (TextView)findViewById(R.id.result27);
                        TextView textResult28 = (TextView)findViewById(R.id.result28);
                        TextView textResult29 = (TextView)findViewById(R.id.result29);
                        TextView textResult210 = (TextView)findViewById(R.id.result210);
                        TextView textResult211 = (TextView)findViewById(R.id.result211);
                        TextView textResult212 = (TextView)findViewById(R.id.result212);
                        TextView textResult213 = (TextView)findViewById(R.id.result213);
                        TextView textResult214 = (TextView)findViewById(R.id.result214);
                        TextView textResult215 = (TextView)findViewById(R.id.result215);
                        TextView textResult216 = (TextView)findViewById(R.id.result216);
                        TextView textResult217 = (TextView)findViewById(R.id.result217);
                        TextView textResult218 = (TextView)findViewById(R.id.result218);
                        TextView textResult219 = (TextView)findViewById(R.id.result219);
                        TextView textResult220 = (TextView)findViewById(R.id.result220);
                        TextView textResult221 = (TextView)findViewById(R.id.result221);
                        TextView textResult222 = (TextView)findViewById(R.id.result222);
                        TextView textResult223 = (TextView)findViewById(R.id.result223);
                        TextView textResult224 = (TextView)findViewById(R.id.result224);
                        TextView textResult225 = (TextView)findViewById(R.id.result225);



                  /*double example1 = 0.5;
                  double example2 = 1.2;
                  intentGraph.putExtra("price",example1);
                  intentGraph.putExtra("price2",example2);*/


                  /*double RuOnDelta0 = Double.parseDouble(textResult11.getText().toString());
                  intentGraph.putExtra("price",RuOnDelta0);
                  double RuOnDelta15 = Double.parseDouble(textResult12.getText().toString());
                  intentGraph.putExtra("price2",RuOnDelta15);*/

                        intentGraph.putExtra("RuOnDelta0",textResult11 .getText().toString());
                        intentGraph.putExtra("RuOnDelta15",textResult12 .getText().toString());
                        intentGraph.putExtra("RuOnDelta30",textResult13 .getText().toString());
                        intentGraph.putExtra("RuOnDelta45",textResult14 .getText().toString());
                        intentGraph.putExtra("RuOnDelta60",textResult15 .getText().toString());
                        intentGraph.putExtra("RuOnDelta75",textResult16 .getText().toString());
                        intentGraph.putExtra("RuOnDelta90",textResult17 .getText().toString());
                        intentGraph.putExtra("RuOnDelta105",textResult18 .getText().toString());
                        intentGraph.putExtra("RuOnDelta120",textResult19 .getText().toString());
                        intentGraph.putExtra("RuOnDelta135",textResult110 .getText().toString());
                        intentGraph.putExtra("RuOnDelta150",textResult111 .getText().toString());
                        intentGraph.putExtra("RuOnDelta165",textResult112 .getText().toString());
                        intentGraph.putExtra("RuOnDelta180",textResult113 .getText().toString());
                        intentGraph.putExtra("RuOnDelta195",textResult114 .getText().toString());
                        intentGraph.putExtra("RuOnDelta210",textResult115 .getText().toString());
                        intentGraph.putExtra("RuOnDelta225",textResult116 .getText().toString());
                        intentGraph.putExtra("RuOnDelta240",textResult117 .getText().toString());
                        intentGraph.putExtra("RuOnDelta255",textResult118 .getText().toString());
                        intentGraph.putExtra("RuOnDelta270",textResult119 .getText().toString());
                        intentGraph.putExtra("RuOnDelta285",textResult120 .getText().toString());
                        intentGraph.putExtra("RuOnDelta300",textResult121 .getText().toString());
                        intentGraph.putExtra("RuOnDelta315",textResult122 .getText().toString());
                        intentGraph.putExtra("RuOnDelta330",textResult123 .getText().toString());
                        intentGraph.putExtra("RuOnDelta345",textResult124 .getText().toString());
                        intentGraph.putExtra("RuOnDelta360",textResult125 .getText().toString());

                        intentGraph.putExtra("RuOffDelta0",textResult21 .getText().toString());
                        intentGraph.putExtra("RuOffDelta15",textResult22 .getText().toString());
                        intentGraph.putExtra("RuOffDelta30",textResult23 .getText().toString());
                        intentGraph.putExtra("RuOffDelta45",textResult24 .getText().toString());
                        intentGraph.putExtra("RuOffDelta60",textResult25 .getText().toString());
                        intentGraph.putExtra("RuOffDelta75",textResult26 .getText().toString());
                        intentGraph.putExtra("RuOffDelta90",textResult27 .getText().toString());
                        intentGraph.putExtra("RuOffDelta105",textResult28 .getText().toString());
                        intentGraph.putExtra("RuOffDelta120",textResult29 .getText().toString());
                        intentGraph.putExtra("RuOffDelta135",textResult210 .getText().toString());
                        intentGraph.putExtra("RuOffDelta150",textResult211 .getText().toString());
                        intentGraph.putExtra("RuOffDelta165",textResult212 .getText().toString());
                        intentGraph.putExtra("RuOffDelta180",textResult213 .getText().toString());
                        intentGraph.putExtra("RuOffDelta195",textResult214 .getText().toString());
                        intentGraph.putExtra("RuOffDelta210",textResult215 .getText().toString());
                        intentGraph.putExtra("RuOffDelta225",textResult216 .getText().toString());
                        intentGraph.putExtra("RuOffDelta240",textResult217 .getText().toString());
                        intentGraph.putExtra("RuOffDelta255",textResult218 .getText().toString());
                        intentGraph.putExtra("RuOffDelta270",textResult219 .getText().toString());
                        intentGraph.putExtra("RuOffDelta285",textResult220 .getText().toString());
                        intentGraph.putExtra("RuOffDelta300",textResult221 .getText().toString());
                        intentGraph.putExtra("RuOffDelta315",textResult222 .getText().toString());
                        intentGraph.putExtra("RuOffDelta330",textResult223 .getText().toString());
                        intentGraph.putExtra("RuOffDelta345",textResult224 .getText().toString());
                        intentGraph.putExtra("RuOffDelta360",textResult225 .getText().toString());

                        startActivity(intentGraph);
                    }
                }
        );
        calculate.setOnClickListener (
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        TextView textResult11 = (TextView)findViewById(R.id.result11);
                        TextView textResult12 = (TextView)findViewById(R.id.result12);
                        TextView textResult13 = (TextView)findViewById(R.id.result13);
                        TextView textResult14 = (TextView)findViewById(R.id.result14);
                        TextView textResult15 = (TextView)findViewById(R.id.result15);
                        TextView textResult16 = (TextView)findViewById(R.id.result16);
                        TextView textResult17 = (TextView)findViewById(R.id.result17);
                        TextView textResult18 = (TextView)findViewById(R.id.result18);
                        TextView textResult19 = (TextView)findViewById(R.id.result19);
                        TextView textResult110 = (TextView)findViewById(R.id.result110);
                        TextView textResult111 = (TextView)findViewById(R.id.result111);
                        TextView textResult112 = (TextView)findViewById(R.id.result112);
                        TextView textResult113 = (TextView)findViewById(R.id.result113);
                        TextView textResult114 = (TextView)findViewById(R.id.result114);
                        TextView textResult115 = (TextView)findViewById(R.id.result115);
                        TextView textResult116 = (TextView)findViewById(R.id.result116);
                        TextView textResult117 = (TextView)findViewById(R.id.result117);
                        TextView textResult118 = (TextView)findViewById(R.id.result118);
                        TextView textResult119 = (TextView)findViewById(R.id.result119);
                        TextView textResult120 = (TextView)findViewById(R.id.result120);
                        TextView textResult121 = (TextView)findViewById(R.id.result121);
                        TextView textResult122 = (TextView)findViewById(R.id.result122);
                        TextView textResult123 = (TextView)findViewById(R.id.result123);
                        TextView textResult124 = (TextView)findViewById(R.id.result124);
                        TextView textResult125 = (TextView)findViewById(R.id.result125);

                        TextView textResult21 = (TextView)findViewById(R.id.result21);
                        TextView textResult22 = (TextView)findViewById(R.id.result22);
                        TextView textResult23 = (TextView)findViewById(R.id.result23);
                        TextView textResult24 = (TextView)findViewById(R.id.result24);
                        TextView textResult25 = (TextView)findViewById(R.id.result25);
                        TextView textResult26 = (TextView)findViewById(R.id.result26);
                        TextView textResult27 = (TextView)findViewById(R.id.result27);
                        TextView textResult28 = (TextView)findViewById(R.id.result28);
                        TextView textResult29 = (TextView)findViewById(R.id.result29);
                        TextView textResult210 = (TextView)findViewById(R.id.result210);
                        TextView textResult211 = (TextView)findViewById(R.id.result211);
                        TextView textResult212 = (TextView)findViewById(R.id.result212);
                        TextView textResult213 = (TextView)findViewById(R.id.result213);
                        TextView textResult214 = (TextView)findViewById(R.id.result214);
                        TextView textResult215 = (TextView)findViewById(R.id.result215);
                        TextView textResult216 = (TextView)findViewById(R.id.result216);
                        TextView textResult217 = (TextView)findViewById(R.id.result217);
                        TextView textResult218 = (TextView)findViewById(R.id.result218);
                        TextView textResult219 = (TextView)findViewById(R.id.result219);
                        TextView textResult220 = (TextView)findViewById(R.id.result220);
                        TextView textResult221 = (TextView)findViewById(R.id.result221);
                        TextView textResult222 = (TextView)findViewById(R.id.result222);
                        TextView textResult223 = (TextView)findViewById(R.id.result223);
                        TextView textResult224 = (TextView)findViewById(R.id.result224);
                        TextView textResult225 = (TextView)findViewById(R.id.result225);

                        EditText A = (EditText)findViewById(R.id.editText);
                        double koefA = Double.parseDouble(A.getText().toString());

                        Double RuOnDelta0 = Double.parseDouble(textResult11.getText().toString());
                        Double RuOnDelta15 = Double.parseDouble(textResult12.getText().toString());
                        Double RuOnDelta30 = Double.parseDouble(textResult13.getText().toString());
                        Double RuOnDelta45 = Double.parseDouble(textResult14.getText().toString());
                        Double RuOnDelta60 = Double.parseDouble(textResult15.getText().toString());
                        Double RuOnDelta75 = Double.parseDouble(textResult16.getText().toString());
                        Double RuOnDelta90 = Double.parseDouble(textResult17.getText().toString());
                        Double RuOnDelta105 = Double.parseDouble(textResult18.getText().toString());
                        Double RuOnDelta120 = Double.parseDouble(textResult19 .getText().toString());
                        Double RuOnDelta135 = Double.parseDouble(textResult110.getText().toString());
                        Double RuOnDelta150 = Double.parseDouble(textResult111.getText().toString());
                        Double RuOnDelta165 = Double.parseDouble(textResult112.getText().toString());
                        Double RuOnDelta180 = Double.parseDouble(textResult113.getText().toString());
                        Double RuOnDelta195 = Double.parseDouble(textResult114.getText().toString());
                        Double RuOnDelta210 = Double.parseDouble(textResult115.getText().toString());
                        Double RuOnDelta225 = Double.parseDouble(textResult116.getText().toString());
                        Double RuOnDelta240 = Double.parseDouble(textResult117.getText().toString());
                        Double RuOnDelta255 = Double.parseDouble(textResult118.getText().toString());
                        Double RuOnDelta270 = Double.parseDouble(textResult119.getText().toString());
                        Double RuOnDelta285 = Double.parseDouble(textResult120.getText().toString());
                        Double RuOnDelta300 = Double.parseDouble(textResult121.getText().toString());
                        Double RuOnDelta315 = Double.parseDouble(textResult122.getText().toString());
                        Double RuOnDelta330 = Double.parseDouble(textResult123.getText().toString());
                        Double RuOnDelta345 = Double.parseDouble(textResult124.getText().toString());
                        Double RuOnDelta360 = Double.parseDouble(textResult125.getText().toString());

                        Double RuOffDelta0 = Double.parseDouble(textResult21.getText().toString());
                        Double RuOffDelta15 = Double.parseDouble(textResult22.getText().toString());
                        Double RuOffDelta30 = Double.parseDouble(textResult23.getText().toString());
                        Double RuOffDelta45 = Double.parseDouble(textResult24.getText().toString());
                        Double RuOffDelta60 = Double.parseDouble(textResult25.getText().toString());
                        Double RuOffDelta75 = Double.parseDouble(textResult26.getText().toString());
                        Double RuOffDelta90 = Double.parseDouble(textResult27.getText().toString());
                        Double RuOffDelta105 = Double.parseDouble(textResult28.getText().toString());
                        Double RuOffDelta120 = Double.parseDouble(textResult29 .getText().toString());
                        Double RuOffDelta135 = Double.parseDouble(textResult210.getText().toString());
                        Double RuOffDelta150 = Double.parseDouble(textResult211.getText().toString());
                        Double RuOffDelta165 = Double.parseDouble(textResult212.getText().toString());
                        Double RuOffDelta180 = Double.parseDouble(textResult213.getText().toString());
                        Double RuOffDelta195 = Double.parseDouble(textResult214.getText().toString());
                        Double RuOffDelta210 = Double.parseDouble(textResult215.getText().toString());
                        Double RuOffDelta225 = Double.parseDouble(textResult216.getText().toString());
                        Double RuOffDelta240 = Double.parseDouble(textResult217.getText().toString());
                        Double RuOffDelta255 = Double.parseDouble(textResult218.getText().toString());
                        Double RuOffDelta270 = Double.parseDouble(textResult219.getText().toString());
                        Double RuOffDelta285 = Double.parseDouble(textResult220.getText().toString());
                        Double RuOffDelta300 = Double.parseDouble(textResult221.getText().toString());
                        Double RuOffDelta315 = Double.parseDouble(textResult222.getText().toString());
                        Double RuOffDelta330 = Double.parseDouble(textResult223.getText().toString());
                        Double RuOffDelta345 = Double.parseDouble(textResult224.getText().toString());
                        Double RuOffDelta360 = Double.parseDouble(textResult225.getText().toString());

                        RuOnDelta0 -= koefA;
                        RuOnDelta15 -= koefA;
                        RuOnDelta30 -= koefA;
                        RuOnDelta45 -= koefA;
                        RuOnDelta60 -= koefA;
                        RuOnDelta75 -= koefA;
                        RuOnDelta90 -= koefA;
                        RuOnDelta105 -= koefA;
                        RuOnDelta120 -= koefA;
                        RuOnDelta135 -= koefA;
                        RuOnDelta150 -= koefA;
                        RuOnDelta165 -= koefA;
                        RuOnDelta180 -= koefA;
                        RuOnDelta195 -= koefA;
                        RuOnDelta210 -= koefA;
                        RuOnDelta225 -= koefA;
                        RuOnDelta240 -= koefA;
                        RuOnDelta255 -= koefA;
                        RuOnDelta270 -= koefA;
                        RuOnDelta285 -= koefA;
                        RuOnDelta300 -= koefA;
                        RuOnDelta315 -= koefA;
                        RuOnDelta330 -= koefA;
                        RuOnDelta345 -= koefA;
                        RuOnDelta360 -= koefA;

                        RuOffDelta0 -= koefA;
                        RuOffDelta15 -= koefA;
                        RuOffDelta30 -= koefA;
                        RuOffDelta45 -= koefA;
                        RuOffDelta60 -= koefA;
                        RuOffDelta75 -= koefA;
                        RuOffDelta90 -= koefA;
                        RuOffDelta105 -= koefA;
                        RuOffDelta120 -= koefA;
                        RuOffDelta135 -= koefA;
                        RuOffDelta150 -= koefA;
                        RuOffDelta165 -= koefA;
                        RuOffDelta180 -= koefA;
                        RuOffDelta195 -= koefA;
                        RuOffDelta210 -= koefA;
                        RuOffDelta225 -= koefA;
                        RuOffDelta240 -= koefA;
                        RuOffDelta255 -= koefA;
                        RuOffDelta270 -= koefA;
                        RuOffDelta285 -= koefA;
                        RuOffDelta300 -= koefA;
                        RuOffDelta315 -= koefA;
                        RuOffDelta330 -= koefA;
                        RuOffDelta345 -= koefA;
                        RuOffDelta360 -= koefA;

                        DecimalFormatSymbols otherSymbols = new DecimalFormatSymbols(Locale.US);
                        String pattern = "##0.0";
                        DecimalFormat decimalFormat = new DecimalFormat(pattern, otherSymbols);

                        textResult11.setText(decimalFormat.format(RuOnDelta0));
                        textResult12.setText(decimalFormat.format(RuOnDelta15));
                        textResult13.setText(decimalFormat.format(RuOnDelta30));
                        textResult14.setText(decimalFormat.format(RuOnDelta45));
                        textResult15.setText(decimalFormat.format(RuOnDelta60));
                        textResult16.setText(decimalFormat.format(RuOnDelta75));
                        textResult17.setText(decimalFormat.format(RuOnDelta90));
                        textResult18.setText(decimalFormat.format(RuOnDelta105));
                        textResult19.setText(decimalFormat.format(RuOnDelta120));
                        textResult110.setText(decimalFormat.format(RuOnDelta135));
                        textResult111.setText(decimalFormat.format(RuOnDelta150));
                        textResult112.setText(decimalFormat.format(RuOnDelta165));
                        textResult113.setText(decimalFormat.format(RuOnDelta180));
                        textResult114.setText(decimalFormat.format(RuOnDelta195));
                        textResult115.setText(decimalFormat.format(RuOnDelta210));
                        textResult116.setText(decimalFormat.format(RuOnDelta225));
                        textResult117.setText(decimalFormat.format(RuOnDelta240));
                        textResult118.setText(decimalFormat.format(RuOnDelta255));
                        textResult119.setText(decimalFormat.format(RuOnDelta270));
                        textResult120.setText(decimalFormat.format(RuOnDelta285));
                        textResult121.setText(decimalFormat.format(RuOnDelta300));
                        textResult122.setText(decimalFormat.format(RuOnDelta315));
                        textResult123.setText(decimalFormat.format(RuOnDelta330));
                        textResult124.setText(decimalFormat.format(RuOnDelta345));
                        textResult125.setText(decimalFormat.format(RuOnDelta360));

                        textResult21.setText(decimalFormat.format(RuOffDelta0));
                        textResult22.setText(decimalFormat.format(RuOffDelta15));
                        textResult23.setText(decimalFormat.format(RuOffDelta30));
                        textResult24.setText(decimalFormat.format(RuOffDelta45));
                        textResult25.setText(decimalFormat.format(RuOffDelta60));
                        textResult26.setText(decimalFormat.format(RuOffDelta75));
                        textResult27.setText(decimalFormat.format(RuOffDelta90));
                        textResult28.setText(decimalFormat.format(RuOffDelta105));
                        textResult29.setText(decimalFormat.format(RuOffDelta120));
                        textResult210.setText(decimalFormat.format(RuOffDelta135));
                        textResult211.setText(decimalFormat.format(RuOffDelta150));
                        textResult212.setText(decimalFormat.format(RuOffDelta165));
                        textResult213.setText(decimalFormat.format(RuOffDelta180));
                        textResult214.setText(decimalFormat.format(RuOffDelta195));
                        textResult215.setText(decimalFormat.format(RuOffDelta210));
                        textResult216.setText(decimalFormat.format(RuOffDelta225));
                        textResult217.setText(decimalFormat.format(RuOffDelta240));
                        textResult218.setText(decimalFormat.format(RuOffDelta255));
                        textResult219.setText(decimalFormat.format(RuOffDelta270));
                        textResult220.setText(decimalFormat.format(RuOffDelta285));
                        textResult221.setText(decimalFormat.format(RuOffDelta300));
                        textResult222.setText(decimalFormat.format(RuOffDelta315));
                        textResult223.setText(decimalFormat.format(RuOffDelta330));
                        textResult224.setText(decimalFormat.format(RuOffDelta345));
                        textResult225.setText(decimalFormat.format(RuOffDelta360));
                    }
                }
        );
    }
}