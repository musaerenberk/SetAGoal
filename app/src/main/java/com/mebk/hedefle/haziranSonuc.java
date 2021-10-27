package com.mebk.hedefle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class haziranSonuc extends AppCompatActivity {
    EditText hzrnsnc;
    SharedPreferences sharedPreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_haziran_sonuc);
hzrnsnc= findViewById(R.id.editTextsnc);
        sharedPreferences = this.getSharedPreferences("com.mebk.hedefle", Context.MODE_PRIVATE);
        String storedText = sharedPreferences.getString("storedText6sonuc", "");
        hzrnsnc.setText(storedText);
    }
    public void kaydet(View view) {
        String userText = hzrnsnc.getText().toString();
        hzrnsnc.setHint(userText);
        sharedPreferences.edit().putString("storedText6sonuc", userText).apply();

    }
}