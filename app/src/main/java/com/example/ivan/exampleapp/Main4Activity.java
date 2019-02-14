package com.example.ivan.exampleapp;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

public class Main4Activity extends AppCompatActivity {
    LineGraphSeries<DataPoint> series;

    //double y1,y2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        Intent intentGraph = getIntent();

         /*y2  = intentGraph.getDoubleExtra("price",0);
         y1  = intentGraph.getDoubleExtra("price2",0);*/

        /*double y1  = intentGraph.getDoubleExtra("price",0);
        double y2  = intentGraph.getDoubleExtra("price2",0);*/

        /*String y1 = intentGraph.getStringExtra("RuOnDelta0");
        String y2 = intentGraph.getStringExtra("RuOnDelta15");

        double deltaOnGraph0 = Double.parseDouble(y1);
        double deltaOnGraph15 = Double.parseDouble(y2);

        GraphView graph = (GraphView) findViewById(R.id.graph);
        LineGraphSeries<DataPoint> series = new LineGraphSeries<>(new DataPoint[] {
                new DataPoint(0, deltaOnGraph0),
                new DataPoint(15, deltaOnGraph15),
        });
        series.setColor(Color.RED);
        graph.addSeries(series);*/

        String RuOnDelta0 = intentGraph.getStringExtra("RuOnDelta0");
        String RuOnDelta15 = intentGraph.getStringExtra("RuOnDelta15");
        String RuOnDelta30 = intentGraph.getStringExtra("RuOnDelta30");
        String RuOnDelta45 = intentGraph.getStringExtra("RuOnDelta45");
        String RuOnDelta60 = intentGraph.getStringExtra("RuOnDelta60");
        String RuOnDelta75 = intentGraph.getStringExtra("RuOnDelta75");
        String RuOnDelta90 = intentGraph.getStringExtra("RuOnDelta90");
        String RuOnDelta105 = intentGraph.getStringExtra("RuOnDelta105");
        String RuOnDelta120 = intentGraph.getStringExtra("RuOnDelta120");
        String RuOnDelta135 = intentGraph.getStringExtra("RuOnDelta135");
        String RuOnDelta150 = intentGraph.getStringExtra("RuOnDelta150");
        String RuOnDelta165 = intentGraph.getStringExtra("RuOnDelta165");
        String RuOnDelta180 = intentGraph.getStringExtra("RuOnDelta180");
        String RuOnDelta195 = intentGraph.getStringExtra("RuOnDelta195");
        String RuOnDelta210 = intentGraph.getStringExtra("RuOnDelta210");
        String RuOnDelta225 = intentGraph.getStringExtra("RuOnDelta225");
        String RuOnDelta240 = intentGraph.getStringExtra("RuOnDelta240");
        String RuOnDelta255 = intentGraph.getStringExtra("RuOnDelta255");
        String RuOnDelta270 = intentGraph.getStringExtra("RuOnDelta270");
        String RuOnDelta285 = intentGraph.getStringExtra("RuOnDelta285");
        String RuOnDelta300 = intentGraph.getStringExtra("RuOnDelta300");
        String RuOnDelta315 = intentGraph.getStringExtra("RuOnDelta315");
        String RuOnDelta330 = intentGraph.getStringExtra("RuOnDelta330");
        String RuOnDelta345 = intentGraph.getStringExtra("RuOnDelta345");
        String RuOnDelta360 = intentGraph.getStringExtra("RuOnDelta360");

