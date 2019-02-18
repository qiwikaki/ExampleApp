package com.example.ivan.exampleapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class Main3Activity extends AppCompatActivity {


    double delta1_0, delta2_0;
    private Button graph;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        addListenerOnButton ();


        Intent intent = getIntent();

        String kurs11 = intent.getStringExtra("kurs11");
        String kurs12 = intent.getStringExtra("kurs12");
        String kurs13 = intent.getStringExtra("kurs13");
        String kurs14 = intent.getStringExtra("kurs14");
        String kurs15 = intent.getStringExtra("kurs15");
        String kurs16 = intent.getStringExtra("kurs16");
        String kurs17 = intent.getStringExtra("kurs17");
        String kurs18 = intent.getStringExtra("kurs18");

        String kurs21 = intent.getStringExtra("kurs21");
        String kurs22 = intent.getStringExtra("kurs22");
        String kurs23 = intent.getStringExtra("kurs23");
        String kurs24 = intent.getStringExtra("kurs24");
        String kurs25 = intent.getStringExtra("kurs25");
        String kurs26 = intent.getStringExtra("kurs26");
        String kurs27 = intent.getStringExtra("kurs27");
        String kurs28 = intent.getStringExtra("kurs28");

        double num11 = Double.parseDouble(kurs11);
        double num12 = Double.parseDouble(kurs12);
        double num13 = Double.parseDouble(kurs13);
        double num14 = Double.parseDouble(kurs14);
        double num15 = Double.parseDouble(kurs15);
        double num16 = Double.parseDouble(kurs16);
        double num17 = Double.parseDouble(kurs17);
        double num18 = Double.parseDouble(kurs18);

        double num21 = Double.parseDouble(kurs21);
        double num22 = Double.parseDouble(kurs22);
        double num23 = Double.parseDouble(kurs23);
        double num24 = Double.parseDouble(kurs24);
        double num25 = Double.parseDouble(kurs25);
        double num26 = Double.parseDouble(kurs26);
        double num27 = Double.parseDouble(kurs27);
        double num28 = Double.parseDouble(kurs28);

        if (num11 > 0.0 && num11 < 100) {
            delta1_0 = 0.0 - num11;
        } else if (num11 > 100) {
            delta1_0 = 360.0 - num11;
        }
        double delta1_45 = 45.0 - num12;
        double delta1_90 = 90.0 - num13;
        double delta1_135 = 135.0 - num14;
        double delta1_180 = 180.0 - num15;
        double delta1_225 = 225.0 - num16;
        double delta1_270 = 270.0 - num17;
        double delta1_315 = 315.0 - num18;
        double A1 = (delta1_0 + delta1_45 + delta1_90 + delta1_135 + delta1_180 + delta1_225 + delta1_270 + delta1_315) / 8;
        double B1 = ((delta1_90 - delta1_270) + ((delta1_45 - delta1_225)*0.71) + (delta1_135 - delta1_315)*0.71) / 4;
        double C1 = ((delta1_0 - delta1_180) + 0.71*(delta1_45 - delta1_225) - 0.71*(delta1_135 - delta1_315)) / 4;
        double D1 = ((delta1_45 + delta1_225) - (delta1_135 + delta1_315)) / 4;
        double E1 = ((delta1_0 + delta1_180) - (delta1_90 + delta1_270)) / 4;


        if (num21 > 0.0 && num21 < 100) {
            delta2_0 = 0.0 - num21;
        } else if (num21 > 100) {
            delta2_0 = 360.0 - num21;
        }
        double delta2_45 = 45.0 - num22;
        double delta2_90 = 90.0 - num23;
        double delta2_135 = 135.0 - num24;
        double delta2_180 = 180.0 - num25;
        double delta2_225 = 225.0 - num26;
        double delta2_270 = 270.0 - num27;
        double delta2_315 = 315.0 - num28;
        double A2 = (delta2_0 + delta2_45 + delta2_90 + delta2_135 + delta2_180 + delta2_225 + delta2_270 + delta2_315) / 8;
        double B2 = ((delta2_90 - delta2_270) + (delta2_45 - delta2_225)*0.71 + (delta2_135 - delta2_315)*0.71) / 4;
        double C2 = ((delta2_0 - delta2_180) + (delta2_45 - delta2_225)*0.71 - (delta2_135-delta2_315)*0.71) / 4;
        double D2 = ((delta2_45 + delta2_225) - (delta2_135 + delta2_315)) / 4;
        double E2 = ((delta2_0 + delta2_180) - (delta2_90 + delta2_270)) / 4;



        double RuOnDelta0 = (A1 + B1*0 + C1*1 + D1*0 + E1*1);
        double RuOnDelta15 = (A1 + B1*0.2588 + C1*0.9659 + D1*0.5 + E1*0.866);
        double RuOnDelta30 = (A1 + B1*0.5 + C1*0.866 + D1*0.866 + E1*0.5);
        double RuOnDelta45 = (A1 + B1*0.7071 + C1*0.7071 + D1*1 + E1*0);
        double RuOnDelta60 = (A1 + B1*0.866 + C1*0.5 + D1*0.866 + E1*(-0.5));
        double RuOnDelta75 = (A1 + B1*0.9659 + C1*0.2588 + D1*0.5 + E1*(-0.866));
        double RuOnDelta90 = (A1 + B1*1 + C1*0 + D1*0 + E1*(-1));
        double RuOnDelta105 = (A1 + B1*0.9659 + C1*(-0.258) + D1*(-0.5) + E1*(-0.866));
        double RuOnDelta120 = (A1 + B1*.866 + C1*(-0.5) + D1*(-0.866) + E1*(-0.5));
        double RuOnDelta135 = (A1 + B1*0.7071 + C1*(-0.7071) + D1*(-1) + E1*0);
        double RuOnDelta150 = (A1 + B1*0.5 + C1*(-0.866) + D1*(-0.866) + E1*0.5);
        double RuOnDelta165 = (A1 + B1*0.2588 + C1*(-0.9659) + D1*(-0.5) + E1*0.866);
        double RuOnDelta180 = (A1 + B1*0 + C1*(-1) + D1*0 + E1*1);
        double RuOnDelta195 = (A1 + B1*(-0.2588) + C1*(-0.9659) + D1*0.5 + E1*0.866);
        double RuOnDelta210 = (A1 + B1*(-0.5) + C1*(-0.866) + D1*0.866 + E1*0.5);
        double RuOnDelta225 = (A1 + B1*(-0.7071) + C1*(-0.7071) + D1*1 + E1*0);
        double RuOnDelta240 = (A1 + B1*(-0.866) + C1*(-0.5) + D1*0.866 + E1*(-0.5));
        double RuOnDelta255 = (A1 + B1*(-0.9659) + C1*(-0.258) + D1*0.5 + E1*(-0.866));
        double RuOnDelta270 = (A1 + B1*(-1) + C1*0 + D1*0 + E1*(-1));
        double RuOnDelta285 = (A1 + B1*(-0.9659) + C1*0.2588 + D1*(-0.5) + E1*(-0.866));
        double RuOnDelta300 = (A1 + B1*(-0.866) + C1*0.5 + D1*(-0.866) + E1*(-0.5));
        double RuOnDelta315 = (A1 + B1*(-0.7071) + C1*0.7071 + D1*(-1) + E1*0);
        double RuOnDelta330 = (A1 + B1*(-0.5) + C1*0.866 + D1*(-0.866) + E1*0.5);
        double RuOnDelta345 = (A1 + B1*(-0.2588) + C1*0.9659 + D1*(-0.5) + E1*0.866);
        double RuOnDelta360 = (A1 + B1*0 + C1*1 + D1*0 + E1*1);

        double RuOffDelta0 = (A2 +B2*0 + C2*1 +D2*0 + E2*1);
        double RuOffDelta15 = (A2 +B2*0.2588 + C2*0.9659 +D2*0.5 + E2*0.866);
        double RuOffDelta30 = (A2 +B2*0.5 + C2*0.866 +D2*0.866 + E2*0.5);
        double RuOffDelta45 = (A2 +B2*0.7071 + C2*0.7071 +D2*1 + E2*0);
        double RuOffDelta60 = (A2 +B2*0.866 + C2*0.5 +D2*0.866 + E2*(-0.5));
        double RuOffDelta75 = (A2 +B2*0.9659 + C2*0.2588 +D2*0.5 + E2*(-0.866));
        double RuOffDelta90 = (A2 +B2*1 + C2*0 +D2*0 + E2*(-1));
        double RuOffDelta105 = (A2 +B2*0.9659 + C2*(-0.258) +D2*(-0.5) + E2*(-0.866));
        double RuOffDelta120 = (A2 +B2*.866 + C2*(-0.5) +D2*(-0.866) + E2*(-0.5));
        double RuOffDelta135 = (A2 +B2*0.7071 + C2*(-0.7071) +D2*(-1) + E2*0);
        double RuOffDelta150 = (A2 +B2*0.5 + C2*(-0.866) +D2*(-0.866) + E2*0.5);
        double RuOffDelta165 = (A2 +B2*0.2588 + C2*(-0.9659) +D2*(-0.5) + E2*0.866);
        double RuOffDelta180 = (A2 +B2*0 + C2*(-1) +D2*0 + E2*1);
        double RuOffDelta195 = (A2 +B2*(-0.2588) + C2*(-0.9659) +D2*0.5 + E2*0.866);
        double RuOffDelta210 = (A2 +B2*(-0.5) + C2*(-0.866) +D2*0.866 + E2*0.5);
        double RuOffDelta225 = (A2 +B2*(-0.7071) + C2*(-0.7071) +D2*1 + E2*0);
        double RuOffDelta240 = (A2 +B2*(-0.866) + C2*(-0.5) +D2*0.866 + E2*(-0.5));
        double RuOffDelta255 = (A2 +B2*(-0.9659) + C2*(-0.258) +D2*0.5 + E2*(-0.866));
        double RuOffDelta270 = (A2 +B2*(-1) + C2*0 +D2*0 + E2*(-1));
        double RuOffDelta285 = (A2 +B2*(-0.9659) + C2*0.2588 +D2*(-0.5) + E2*(-0.866));
        double RuOffDelta300 = (A2 +B2*(-0.866) + C2*0.5 +D2*(-0.866) + E2*(-0.5));
        double RuOffDelta315 = (A2 +B2*(-0.7071) + C2*0.7071 +D2*(-1) + E2*0);
        double RuOffDelta330 = (A2 +B2*(-0.5) + C2*0.866 +D2*(-0.866) + E2*0.5);
        double RuOffDelta345 = (A2 +B2*(-0.2588) + C2*0.9659 +D2*(-0.5) + E2*0.866);
        double RuOffDelta360 = (A2 +B2*0 + C2*1 +D2*0 + E2*1);


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
        TextView resultB1 = (TextView)findViewById(R.id.B1);
        TextView resultB2 = (TextView)findViewById(R.id.B2);
        TextView resultC1 = (TextView)findViewById(R.id.C1);
        TextView resultC2 = (TextView)findViewById(R.id.C2);
        TextView resultE1 = (TextView)findViewById(R.id.D1);
        TextView resultE2 = (TextView)findViewById(R.id.D2);
        TextView resultD1 = (TextView)findViewById(R.id.E1);
        TextView resultD2 = (TextView)findViewById(R.id.E2);

        resultA1.setText(new DecimalFormat("##.##").format(A1));
        resultA2.setText(new DecimalFormat("##.##").format(A2));
        resultB1.setText(new DecimalFormat("##.##").format(B1));
        resultB2.setText(new DecimalFormat("##.##").format(B2));
        resultC1.setText(new DecimalFormat("##.##").format(C1));
        resultC2.setText(new DecimalFormat("##.##").format(C2));
        resultE1.setText(new DecimalFormat("##.##").format(D1));
        resultE2.setText(new DecimalFormat("##.##").format(D2));
        resultD1.setText(new DecimalFormat("##.##").format(E1));
        resultD2.setText(new DecimalFormat("##.##").format(E2));

        DecimalFormatSymbols otherSymbols = new DecimalFormatSymbols(Locale.US);
        String pattern = "##0.0";
        DecimalFormat decimalFormat = new DecimalFormat(pattern, otherSymbols);




        //
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
        graph.setOnClickListener (
          new View.OnClickListener() {
              @Override
              public void onClick(View v) {

                  Intent intentTable = new Intent(Main3Activity.this, Main5Activity.class);

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


                  intentTable.putExtra("ka1",resultA1 .getText().toString());
                  intentTable.putExtra("ka2",resultA2 .getText().toString());
                  /*double example1 = 0.5;
                  double example2 = 1.2;
                  intentGraph.putExtra("price",example1);
                  intentGraph.putExtra("price2",example2);*/


                  /*double RuOnDelta0 = Double.parseDouble(textResult11.getText().toString());
                  intentGraph.putExtra("price",RuOnDelta0);
                  double RuOnDelta15 = Double.parseDouble(textResult12.getText().toString());
                  intentGraph.putExtra("price2",RuOnDelta15);*/

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



                  intentTable.putExtra("RuOnDelta0",RuOnDelta0);
                  intentTable.putExtra("RuOnDelta15",RuOnDelta15);
                  intentTable.putExtra("RuOnDelta30",RuOnDelta30);
                  intentTable.putExtra("RuOnDelta45",RuOnDelta45);
                  intentTable.putExtra("RuOnDelta60",RuOnDelta60);
                  intentTable.putExtra("RuOnDelta75",RuOnDelta75);
                  intentTable.putExtra("RuOnDelta90",RuOnDelta90);
                  intentTable.putExtra("RuOnDelta105",RuOnDelta105);
                  intentTable.putExtra("RuOnDelta120",RuOnDelta120);
                  intentTable.putExtra("RuOnDelta135",RuOnDelta135);
                  intentTable.putExtra("RuOnDelta150",RuOnDelta150);
                  intentTable.putExtra("RuOnDelta165",RuOnDelta165);
                  intentTable.putExtra("RuOnDelta180",RuOnDelta180);
                  intentTable.putExtra("RuOnDelta195",RuOnDelta195);
                  intentTable.putExtra("RuOnDelta210",RuOnDelta210);
                  intentTable.putExtra("RuOnDelta225",RuOnDelta225);
                  intentTable.putExtra("RuOnDelta240",RuOnDelta240);
                  intentTable.putExtra("RuOnDelta255",RuOnDelta255);
                  intentTable.putExtra("RuOnDelta270",RuOnDelta270);
                  intentTable.putExtra("RuOnDelta285",RuOnDelta285);
                  intentTable.putExtra("RuOnDelta300",RuOnDelta300);
                  intentTable.putExtra("RuOnDelta315",RuOnDelta315);
                  intentTable.putExtra("RuOnDelta330",RuOnDelta330);
                  intentTable.putExtra("RuOnDelta345",RuOnDelta345);
                  intentTable.putExtra("RuOnDelta360",RuOnDelta360);

                  intentTable.putExtra("RuOffDelta0",RuOffDelta0);
                  intentTable.putExtra("RuOffDelta15",RuOffDelta15);
                  intentTable.putExtra("RuOffDelta30",RuOffDelta30);
                  intentTable.putExtra("RuOffDelta45",RuOffDelta45);
                  intentTable.putExtra("RuOffDelta60",RuOffDelta60);
                  intentTable.putExtra("RuOffDelta75",RuOffDelta75);
                  intentTable.putExtra("RuOffDelta90",RuOffDelta90);
                  intentTable.putExtra("RuOffDelta105",RuOffDelta105);
                  intentTable.putExtra("RuOffDelta120",RuOffDelta120);
                  intentTable.putExtra("RuOffDelta135",RuOffDelta135);
                  intentTable.putExtra("RuOffDelta150",RuOffDelta150);
                  intentTable.putExtra("RuOffDelta165",RuOffDelta165);
                  intentTable.putExtra("RuOffDelta180",RuOffDelta180);
                  intentTable.putExtra("RuOffDelta195",RuOffDelta195);
                  intentTable.putExtra("RuOffDelta210",RuOffDelta210);
                  intentTable.putExtra("RuOffDelta225",RuOffDelta225);
                  intentTable.putExtra("RuOffDelta240",RuOffDelta240);
                  intentTable.putExtra("RuOffDelta255",RuOffDelta255);
                  intentTable.putExtra("RuOffDelta270",RuOffDelta270);
                  intentTable.putExtra("RuOffDelta285",RuOffDelta285);
                  intentTable.putExtra("RuOffDelta300",RuOffDelta300);
                  intentTable.putExtra("RuOffDelta315",RuOffDelta315);
                  intentTable.putExtra("RuOffDelta330",RuOffDelta330);
                  intentTable.putExtra("RuOffDelta345",RuOffDelta345);
                  intentTable.putExtra("RuOffDelta360",RuOffDelta360);

                  startActivity(intentTable);
              }
          }
        );
    }
}