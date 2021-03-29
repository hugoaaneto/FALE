package com.odonto.aplicativoodontologia;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class tela5 extends AppCompatActivity {

    private CheckBox fem, mas;
    private EditText nome;
    private EditText idade;
    private String idPac;
    private TextView aviso2;

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela5);

        fem = findViewById(R.id.checkBox2);
        mas = findViewById(R.id.checkBox);
        nome = findViewById(R.id.editNome);
        aviso2 = findViewById(R.id.aviso02);
        idade = findViewById(R.id.editIdade);

        SharedPreferences infor = getSharedPreferences("informacoes_salvas",0);

        if(infor.contains("nomePac")) {
            idPac = infor.getString("nomePac", "");
            nome.setText(idPac);
        }
        if(infor.contains("idade")) {
            idade.setText(infor.getString("idade", ""));
        }
        if(infor.contains("sexo")) {
            if(infor.getString("sexo", "").equals("fem")){
                fem.toggle();
            }else if(infor.getString("sexo", "").equals("mas")){
                mas.toggle();
            }

        }

        fem.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                if(mas.isChecked()){
                    mas.toggle();
                }
            }
        });

        mas.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                if(fem.isChecked()){
                    fem.toggle();
                }
            }
        });


    }

    public void passarPagina5(View view){

        int idad;
        idPac = nome.getText().toString();
        String aux = idade.getText().toString();

        SharedPreferences infor = getSharedPreferences("informacoes_salvas",0);
        SharedPreferences.Editor editor =  infor.edit();

        if(aux.equals("")){
            idad = -1;
        }else{
            idad = Integer.parseInt(aux);
        }

        if(idPac.equals("")){

            aviso2.setText("Digite o seu nome!");


        }else if(idad == -1){

            aviso2.setText("Coloque sua idade!");

        }else if((idad >= 100)||(idad <= 0)){

            aviso2.setText("Coloque uma idade valida!");

        }else if((!fem.isChecked())&&(!mas.isChecked())){

            aviso2.setText("Faltou informar o sexo!");


        }else{

            aviso2.setText("");
            editor.putString("nomePac", idPac);
            editor.putString("idade", aux);
            if(fem.isChecked()){
                editor.putString("sexo", "fem");
            }else{
                editor.putString("sexo", "mas");
            }


            editor.commit();
            if(infor.getString("casoControle", "").equals("1")){
                Intent intent = new Intent(getApplicationContext(), quest01Controle.class);
                startActivity(intent);
            }else{
                Intent intent = new Intent(getApplicationContext(), quest01.class);
                startActivity(intent);
            }


        }


    }





}
