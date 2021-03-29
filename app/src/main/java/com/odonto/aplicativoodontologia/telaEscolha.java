package com.odonto.aplicativoodontologia;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

public class telaEscolha extends AppCompatActivity {

    private CheckBox cb1, cb2;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_escolha);

        cb1 = findViewById(R.id.grupo1);
        cb2 = findViewById(R.id.grupo2);



        cb1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                SharedPreferences infor = getSharedPreferences("informacoes_salvas",0);
                SharedPreferences.Editor editor =  infor.edit();

                editor.putString("casoControle", "0");
                editor.commit();
                Intent intent = new Intent(getApplicationContext(), tela2.class);
                startActivity(intent);

            }
        });
        cb2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                SharedPreferences infor = getSharedPreferences("informacoes_salvas",0);
                SharedPreferences.Editor editor =  infor.edit();

                editor.putString("casoControle", "1");
                editor.commit();
                Intent intent = new Intent(getApplicationContext(), tela2Controle.class);
                startActivity(intent);

            }
        });
    }
}
