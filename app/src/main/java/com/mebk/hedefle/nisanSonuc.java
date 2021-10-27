package com.mebk.hedefle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class nisanSonuc extends AppCompatActivity {
    EditText nsnsnc;
    SharedPreferences sharedPreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nisan_sonuc);

nsnsnc =findViewById(R.id.editTextsnc);
        sharedPreferences = this.getSharedPreferences("com.mebk.hedefle", Context.MODE_PRIVATE);
        String storedText = sharedPreferences.getString("storedText4sonuc", "");
        nsnsnc.setText(storedText);
    }
    public void kaydet(View view) {
        String userText = nsnsnc.getText().toString();
        nsnsnc.setHint(userText);
        sharedPreferences.edit().putString("storedText4sonuc", userText).apply();

    }
}