package com.example.buscaminas;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    static final int ACTIV_JUEGO = 0;
    ImageView iv_juego;
    Button btn_Score,btn_Settings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iv_juego = (ImageView) findViewById(R.id.iv_play);
        btn_Score = (Button) findViewById(R.id.btn_score);
        btn_Settings = (Button) findViewById(R.id.btn_dificultad);
    }



    public void goPlay(View v) {
        startActivity(new Intent(MainActivity.this, Juego.class));
    }

    public void goSettings(View view) {
        startActivity(new Intent(MainActivity.this, Settings.class));
    }

    public void goScore(View view) {
        startActivity(new Intent(MainActivity.this, Score.class));
    }
}