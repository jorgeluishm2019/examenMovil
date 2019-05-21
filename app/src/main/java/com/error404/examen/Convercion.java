package com.error404.examen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Convercion extends AppCompatActivity {
    private EditText et1;
    private TextView tv1;
    int resu=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_convercion);

        //Toast.makeText(getApplicationContext(), "hj", Toast.LENGTH_SHORT).show();
        Bundle bundle = getIntent().getExtras();
        int dato=bundle.getInt("celsius");
        int aux= dato;

        et1= (EditText)findViewById(R.id.et1);
        tv1=(TextView)findViewById(R.id.tv1);

        Toast.makeText(getApplicationContext(), ""+dato, Toast.LENGTH_SHORT).show();

    }
    public void operar(View view){
        //if(aux==1){
            String valor1=et1.getText().toString();
            int nro1= Integer.parseInt(valor1);
            resu=(nro1 * 9/5) + 32;
        //}
        tv1.setText(resu);
    }


}
