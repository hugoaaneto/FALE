package com.odonto.aplicativoodontologia;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class quest06 extends AppCompatActivity {

    private ImageButton b02,b03, b04, b05, b06, b07, b08, b09, b10, b11, b12, b13, b14, b15;
    private TextView aviso;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quest06);

        aviso = findViewById(R.id.textView34);
        b02 = findViewById(R.id.imageButton30);
        b03 = findViewById(R.id.imageButton31);
        b04 = findViewById(R.id.imageButton32);
        b05 = findViewById(R.id.imageButton33);
        b06 = findViewById(R.id.imageButton34);
        b07 = findViewById(R.id.imageButton35);
        b08 = findViewById(R.id.imageButton36);
        b09 = findViewById(R.id.imageButton37);
        b10 = findViewById(R.id.imageButton38);
        b11 = findViewById(R.id.imageButton39);
        b12 = findViewById(R.id.imageButton40);
        b13 = findViewById(R.id.imageButton41);
        b14 = findViewById(R.id.imageButton42);
        b15 = findViewById(R.id.imageButton43);

        SharedPreferences infor = getSharedPreferences("informacoes_salvas",0);

        if(infor.contains("quest11")) {

            if(infor.getString("quest11", "").equals("")==false){

                b02.setAlpha((float) 0.5);
                b03.setAlpha((float) 0.5);
                b04.setAlpha((float) 0.5);
                b05.setAlpha((float) 0.5);
                b06.setAlpha((float) 0.5);
                b07.setAlpha((float) 0.5);
                b08.setAlpha((float) 0.5);

                if(infor.getString("quest11", "").equals("0")){
                    b02.setAlpha((float) 1.0);
                }else if(infor.getString("quest11", "").equals("1")){
                    b03.setAlpha((float) 1.0);
                }else if(infor.getString("quest11", "").equals("2")){
                    b04.setAlpha((float) 1.0);
                }else if(infor.getString("quest11", "").equals("3")){
                    b05.setAlpha((float) 1.0);
                }else if(infor.getString("quest11", "").equals("4")){
                    b06.setAlpha((float) 1.0);
                }else if(infor.getString("quest11", "").equals("5")){
                    b07.setAlpha((float) 1.0);
                }else if(infor.getString("quest11", "").equals("6")){
                    b08.setAlpha((float) 1.0);
                }

            }
        }

        if(infor.contains("quest12")) {

            if(infor.getString("quest12", "").equals("")==false){

                b09.setAlpha((float) 0.5);
                b10.setAlpha((float) 0.5);
                b11.setAlpha((float) 0.5);
                b12.setAlpha((float) 0.5);
                b13.setAlpha((float) 0.5);
                b14.setAlpha((float) 0.5);
                b15.setAlpha((float) 0.5);

                if(infor.getString("quest12", "").equals("0")){
                    b09.setAlpha((float) 1.0);
                }else if(infor.getString("quest12", "").equals("1")){
                    b10.setAlpha((float) 1.0);
                }else if(infor.getString("quest12", "").equals("2")){
                    b11.setAlpha((float) 1.0);
                }else if(infor.getString("quest12", "").equals("3")){
                    b12.setAlpha((float) 1.0);
                }else if(infor.getString("quest12", "").equals("4")){
                    b13.setAlpha((float) 1.0);
                }else if(infor.getString("quest12", "").equals("5")){
                    b14.setAlpha((float) 1.0);
                }else if(infor.getString("quest12", "").equals("6")){
                    b15.setAlpha((float) 1.0);
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

                editor.putString("quest11", "0");
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

                editor.putString("quest11", "1");
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

                editor.putString("quest11", "2");
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

                editor.putString("quest11", "3");
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

                editor.putString("quest11", "4");
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

                editor.putString("quest11", "5");
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

                editor.putString("quest11", "6");
                editor.commit();
            }

        });

        b09.setOnClickListener(new View.OnClickListener() {

            SharedPreferences infor = getSharedPreferences("informacoes_salvas",0);
            SharedPreferences.Editor editor =  infor.edit();

            public void onClick(View v) {

                b09.setAlpha((float) 1.0);
                b10.setAlpha((float) 0.5);
                b11.setAlpha((float) 0.5);
                b12.setAlpha((float) 0.5);
                b13.setAlpha((float) 0.5);
                b14.setAlpha((float) 0.5);
                b15.setAlpha((float) 0.5);

                editor.putString("quest12", "0");
                editor.commit();
            }

        });

        b10.setOnClickListener(new View.OnClickListener() {

            SharedPreferences infor = getSharedPreferences("informacoes_salvas",0);
            SharedPreferences.Editor editor =  infor.edit();

            public void onClick(View v) {

                b09.setAlpha((float) 0.5);
                b10.setAlpha((float) 1.0);
                b11.setAlpha((float) 0.5);
                b12.setAlpha((float) 0.5);
                b13.setAlpha((float) 0.5);
                b14.setAlpha((float) 0.5);
                b15.setAlpha((float) 0.5);

                editor.putString("quest12", "1");
                editor.commit();
            }

        });

        b11.setOnClickListener(new View.OnClickListener() {

            SharedPreferences infor = getSharedPreferences("informacoes_salvas",0);
            SharedPreferences.Editor editor =  infor.edit();

            public void onClick(View v) {

                b09.setAlpha((float) 0.5);
                b10.setAlpha((float) 0.5);
                b11.setAlpha((float) 1.0);
                b12.setAlpha((float) 0.5);
                b13.setAlpha((float) 0.5);
                b14.setAlpha((float) 0.5);
                b15.setAlpha((float) 0.5);

                editor.putString("quest12", "2");
                editor.commit();
            }

        });

        b12.setOnClickListener(new View.OnClickListener() {

            SharedPreferences infor = getSharedPreferences("informacoes_salvas",0);
            SharedPreferences.Editor editor =  infor.edit();

            public void onClick(View v) {

                b09.setAlpha((float) 0.5);
                b10.setAlpha((float) 0.5);
                b11.setAlpha((float) 0.5);
                b12.setAlpha((float) 1.0);
                b13.setAlpha((float) 0.5);
                b14.setAlpha((float) 0.5);
                b15.setAlpha((float) 0.5);

                editor.putString("quest12", "3");
                editor.commit();
            }

        });

        b13.setOnClickListener(new View.OnClickListener() {

            SharedPreferences infor = getSharedPreferences("informacoes_salvas",0);
            SharedPreferences.Editor editor =  infor.edit();

            public void onClick(View v) {

                b09.setAlpha((float) 0.5);
                b10.setAlpha((float) 0.5);
                b11.setAlpha((float) 0.5);
                b12.setAlpha((float) 0.5);
                b13.setAlpha((float) 1.0);
                b14.setAlpha((float) 0.5);
                b15.setAlpha((float) 0.5);

                editor.putString("quest12", "4");
                editor.commit();
            }

        });

        b14.setOnClickListener(new View.OnClickListener() {

            SharedPreferences infor = getSharedPreferences("informacoes_salvas",0);
            SharedPreferences.Editor editor =  infor.edit();

            public void onClick(View v) {

                b09.setAlpha((float) 0.5);
                b10.setAlpha((float) 0.5);
                b11.setAlpha((float) 0.5);
                b12.setAlpha((float) 0.5);
                b13.setAlpha((float) 0.5);
                b14.setAlpha((float) 1.0);
                b15.setAlpha((float) 0.5);

                editor.putString("quest12", "5");
                editor.commit();
            }

        });

        b15.setOnClickListener(new View.OnClickListener() {

            SharedPreferences infor = getSharedPreferences("informacoes_salvas",0);
            SharedPreferences.Editor editor =  infor.edit();

            public void onClick(View v) {

                b09.setAlpha((float) 0.5);
                b10.setAlpha((float) 0.5);
                b11.setAlpha((float) 0.5);
                b12.setAlpha((float) 0.5);
                b13.setAlpha((float) 0.5);
                b14.setAlpha((float) 0.5);
                b15.setAlpha((float) 1.0);

                editor.putString("quest12", "6");
                editor.commit();
            }

        });

    }

    public void passarPagina11(View view){

        SharedPreferences infor = getSharedPreferences("informacoes_salvas",0);
        SharedPreferences.Editor editor =  infor.edit();

        if((infor.getString("quest11", "").equals(""))||(infor.getString("quest12", "").equals(""))){
            aviso.setText("Faltou responder uma pergunta!");
        }else {
            aviso.setText("");
            Intent intent = new Intent(getApplicationContext(), quest07.class);
            startActivity(intent);
        }
    }
}
