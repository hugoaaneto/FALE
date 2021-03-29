package com.odonto.aplicativoodontologia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class tela3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela3);
    }

    public void passarPagina3(View view){

        Intent intent = new Intent(getApplicationContext(), tela4.class);
        startActivity(intent);

    }

}
