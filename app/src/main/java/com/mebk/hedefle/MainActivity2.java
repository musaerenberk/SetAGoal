package com.mebk.hedefle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void anaSayfaya(View view){
        Intent intent = new Intent(MainActivity2.this,MainActivity.class);
        startActivity(intent);
    }

    public void ocak(View view){
        Intent intent = new Intent(MainActivity2.this,ocak.class);
        startActivity(intent);
    }
    public void subat(View view){
        Intent intent = new Intent(MainActivity2.this,subat.class);
        startActivity(intent);
    }
    public void mart(View view){
        Intent intent = new Intent(MainActivity2.this,mart.class);
        startActivity(intent);
    }
    public void nisan(View view){
        Intent intent = new Intent(MainActivity2.this,nisan.class);
        startActivity(intent);
    }
    public void mayis(View view){
        Intent intent = new Intent(MainActivity2.this,mayis.class);
        startActivity(intent);
    }
    public void haziran(View view){
        Intent intent = new Intent(MainActivity2.this,haziran.class);
        startActivity(intent);
    }
    public void temmuz(View view){
        Intent intent = new Intent(MainActivity2.this,temmuz.class);
        startActivity(intent);
    }
    public void agustos(View view){
        Intent intent = new Intent(MainActivity2.this,agustos.class);
        startActivity(intent);
    }
    public void eylul(View view){
        Intent intent = new Intent(MainActivity2.this,eylul.class);
        startActivity(intent);
    }
    public void ekim(View view){
        Intent intent = new Intent(MainActivity2.this,ekim.class);
        startActivity(intent);
    }
    public void kasim(View view){
        Intent intent = new Intent(MainActivity2.this,kasim.class);
        startActivity(intent);
    }
    public void aralik(View view){
        Intent intent = new Intent(MainActivity2.this,aralik.class);
        startActivity(intent);
    }
}