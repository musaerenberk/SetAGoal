package com.mebk.hedefle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class temmuzSonuc extends AppCompatActivity {
    EditText temmuzsnc;
    SharedPreferences sharedPreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temmuz_sonuc);
        temmuzsnc= findViewById(R.id.editTextsnc);
        sharedPreferences = this.getSharedPreferences("com.mebk.hedefle", Context.MODE_PRIVATE);
        String storedText = sharedPreferences.getString("storedText7sonuc", "");
        temmuzsnc.setText(storedText);
    }
    public void kaydet(View view) {
        String userText = temmuzsnc.getText().toString();
        temmuzsnc.setHint(userText);
        sharedPreferences.edit().putString("storedText7sonuc", userText).apply();

    }
}