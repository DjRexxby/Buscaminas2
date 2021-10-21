package com.example.buscaminas;

import android.os.Bundle;
import android.preference.PreferenceActivity;

import androidx.annotation.Nullable;

public class Settings extends PreferenceActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.config);
    }
}
