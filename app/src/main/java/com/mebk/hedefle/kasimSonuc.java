package com.mebk.hedefle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class kasimSonuc extends AppCompatActivity {
    EditText ksmSnc;
    SharedPreferences sharedPreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kasim_sonuc);
       ksmSnc = findViewById(R.id.editTextsnc);
        sharedPreferences = this.getSharedPreferences("com.mebk.hedefle", Context.MODE_PRIVATE);
        String storedText = sharedPreferences.getString("storedText11snc", "");
        ksmSnc.setText(storedText);
    }
    public void kaydet(View view) {
        String userText = ksmSnc.getText().toString();
        ksmSnc.setHint(userText);
        sharedPreferences.edit().putString("storedText11snc", userText).apply();

    }
}