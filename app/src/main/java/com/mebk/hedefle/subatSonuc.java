package com.mebk.hedefle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class subatSonuc extends AppCompatActivity {
    EditText sbtsnc;
    SharedPreferences sharedPreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_subat_sonuc);
        sbtsnc = findViewById(R.id.editTextsnc);
        sharedPreferences = this.getSharedPreferences("com.mebk.hedefle", Context.MODE_PRIVATE);
        String storedText = sharedPreferences.getString("storedText2sonuc", "");
        sbtsnc.setText(storedText);

    }
    public void kaydet(View view) {
        String userText = sbtsnc.getText().toString();
        sbtsnc.setHint(userText);
        sharedPreferences.edit().putString("storedText2sonuc", userText).apply();

    }
}