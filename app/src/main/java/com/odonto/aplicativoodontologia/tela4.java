package com.odonto.aplicativoodontologia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class tela4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela4);
    }

    public void passarPagina4(View view){

        Intent intent = new Intent(getApplicationContext(), tela5.class);
        startActivity(intent);

    }

}
