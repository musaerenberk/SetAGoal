package com.mebk.hedefle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class kasim extends AppCompatActivity {
    EditText ksm;
    SharedPreferences sharedPreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kasim);
       ksm = findViewById(R.id.editTextsnc);
        sharedPreferences = this.getSharedPreferences("com.mebk.hedefle", Context.MODE_PRIVATE);
        String storedText = sharedPreferences.getString("storedText11", "");
        ksm.setText(storedText);

    }
    public void geri(View view){
        Intent intent = new Intent(kasim.this,MainActivity2.class);
        startActivity(intent);
    }
    public void sonuc(View view){
        Intent intent = new Intent(kasim.this,kasimSonuc.class);
        startActivity(intent);
    }
    public void kaydet(View view) {
        String userText = ksm.getText().toString();
        ksm.setHint(userText);
        sharedPreferences.edit().putString("storedText11", userText).apply();

    }
}