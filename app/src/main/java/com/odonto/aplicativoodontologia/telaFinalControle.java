package com.odonto.aplicativoodontologia;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class telaFinalControle extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_final_controle);
    }

    public void passarPagina14(View view){

        SharedPreferences infor = getSharedPreferences("informacoes_salvas",0);
        SharedPreferences.Editor editor =  infor.edit();

        if(infor.contains("nomeEst")) {
            editor.putString("nomeEst", "");
        }
        if(infor.contains("nomePac")) {
            editor.putString("nomePac", "");
        }
        if(infor.contains("idade")) {
            editor.putString("idade", "");
        }
        if(infor.contains("sexo")) {
            editor.putString("sexo", "");
        }
        if(infor.contains("quest01")) {
            editor.putString("quest01", "");
        }
        if(infor.contains("quest02")) {
            editor.putString("quest02", "");
        }
        if(infor.contains("quest03")) {
            editor.putString("quest03", "");
        }
        if(infor.contains("quest04")) {
            editor.putString("quest04", "");
        }
        if(infor.contains("quest05")) {
            editor.putString("quest05", "");
        }
        if(infor.contains("quest06")) {
            editor.putString("quest06", "");
        }
        if(infor.contains("quest07")) {
            editor.putString("quest07", "");
        }
        if(infor.contains("quest08")) {
            editor.putString("quest08", "");
        }
        if(infor.contains("quest09")) {
            editor.putString("quest09", "");
        }
        if(infor.contains("quest10")) {
            editor.putString("quest10", "");
        }
        if(infor.contains("quest11")) {
            editor.putString("quest11", "");
        }
        if(infor.contains("quest12")) {
            editor.putString("quest12", "");
        }
        if(infor.contains("quest13")) {
            editor.putString("quest13", "");
        }
        if(infor.contains("quest14")) {
            editor.putString("quest14", "");
        }
        if(infor.contains("sgt")) {
            editor.putString("sgt", "");
        }
        if(infor.contains("casoControle")){
            editor.putString("casoControle", "");
        }
        editor.commit();
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);

    }
}


