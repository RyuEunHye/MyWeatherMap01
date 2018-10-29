package com.eun1225.myweathermap01;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide(); //액션바 숨김
        setContentView(R.layout.activity_main);

        TextView cityField;
        TextView updateField;
        TextView selectCity;
        TextView weatherIcon;
        TextView currentTmpField;
        TextView detailField;
        TextView humidity;
        ProgressBar loader;

        Typeface weatherFont;

        String city = "Seoul";
        String OPEN_WEATHER_MAP_API = "7f92838c96b3c712f2087bff4a8afc9f";

        cityField = (TextView)findViewById(R.id.city_field);
        updateField = (TextView)findViewById(R.id.update_field);
        selectCity = (TextView)findViewById(R.id.selectCity);
        weatherIcon = (TextView)findViewById(R.id.weather_icon);
        currentTmpField = (TextView)findViewById(R.id.current_temp_field);
        detailField = (TextView)findViewById(R.id.details_filed);
        humidity = (TextView)findViewById(R.id.humidity_field);
        loader=(ProgressBar)findViewById(R.id.loader);
        weatherFont =Typeface.createFromAsset(getAssets(),"fonts/weathericons-regular-webfont.ttf"); //폰트 설정
        weatherIcon.setTypeface(weatherFont);

    }
}
