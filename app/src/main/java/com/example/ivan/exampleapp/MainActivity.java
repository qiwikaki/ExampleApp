package com.example.ivan.exampleapp;

import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.app.Activity;
public class MainActivity extends AppCompatActivity implements SensorEventListener {

    //Объявляем картинку для компаса
    private ImageView kompas;
    //Объявляем функцию поворота картинки
    private float RotateDegree = 0f;
    //Объявляем работу с сенсором устройства
    private SensorManager mSensorManager;
    //Объявляем объект TextView
    TextView CompOrient;
    private Button act_change;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButton ();
        //Связываем объект ImageView с нашим изображением:
        kompas = (ImageView) findViewById(R.id.imageView2);

        //TextView в котором будет отображаться градус поворота:
        CompOrient = (TextView) findViewById(R.id.Header);

        //Инициализируем возможность работать с сенсором устройства:
        mSensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
    }

    @Override
    protected void onResume() {
        super.onResume();

        //Устанавливаем слушателя ориентации сенсора
        mSensorManager.registerListener(this, mSensorManager.getDefaultSensor(Sensor.TYPE_ORIENTATION),
                SensorManager.SENSOR_DELAY_GAME);
    }

    @Override
    protected void onPause() {
        super.onPause();

        //Останавливаем при надобности слушателя ориентации
        //сенсора с целью сбережения заряда батареи:
        mSensorManager.unregisterListener(this);
    }

    @Override
    public void onSensorChanged(SensorEvent event) {

        //Получаем градус поворота от оси, которая направлена на север, север = 0 градусов:
        float degree = Math.round(event.values[0]);
        CompOrient.setText("Отклонение от севера: " + Float.toString(degree) + " градусов");

        //Создаем анимацию вращения:
        RotateAnimation rotateAnimation = new RotateAnimation(
                RotateDegree,
                -degree,
                Animation.RELATIVE_TO_SELF, 0.5f,
                Animation.RELATIVE_TO_SELF,
                0.5f);

        //Продолжительность анимации в миллисекундах:
        rotateAnimation.setDuration(200);

        //Настраиваем анимацию после завершения подсчетных действий датчика:
        rotateAnimation.setFillAfter(true);

        //Запускаем анимацию:
        kompas.startAnimation(rotateAnimation);
        RotateDegree = -degree;

    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {
        //Этот метод не используется, но без него программа будет ругаться
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
