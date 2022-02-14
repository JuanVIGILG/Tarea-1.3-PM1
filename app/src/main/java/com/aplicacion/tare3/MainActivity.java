package com.aplicacion.tare3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnlista = (Button)findViewById(R.id.btnlista);
        Button btningresar = (Button)findViewById(R.id.btningresar);
        Button btneditar = (Button)findViewById(R.id.btneditar);

        btningresar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(), ActivityIngresar.class);
                startActivity(intent);
            }
        });

        btneditar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ActivityConsulta.class);
                startActivity(intent);
            }
        });

        btnlista.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ActivityListView.class);
                startActivity(intent);
            }
        });
    }

    public void clickNew(View view){
        Intent intent = new Intent(this, ActivityIngresar.class);
        startActivity(intent);
    }

    public void clickNew2(View view) {
        Intent intent = new Intent(this, ActivityConsulta.class);
        startActivity(intent);
    }

}