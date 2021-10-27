package com.mebk.hedefle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class agustosSonuc extends AppCompatActivity {
    EditText agsS;
    SharedPreferences sharedPreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agustos_sonuc);
       agsS = findViewById(R.id.editTextsnc);
        sharedPreferences = this.getSharedPreferences("com.mebk.hedefle", Context.MODE_PRIVATE);
        String storedText = sharedPreferences.getString("storedText8sonuc", "");
        agsS.setText(storedText);
    }
    public void kaydet(View view) {
        String userText = agsS.getText().toString();
        agsS.setHint(userText);
        sharedPreferences.edit().putString("storedText8sonuc", userText).apply();

    }
}