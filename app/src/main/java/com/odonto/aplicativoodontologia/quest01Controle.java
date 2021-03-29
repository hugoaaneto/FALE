package com.odonto.aplicativoodontologia;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class quest01Controle extends AppCompatActivity {

    private ImageButton b02,b03, b04, b05, b06, b07, b08;
    private TextView aviso;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quest01_controle);

        aviso = findViewById(R.id.textView28);
        b02 = findViewById(R.id.imageButton);
        b03 = findViewById(R.id.imageButton51);
        b04 = findViewById(R.id.imageButton52);
        b05 = findViewById(R.id.imageButton53);
        b06 = findViewById(R.id.imageButton54);
        b07 = findViewById(R.id.imageButton55);
        b08 = findViewById(R.id.imageButton56);

        SharedPreferences infor = getSharedPreferences("informacoes_salvas",0);

        if(infor.contains("quest01")) {

            if(infor.getString("quest01", "").equals("")==false){

                b02.setAlpha((float) 0.5);
                b03.setAlpha((float) 0.5);
                b04.setAlpha((float) 0.5);
                b05.setAlpha((float) 0.5);
                b06.setAlpha((float) 0.5);
                b07.setAlpha((float) 0.5);
                b08.setAlpha((float) 0.5);

                if(infor.getString("quest01", "").equals("0")){
                    b02.setAlpha((float) 1.0);
                }else if(infor.getString("quest01", "").equals("1")){
                    b03.setAlpha((float) 1.0);
                }else if(infor.getString("quest01", "").equals("2")){
                    b04.setAlpha((float) 1.0);
                }else if(infor.getString("quest01", "").equals("3")){
                    b05.setAlpha((float) 1.0);
                }else if(infor.getString("quest01", "").equals("4")){
                    b06.setAlpha((float) 1.0);
                }else if(infor.getString("quest01", "").equals("5")){
                    b07.setAlpha((float) 1.0);
                }else if(infor.getString("quest01", "").equals("6")){
                    b08.setAlpha((float) 1.0);
                }

            }
        }

        b02.setOnClickListener(new View.OnClickListener() {

            SharedPreferences infor = getSharedPreferences("informacoes_salvas",0);
            SharedPreferences.Editor editor =  infor.edit();

            public void onClick(View v) {

                b02.setAlpha((float) 1.0);
                b03.setAlpha((float) 0.5);
                b04.setAlpha((float) 0.5);
                b05.setAlpha((float) 0.5);
                b06.setAlpha((float) 0.5);
                b07.setAlpha((float) 0.5);
                b08.setAlpha((float) 0.5);

                editor.putString("quest01", "0");
                editor.commit();
            }

        });

        b03.setOnClickListener(new View.OnClickListener() {

            SharedPreferences infor = getSharedPreferences("informacoes_salvas",0);
            SharedPreferences.Editor editor =  infor.edit();

            public void onClick(View v) {

                b02.setAlpha((float) 0.5);
                b03.setAlpha((float) 1.0);
                b04.setAlpha((float) 0.5);
                b05.setAlpha((float) 0.5);
                b06.setAlpha((float) 0.5);
                b07.setAlpha((float) 0.5);
                b08.setAlpha((float) 0.5);

                editor.putString("quest01", "1");
                editor.commit();
            }

        });

        b04.setOnClickListener(new View.OnClickListener() {

            SharedPreferences infor = getSharedPreferences("informacoes_salvas",0);
            SharedPreferences.Editor editor =  infor.edit();

            public void onClick(View v) {

                b02.setAlpha((float) 0.5);
                b03.setAlpha((float) 0.5);
                b04.setAlpha((float) 1.0);
                b05.setAlpha((float) 0.5);
                b06.setAlpha((float) 0.5);
                b07.setAlpha((float) 0.5);
                b08.setAlpha((float) 0.5);

                editor.putString("quest01", "2");
                editor.commit();
            }

        });

        b05.setOnClickListener(new View.OnClickListener() {

            SharedPreferences infor = getSharedPreferences("informacoes_salvas",0);
            SharedPreferences.Editor editor =  infor.edit();

            public void onClick(View v) {

                b02.setAlpha((float) 0.5);
                b03.setAlpha((float) 0.5);
                b04.setAlpha((float) 0.5);
                b05.setAlpha((float) 1.0);
                b06.setAlpha((float) 0.5);
                b07.setAlpha((float) 0.5);
                b08.setAlpha((float) 0.5);

                editor.putString("quest01", "3");
                editor.commit();
            }

        });

        b06.setOnClickListener(new View.OnClickListener() {

            SharedPreferences infor = getSharedPreferences("informacoes_salvas",0);
            SharedPreferences.Editor editor =  infor.edit();

            public void onClick(View v) {

                b02.setAlpha((float) 0.5);
                b03.setAlpha((float) 0.5);
                b04.setAlpha((float) 0.5);
                b05.setAlpha((float) 0.5);
                b06.setAlpha((float) 1.0);
                b07.setAlpha((float) 0.5);
                b08.setAlpha((float) 0.5);

                editor.putString("quest01", "4");
                editor.commit();
            }

        });

        b07.setOnClickListener(new View.OnClickListener() {

            SharedPreferences infor = getSharedPreferences("informacoes_salvas",0);
            SharedPreferences.Editor editor =  infor.edit();

            public void onClick(View v) {

                b02.setAlpha((float) 0.5);
                b03.setAlpha((float) 0.5);
                b04.setAlpha((float) 0.5);
                b05.setAlpha((float) 0.5);
                b06.setAlpha((float) 0.5);
                b07.setAlpha((float) 1.0);
                b08.setAlpha((float) 0.5);

                editor.putString("quest01", "5");
                editor.commit();
            }

        });

        b08.setOnClickListener(new View.OnClickListener() {

            SharedPreferences infor = getSharedPreferences("informacoes_salvas",0);
            SharedPreferences.Editor editor =  infor.edit();

            public void onClick(View v) {

                b02.setAlpha((float) 0.5);
                b03.setAlpha((float) 0.5);
                b04.setAlpha((float) 0.5);
                b05.setAlpha((float) 0.5);
                b06.setAlpha((float) 0.5);
                b07.setAlpha((float) 0.5);
                b08.setAlpha((float) 1.0);

                editor.putString("quest01", "6");
                editor.commit();
            }

        });
    }

    public void passarPagEspera(View view){

        SharedPreferences infor = getSharedPreferences("informacoes_salvas",0);
        SharedPreferences.Editor editor =  infor.edit();

        if(infor.getString("quest01", "").equals("")){
            aviso.setText("Faltou responder uma pergunta!");
        }else {
            aviso.setText("");
            Intent intent = new Intent(getApplicationContext(), espera.class);
            startActivity(intent);
        }
    }
}
