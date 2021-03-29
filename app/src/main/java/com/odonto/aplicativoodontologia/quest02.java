package com.odonto.aplicativoodontologia;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class quest02 extends AppCompatActivity {

    private ImageButton b02,b03, b04, b05, b06, b07, b08, b09, b10, b11, b12, b13, b14, b15;
    private TextView aviso;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quest02);

        aviso = findViewById(R.id.textView30);
        b02 = findViewById(R.id.imageButton16);
        b03 = findViewById(R.id.imageButton17);
        b04 = findViewById(R.id.imageButton18);
        b05 = findViewById(R.id.imageButton19);
        b06 = findViewById(R.id.imageButton20);
        b07 = findViewById(R.id.imageButton21);
        b08 = findViewById(R.id.imageButton22);
        b09 = findViewById(R.id.imageButton23);
        b10 = findViewById(R.id.imageButton24);
        b11 = findViewById(R.id.imageButton25);
        b12 = findViewById(R.id.imageButton26);
        b13 = findViewById(R.id.imageButton27);
        b14 = findViewById(R.id.imageButton28);
        b15 = findViewById(R.id.imageButton29);

        SharedPreferences infor = getSharedPreferences("informacoes_salvas",0);

        if(infor.contains("quest03")) {

            if(infor.getString("quest03", "").equals("")==false){

                b02.setAlpha((float) 0.5);
                b03.setAlpha((float) 0.5);
                b04.setAlpha((float) 0.5);
                b05.setAlpha((float) 0.5);
                b06.setAlpha((float) 0.5);
                b07.setAlpha((float) 0.5);
                b08.setAlpha((float) 0.5);

                if(infor.getString("quest03", "").equals("0")){
                    b02.setAlpha((float) 1.0);
                }else if(infor.getString("quest03", "").equals("1")){
                    b03.setAlpha((float) 1.0);
                }else if(infor.getString("quest03", "").equals("2")){
                    b04.setAlpha((float) 1.0);
                }else if(infor.getString("quest03", "").equals("3")){
                    b05.setAlpha((float) 1.0);
                }else if(infor.getString("quest03", "").equals("4")){
                    b06.setAlpha((float) 1.0);
                }else if(infor.getString("quest03", "").equals("5")){
                    b07.setAlpha((float) 1.0);
                }else if(infor.getString("quest03", "").equals("6")){
                    b08.setAlpha((float) 1.0);
                }

            }
        }

        if(infor.contains("quest04")) {

            if(infor.getString("quest04", "").equals("")==false){

                b09.setAlpha((float) 0.5);
                b10.setAlpha((float) 0.5);
                b11.setAlpha((float) 0.5);
                b12.setAlpha((float) 0.5);
                b13.setAlpha((float) 0.5);
                b14.setAlpha((float) 0.5);
                b15.setAlpha((float) 0.5);

                if(infor.getString("quest04", "").equals("0")){
                    b09.setAlpha((float) 1.0);
                }else if(infor.getString("quest04", "").equals("1")){
                    b10.setAlpha((float) 1.0);
                }else if(infor.getString("quest04", "").equals("2")){
                    b11.setAlpha((float) 1.0);
                }else if(infor.getString("quest04", "").equals("3")){
                    b12.setAlpha((float) 1.0);
                }else if(infor.getString("quest04", "").equals("4")){
                    b13.setAlpha((float) 1.0);
                }else if(infor.getString("quest04", "").equals("5")){
                    b14.setAlpha((float) 1.0);
                }else if(infor.getString("quest04", "").equals("6")){
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

                editor.putString("quest03", "0");
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

                editor.putString("quest03", "1");
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

                editor.putString("quest03", "2");
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

                editor.putString("quest03", "3");
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

                editor.putString("quest03", "4");
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

                editor.putString("quest03", "5");
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

                editor.putString("quest03", "6");
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

                editor.putString("quest04", "0");
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

                editor.putString("quest04", "1");
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

                editor.putString("quest04", "2");
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

                editor.putString("quest04", "3");
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

                editor.putString("quest04", "4");
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

                editor.putString("quest04", "5");
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

                editor.putString("quest04", "6");
                editor.commit();
            }

        });
    }



    public void passarPagina7(View view){

        SharedPreferences infor = getSharedPreferences("informacoes_salvas",0);
        SharedPreferences.Editor editor =  infor.edit();

        if((infor.getString("quest03", "").equals(""))||(infor.getString("quest04", "").equals(""))){
            aviso.setText("Faltou responder uma pergunta!");
        }else {
            aviso.setText("");
            Intent intent = new Intent(getApplicationContext(), quest03.class);
            startActivity(intent);
        }
    }

}
