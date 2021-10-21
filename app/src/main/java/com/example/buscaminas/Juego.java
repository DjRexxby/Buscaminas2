package com.example.buscaminas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.preference.PreferenceManager;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class Juego extends AppCompatActivity {
    EditText consulta;
    TextView prueba;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juego);


        prueba = (TextView) findViewById(R.id.tv_prueba);

    }

    private void prueba(){
        SharedPreferences pref = getSharedPreferences("dificultad", Context.MODE_PRIVATE);

    }

}