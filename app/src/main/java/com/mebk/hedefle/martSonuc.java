package com.mebk.hedefle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class martSonuc extends AppCompatActivity {
    EditText mrtSnc;
    SharedPreferences sharedPreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mart_sonuc);
        mrtSnc = findViewById(R.id.editTextsnc);
        sharedPreferences = this.getSharedPreferences("com.mebk.hedefle", Context.MODE_PRIVATE);
        String storedText = sharedPreferences.getString("storedText3sonuc", "");
        mrtSnc.setText(storedText);
    }
    public void kaydet(View view) {
        String userText = mrtSnc.getText().toString();
        mrtSnc.setHint(userText);
        sharedPreferences.edit().putString("storedText3sonuc", userText).apply();

    }
}