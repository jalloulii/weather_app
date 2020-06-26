package com.example.weather_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {
private TextInputLayout search_place_name;
private Button search_btn;
private TextView city_name,time_updated_at,sky_type,C,min_temp,max_temp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        search_btn = findViewById(R.id.button_search);
        search_place_name = findViewById(R.id.input_search);
        city_name = findViewById(R.id.city_name);
        time_updated_at= findViewById(R.id.time_updated_at);
        sky_type = findViewById(R.id.sky_type);
        C = findViewById(R.id.C);
        min_temp=findViewById(R.id.min_temp);
        max_temp = findViewById(R.id.max_temp);
        
    }
}