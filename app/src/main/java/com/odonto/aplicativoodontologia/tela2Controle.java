package com.odonto.aplicativoodontologia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class tela2Controle extends AppCompatActivity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2_controle);
    }

    public void passarPagina2(View view){

        Intent intent = new Intent(getApplicationContext(), tela3Controle.class);
        startActivity(intent);

    }
}
