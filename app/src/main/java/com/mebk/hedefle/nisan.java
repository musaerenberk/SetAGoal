package com.mebk.hedefle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class nisan extends AppCompatActivity {
    EditText nsn;
    SharedPreferences sharedPreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nisan); nsn = findViewById(R.id.editTextsnc);
        sharedPreferences = this.getSharedPreferences("com.mebk.hedefle", Context.MODE_PRIVATE);
        String storedText = sharedPreferences.getString("storedText4", "");
        nsn.setText(storedText);

    }
    public void geri(View view){
        Intent intent = new Intent(nisan.this,MainActivity2.class);
        startActivity(intent);
    }
    public void sonuc(View view){
        Intent intent = new Intent(nisan.this,nisanSonuc.class);
        startActivity(intent);
    }
    public void kaydet(View view) {
        String userText = nsn.getText().toString();
        nsn.setHint(userText);
        sharedPreferences.edit().putString("storedText4", userText).apply();

    }

}