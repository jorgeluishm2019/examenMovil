package com.error404.examen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void bt1(View view){
        Intent i=  new Intent(this,Convercion.class);
        i.putExtra("celsius", 1);
        startActivity(i);
        //int a =1;
        //Toast.makeText(getApplicationContext(), "Celsius to Fahreheit", Toast.LENGTH_SHORT).show();
    }
    public void bt2(View view){
        Intent i=  new Intent(this,Convercion.class);
        i.putExtra("celsius", 2);
        startActivity(i);
        //int a =1;
        //Toast.makeText(getApplicationContext(), "Celsius to Fahreheit", Toast.LENGTH_SHORT).show();
    }
    public void bt3(View view){
        Intent i=  new Intent(this,Convercion.class);
        i.putExtra("celsius", 3);
        startActivity(i);
        //int a =1;
        //Toast.makeText(getApplicationContext(), "Celsius to Fahreheit", Toast.LENGTH_SHORT).show();
    }
    public void bt4(View view){
        Intent i=  new Intent(this,Convercion.class);
        i.putExtra("celsius", 4);
        startActivity(i);
        //int a =1;
        //Toast.makeText(getApplicationContext(), "Celsius to Fahreheit", Toast.LENGTH_SHORT).show();
    }
    public void bt5(View view){
        Intent i=  new Intent(this,Convercion.class);
        i.putExtra("celsius", 5);
        startActivity(i);
        //int a =1;
        //Toast.makeText(getApplicationContext(), "Celsius to Fahreheit", Toast.LENGTH_SHORT).show();
    }
    public void bt6(View view){
        Intent i=  new Intent(this,Convercion.class);
        i.putExtra("celsius", 6);
        startActivity(i);
        //int a =1;
        //Toast.makeText(getApplicationContext(), "Celsius to Fahreheit", Toast.LENGTH_SHORT).show();
    }
    public void bt7(View view){
        Intent i=  new Intent(this,Convercion.class);
        i.putExtra("celsius", 7);
        startActivity(i);
        //int a =1;
        //Toast.makeText(getApplicationContext(), "Celsius to Fahreheit", Toast.LENGTH_SHORT).show();
    }
    public void bt8(View view){
        Intent i=  new Intent(this,Convercion.class);
        i.putExtra("celsius", 8);
        startActivity(i);
        //int a =1;
        //Toast.makeText(getApplicationContext(), "Celsius to Fahreheit", Toast.LENGTH_SHORT).show();
    }

}
