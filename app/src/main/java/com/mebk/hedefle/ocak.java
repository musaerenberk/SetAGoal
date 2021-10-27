package com.mebk.hedefle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ocak extends AppCompatActivity {
    EditText editTextOcak;
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ocak);

        editTextOcak = findViewById(R.id.editTextsnc);
        sharedPreferences = this.getSharedPreferences("com.mebk.hedefle", Context.MODE_PRIVATE);
        String storedText = sharedPreferences.getString("storedText", "");
        editTextOcak.setText(storedText);
    }

    public void geri(View view) {
        Intent intent = new Intent(ocak.this, MainActivity2.class);
        startActivity(intent);
    }

    public void sonuc(View view) {
        Intent intent = new Intent(ocak.this, ocakSonuc.class);
        startActivity(intent);
    }

    public void kaydet(View view) {
            String userText = editTextOcak.getText().toString();
            editTextOcak.setHint(userText);
            sharedPreferences.edit().putString("storedText", userText).apply();

    }
}