        String RuOffDelta0 = intentGraph.getStringExtra("RuOffDelta0");
        String RuOffDelta15 = intentGraph.getStringExtra("RuOffDelta15");
        String RuOffDelta30 = intentGraph.getStringExtra("RuOffDelta30");
        String RuOffDelta45 = intentGraph.getStringExtra("RuOffDelta45");
        String RuOffDelta60 = intentGraph.getStringExtra("RuOffDelta60");
        String RuOffDelta75 = intentGraph.getStringExtra("RuOffDelta75");
        String RuOffDelta90 = intentGraph.getStringExtra("RuOffDelta90");
        String RuOffDelta105 = intentGraph.getStringExtra("RuOffDelta105");
        String RuOffDelta120 = intentGraph.getStringExtra("RuOffDelta120");
        String RuOffDelta135 = intentGraph.getStringExtra("RuOffDelta135");
        String RuOffDelta150 = intentGraph.getStringExtra("RuOffDelta150");
        String RuOffDelta165 = intentGraph.getStringExtra("RuOffDelta165");
        String RuOffDelta180 = intentGraph.getStringExtra("RuOffDelta180");
        String RuOffDelta195 = intentGraph.getStringExtra("RuOffDelta195");
        String RuOffDelta210 = intentGraph.getStringExtra("RuOffDelta210");
        String RuOffDelta225 = intentGraph.getStringExtra("RuOffDelta225");
        String RuOffDelta240 = intentGraph.getStringExtra("RuOffDelta240");
        String RuOffDelta255 = intentGraph.getStringExtra("RuOffDelta255");
        String RuOffDelta270 = intentGraph.getStringExtra("RuOffDelta270");
        String RuOffDelta285 = intentGraph.getStringExtra("RuOffDelta285");
        String RuOffDelta300 = intentGraph.getStringExtra("RuOffDelta300");
        String RuOffDelta315 = intentGraph.getStringExtra("RuOffDelta315");
        String RuOffDelta330 = intentGraph.getStringExtra("RuOffDelta330");
        String RuOffDelta345 = intentGraph.getStringExtra("RuOffDelta345");
        String RuOffDelta360 = intentGraph.getStringExtra("RuOffDelta360");

        double deltaOnGraph0 = Double.parseDouble(RuOnDelta0);
        double deltaOnGraph15 = Double.parseDouble(RuOnDelta15);
        double deltaOnGraph30 = Double.parseDouble(RuOnDelta30);
        double deltaOnGraph45 = Double.parseDouble(RuOnDelta45);
        double deltaOnGraph60 = Double.parseDouble(RuOnDelta60);
        double deltaOnGraph75 = Double.parseDouble(RuOnDelta75);
        double deltaOnGraph90 = Double.parseDouble(RuOnDelta90);
        double deltaOnGraph105 = Double.parseDouble(RuOnDelta105);
        double deltaOnGraph120 = Double.parseDouble(RuOnDelta120);
        double deltaOnGraph135 = Double.parseDouble(RuOnDelta135);
        double deltaOnGraph150 = Double.parseDouble(RuOnDelta150);
        double deltaOnGraph165 = Double.parseDouble(RuOnDelta165);
        double deltaOnGraph180 = Double.parseDouble(RuOnDelta180);
        double deltaOnGraph195 = Double.parseDouble(RuOnDelta195);
        double deltaOnGraph210 = Double.parseDouble(RuOnDelta210);
        double deltaOnGraph225 = Double.parseDouble(RuOnDelta225);
        double deltaOnGraph240 = Double.parseDouble(RuOnDelta240);
        double deltaOnGraph255 = Double.parseDouble(RuOnDelta255);
        double deltaOnGraph270 = Double.parseDouble(RuOnDelta270);
        double deltaOnGraph285 = Double.parseDouble(RuOnDelta285);
        double deltaOnGraph300 = Double.parseDouble(RuOnDelta300);
        double deltaOnGraph315 = Double.parseDouble(RuOnDelta315);
        double deltaOnGraph330 = Double.parseDouble(RuOnDelta330);
        double deltaOnGraph345 = Double.parseDouble(RuOnDelta345);
        double deltaOnGraph360 = Double.parseDouble(RuOnDelta360);

        double deltaOffGraph0 = Double.parseDouble(RuOffDelta0);
        double deltaOffGraph15 = Double.parseDouble(RuOffDelta15);
        double deltaOffGraph30 = Double.parseDouble(RuOffDelta30);
        double deltaOffGraph45 = Double.parseDouble(RuOffDelta45);
        double deltaOffGraph60 = Double.parseDouble(RuOffDelta60);
        double deltaOffGraph75 = Double.parseDouble(RuOffDelta75);
        double deltaOffGraph90 = Double.parseDouble(RuOffDelta90);
        double deltaOffGraph105 = Double.parseDouble(RuOffDelta105);
        double deltaOffGraph120 = Double.parseDouble(RuOffDelta120);
        double deltaOffGraph135 = Double.parseDouble(RuOffDelta135);
        double deltaOffGraph150 = Double.parseDouble(RuOffDelta150);
        double deltaOffGraph165 = Double.parseDouble(RuOffDelta165);
        double deltaOffGraph180 = Double.parseDouble(RuOffDelta180);
        double deltaOffGraph195 = Double.parseDouble(RuOffDelta195);
        double deltaOffGraph210 = Double.parseDouble(RuOffDelta210);
        double deltaOffGraph225 = Double.parseDouble(RuOffDelta225);
        double deltaOffGraph240 = Double.parseDouble(RuOffDelta240);
        double deltaOffGraph255 = Double.parseDouble(RuOffDelta255);
        double deltaOffGraph270 = Double.parseDouble(RuOffDelta270);
        double deltaOffGraph285 = Double.parseDouble(RuOffDelta285);
        double deltaOffGraph300 = Double.parseDouble(RuOffDelta300);
        double deltaOffGraph315 = Double.parseDouble(RuOffDelta315);
        double deltaOffGraph330 = Double.parseDouble(RuOffDelta330);
        double deltaOffGraph345 = Double.parseDouble(RuOffDelta345);
        double deltaOffGraph360 = Double.parseDouble(RuOffDelta360);

