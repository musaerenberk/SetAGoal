package com.mebk.hedefle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class mayis extends AppCompatActivity {
    EditText mys;
    SharedPreferences sharedPreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mayis);
mys= findViewById(R.id.editTextsnc);
        sharedPreferences = this.getSharedPreferences("com.mebk.hedefle", Context.MODE_PRIVATE);
        String storedText = sharedPreferences.getString("storedText5", "");
        mys.setText(storedText);
    }
    public void geri(View view){
        Intent intent = new Intent(mayis.this,MainActivity2.class);
        startActivity(intent);
    }
    public void sonuc(View view){
        Intent intent = new Intent(mayis.this,mayisSonuc.class);
        startActivity(intent);
    }
    public void kaydet(View view) {
        String userText = mys.getText().toString();
        mys.setHint(userText);
        sharedPreferences.edit().putString("storedText5", userText).apply();

    }

}