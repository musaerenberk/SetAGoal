package com.mebk.hedefle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class mayisSonuc extends AppCompatActivity {
    EditText mysSnc;
    SharedPreferences sharedPreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mayis_sonuc);
       mysSnc = findViewById(R.id.editTextsnc);
        sharedPreferences = this.getSharedPreferences("com.mebk.hedefle", Context.MODE_PRIVATE);
        String storedText = sharedPreferences.getString("storedText5sonuc", "");
        mysSnc.setText(storedText);
    }
    public void kaydet(View view) {
        String userText = mysSnc.getText().toString();
        mysSnc.setHint(userText);
        sharedPreferences.edit().putString("storedText5sonuc", userText).apply();

    }
}