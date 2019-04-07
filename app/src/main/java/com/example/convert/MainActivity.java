package com.example.convert;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class MainActivity extends AppCompatActivity {
    String[] chose = { "ریال", "دلار", "یورو"};
    String[] convert = { "ریال","دلار","یورو"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            Spinner ch =findViewById(R.id.spinner_chose);
            Spinner co =  findViewById(R.id.spinner_convert);


            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,  android.R.layout.simple_dropdown_item_1line,chose);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        ArrayAdapter<String> adapterConvert = new ArrayAdapter<String>(this,  android.R.layout.simple_dropdown_item_1line,convert);
        adapterConvert.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

            ch.setAdapter(adapter);
            ch.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {



                @Override
                public void onItemSelected(AdapterView<?> arg0, View arg1, int position, long id) {
                    Toast.makeText(MainActivity.this,"U Choosed : " +  chose[position],Toast.LENGTH_SHORT).show();
                }

                @Override
                public void onNothingSelected(AdapterView<?> arg0) {

                }
            });

        co.setAdapter(adapter);
        co.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {



            @Override
            public void onItemSelected(AdapterView<?> arg0, View arg1, int position, long id) {
                Toast.makeText(MainActivity.this,"U Choosed : " +  convert[position],Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {

            }
        });

        }
    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }
    }