        GraphView graph = (GraphView) findViewById(R.id.graph);
        LineGraphSeries<DataPoint> series = new LineGraphSeries<>(new DataPoint[] {
                new DataPoint(0, deltaOffGraph0),
                new DataPoint(15, deltaOffGraph15),
                new DataPoint(30, deltaOffGraph30),
                new DataPoint(45, deltaOffGraph45),
                new DataPoint(60, deltaOffGraph60),
                new DataPoint(75, deltaOffGraph75),
                new DataPoint(90, deltaOffGraph90),
                new DataPoint(105, deltaOffGraph105),
                new DataPoint(120, deltaOffGraph120),
                new DataPoint(135, deltaOffGraph135),
                new DataPoint(150, deltaOffGraph150),
                new DataPoint(165, deltaOffGraph165),
                new DataPoint(180, deltaOffGraph180),
                new DataPoint(195, deltaOffGraph195),
                new DataPoint(210, deltaOffGraph210),
                new DataPoint(225, deltaOffGraph225),
                new DataPoint(240, deltaOffGraph240),
                new DataPoint(255, deltaOffGraph255),
                new DataPoint(270, deltaOffGraph270),
                new DataPoint(285, deltaOffGraph285),
                new DataPoint(300, deltaOffGraph300),
                new DataPoint(315, deltaOffGraph315),
                new DataPoint(330, deltaOffGraph330),
                new DataPoint(345, deltaOffGraph345),
                new DataPoint(360, deltaOffGraph360)
        });
        series.setColor(Color.RED);
        graph.setTitle("График δв(KK)");
        graph.addSeries(series);

        LineGraphSeries<DataPoint> series2 = new LineGraphSeries<>(new DataPoint[] {
                new DataPoint(0, deltaOnGraph0),
                new DataPoint(15, deltaOnGraph15),
                new DataPoint(30, deltaOnGraph30),
                new DataPoint(45, deltaOnGraph45),
                new DataPoint(60, deltaOnGraph60),
                new DataPoint(75, deltaOnGraph75),
                new DataPoint(90, deltaOnGraph90),
                new DataPoint(105, deltaOnGraph105),
                new DataPoint(120, deltaOnGraph120),
                new DataPoint(135, deltaOnGraph135),
                new DataPoint(150, deltaOnGraph150),
                new DataPoint(165, deltaOnGraph165),
                new DataPoint(180, deltaOnGraph180),
                new DataPoint(195, deltaOnGraph195),
                new DataPoint(210, deltaOnGraph210),
                new DataPoint(225, deltaOnGraph225),
                new DataPoint(240, deltaOnGraph240),
                new DataPoint(255, deltaOnGraph255),
                new DataPoint(270, deltaOnGraph270),
                new DataPoint(285, deltaOnGraph285),
                new DataPoint(300, deltaOnGraph300),
                new DataPoint(315, deltaOnGraph315),
                new DataPoint(330, deltaOnGraph330),
                new DataPoint(345, deltaOnGraph345),
                new DataPoint(360, deltaOnGraph360)
        });
        series2.setTitle("Random");
        series2.setColor(Color.GREEN);
        graph.addSeries(series2);
        graph.getGridLabelRenderer().setHorizontalAxisTitle("KK");
        graph.getGridLabelRenderer().setVerticalAxisTitle("δв(ВЫКЛ),δв(ВКЛ)");
        graph.getGridLabelRenderer().setHorizontalLabelsColor(Color.BLACK);
        graph.getGridLabelRenderer().setVerticalLabelsColor(Color.BLACK);
        graph.getGridLabelRenderer().setHorizontalAxisTitleColor(Color.BLUE);
        graph.getGridLabelRenderer().setVerticalAxisTitleColor(Color.BLUE);
        graph.getViewport().setScalable(true);
        graph.getViewport().setScrollable(true);
    }
}
