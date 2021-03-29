package com.odonto.aplicativoodontologia;

import android.content.Intent;
import android.content.SharedPreferences;
import android.view.View;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private TextView aviso1;
    private EditText estudante;
    private String idEst;
    private static final String INFORMACOES_SALVAS = "informacoes_salvas";

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        estudante = findViewById(R.id.idUni);
        aviso1 = findViewById(R.id.aviso01);

        // evitar perda de dados
        SharedPreferences infor = getSharedPreferences(INFORMACOES_SALVAS,0);

        if(infor.contains("nomeEst")) {
            idEst = infor.getString("nomeEst", "");
            estudante.setText(idEst);
        }
        // fim do mecanisco de resgate de informacoes
    }

    public void idUniversitario(View view){

        idEst = estudante.getText().toString();


        SharedPreferences infor = getSharedPreferences(INFORMACOES_SALVAS,0);
        SharedPreferences.Editor editor =  infor.edit();

        if(idEst.equals("")){

            aviso1.setText("Digite o código do estudante!");

        }else{

            aviso1.setText("");
            editor.putString("nomeEst", idEst);
            editor.commit();

            Intent intent = new Intent(getApplicationContext(), telaEscolha.class);
            startActivity(intent);


        }
    }


}
