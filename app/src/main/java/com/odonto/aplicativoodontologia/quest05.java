package com.odonto.aplicativoodontologia;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class quest05 extends AppCompatActivity {

    private CheckBox cb1, cb2, cb3, cb4, cb5, cb6, cb7, cb8, cb9, cb10, cb11, cb12, cb13, cb14;
    private TextView aviso;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quest05);

        aviso = findViewById(R.id.textView33);
        cb1 = findViewById(R.id.checkBox29);
        cb2 = findViewById(R.id.checkBox30);
        cb3 = findViewById(R.id.checkBox31);
        cb4 = findViewById(R.id.checkBox32);
        cb5 = findViewById(R.id.checkBox33);
        cb6 = findViewById(R.id.checkBox34);
        cb7 = findViewById(R.id.checkBox35);
        cb8 = findViewById(R.id.checkBox36);
        cb9 = findViewById(R.id.checkBox37);
        cb10 = findViewById(R.id.checkBox38);
        cb11 = findViewById(R.id.checkBox39);
        cb12 = findViewById(R.id.checkBox40);
        cb13 = findViewById(R.id.checkBox41);
        cb14 = findViewById(R.id.checkBox42);

        SharedPreferences infor = getSharedPreferences("informacoes_salvas",0);

        if(infor.contains("quest09")) {

            if(cb1.isChecked()){
                cb1.toggle();
            }
            if(cb2.isChecked()){
                cb2.toggle();
            }
            if(cb3.isChecked()){
                cb3.toggle();
            }
            if(cb4.isChecked()){
                cb4.toggle();
            }
            if(cb5.isChecked()){
                cb5.toggle();
            }
            if(cb6.isChecked()){
                cb6.toggle();
            }
            if(cb7.isChecked()){
                cb7.toggle();
            }

            if(infor.getString("quest09", "").equals("")==false){


                if(infor.getString("quest09", "").equals("0")){
                    cb1.toggle();
                }else if(infor.getString("quest09", "").equals("1")){
                    cb2.toggle();
                }else if(infor.getString("quest09", "").equals("2")){
                    cb3.toggle();
                }else if(infor.getString("quest09", "").equals("3")){
                    cb4.toggle();
                }else if(infor.getString("quest09", "").equals("4")){
                    cb5.toggle();
                }else if(infor.getString("quest09", "").equals("5")){
                    cb6.toggle();
                }else if(infor.getString("quest09", "").equals("6")){
                    cb7.toggle();
                }

            }
        }

        if(infor.contains("quest10")) {

            if(cb8.isChecked()){
                cb8.toggle();
            }
            if(cb9.isChecked()){
                cb9.toggle();
            }
            if(cb10.isChecked()){
                cb10.toggle();
            }
            if(cb11.isChecked()){
                cb11.toggle();
            }
            if(cb12.isChecked()){
                cb12.toggle();
            }
            if(cb13.isChecked()){
                cb13.toggle();
            }
            if(cb14.isChecked()){
                cb14.toggle();
            }

            if(infor.getString("quest10", "").equals("")==false){


                if(infor.getString("quest10", "").equals("0")){
                    cb8.toggle();
                }else if(infor.getString("quest10", "").equals("1")){
                    cb9.toggle();
                }else if(infor.getString("quest10", "").equals("2")){
                    cb10.toggle();
                }else if(infor.getString("quest10", "").equals("3")){
                    cb11.toggle();
                }else if(infor.getString("quest10", "").equals("4")){
                    cb12.toggle();
                }else if(infor.getString("quest10", "").equals("5")){
                    cb13.toggle();
                }else if(infor.getString("quest10", "").equals("6")){
                    cb14.toggle();
                }

            }
        }

        cb1.setOnClickListener(new View.OnClickListener() {

            SharedPreferences infor = getSharedPreferences("informacoes_salvas",0);
            SharedPreferences.Editor editor =  infor.edit();

            public void onClick(View v) {

                if(cb2.isChecked()){
                    cb2.toggle();
                }
                if(cb3.isChecked()){
                    cb3.toggle();
                }
                if(cb4.isChecked()){
                    cb4.toggle();
                }
                if(cb5.isChecked()){
                    cb5.toggle();
                }
                if(cb6.isChecked()){
                    cb6.toggle();
                }
                if(cb7.isChecked()){
                    cb7.toggle();
                }

                editor.putString("quest09", "0");
                editor.commit();
            }
        });
        cb2.setOnClickListener(new View.OnClickListener() {

            SharedPreferences infor = getSharedPreferences("informacoes_salvas",0);
            SharedPreferences.Editor editor =  infor.edit();

            public void onClick(View v) {

                if(cb1.isChecked()){
                    cb1.toggle();
                }
                if(cb3.isChecked()){
                    cb3.toggle();
                }
                if(cb4.isChecked()){
                    cb4.toggle();
                }
                if(cb5.isChecked()){
                    cb5.toggle();
                }
                if(cb6.isChecked()){
                    cb6.toggle();
                }
                if(cb7.isChecked()){
                    cb7.toggle();
                }

                editor.putString("quest09", "1");
                editor.commit();
            }
        });
        cb3.setOnClickListener(new View.OnClickListener() {

            SharedPreferences infor = getSharedPreferences("informacoes_salvas",0);
            SharedPreferences.Editor editor =  infor.edit();

            public void onClick(View v) {

                if(cb2.isChecked()){
                    cb2.toggle();
                }
                if(cb1.isChecked()){
                    cb1.toggle();
                }
                if(cb4.isChecked()){
                    cb4.toggle();
                }
                if(cb5.isChecked()){
                    cb5.toggle();
                }
                if(cb6.isChecked()){
                    cb6.toggle();
                }
                if(cb7.isChecked()){
                    cb7.toggle();
                }

                editor.putString("quest09", "2");
                editor.commit();
            }
        });
        cb4.setOnClickListener(new View.OnClickListener() {

            SharedPreferences infor = getSharedPreferences("informacoes_salvas",0);
            SharedPreferences.Editor editor =  infor.edit();

            public void onClick(View v) {

                if(cb2.isChecked()){
                    cb2.toggle();
                }
                if(cb3.isChecked()){
                    cb3.toggle();
                }
                if(cb1.isChecked()){
                    cb1.toggle();
                }
                if(cb5.isChecked()){
                    cb5.toggle();
                }
                if(cb6.isChecked()){
                    cb6.toggle();
                }
                if(cb7.isChecked()){
                    cb7.toggle();
                }

                editor.putString("quest09", "3");
                editor.commit();
            }
        });
        cb5.setOnClickListener(new View.OnClickListener() {

            SharedPreferences infor = getSharedPreferences("informacoes_salvas",0);
            SharedPreferences.Editor editor =  infor.edit();

            public void onClick(View v) {

                if(cb2.isChecked()){
                    cb2.toggle();
                }
                if(cb3.isChecked()){
                    cb3.toggle();
                }
                if(cb4.isChecked()){
                    cb4.toggle();
                }
                if(cb1.isChecked()){
                    cb1.toggle();
                }
                if(cb6.isChecked()){
                    cb6.toggle();
                }
                if(cb7.isChecked()){
                    cb7.toggle();
                }

                editor.putString("quest09", "4");
                editor.commit();
            }
        });
        cb6.setOnClickListener(new View.OnClickListener() {

            SharedPreferences infor = getSharedPreferences("informacoes_salvas",0);
            SharedPreferences.Editor editor =  infor.edit();

            public void onClick(View v) {

                if(cb2.isChecked()){
                    cb2.toggle();
                }
                if(cb3.isChecked()){
                    cb3.toggle();
                }
                if(cb4.isChecked()){
                    cb4.toggle();
                }
                if(cb5.isChecked()){
                    cb5.toggle();
                }
                if(cb1.isChecked()){
                    cb1.toggle();
                }
                if(cb7.isChecked()){
                    cb7.toggle();
                }

                editor.putString("quest09", "5");
                editor.commit();
            }
        });
        cb7.setOnClickListener(new View.OnClickListener() {

            SharedPreferences infor = getSharedPreferences("informacoes_salvas",0);
            SharedPreferences.Editor editor =  infor.edit();

            public void onClick(View v) {

                if(cb2.isChecked()){
                    cb2.toggle();
                }
                if(cb3.isChecked()){
                    cb3.toggle();
                }
                if(cb4.isChecked()){
                    cb4.toggle();
                }
                if(cb5.isChecked()){
                    cb5.toggle();
                }
                if(cb6.isChecked()){
                    cb6.toggle();
                }
                if(cb1.isChecked()){
                    cb1.toggle();
                }

                editor.putString("quest09", "6");
                editor.commit();
            }
        });

        cb8.setOnClickListener(new View.OnClickListener() {

            SharedPreferences infor = getSharedPreferences("informacoes_salvas",0);
            SharedPreferences.Editor editor =  infor.edit();

            public void onClick(View v) {

                if(cb9.isChecked()){
                    cb9.toggle();
                }
                if(cb10.isChecked()){
                    cb10.toggle();
                }
                if(cb11.isChecked()){
                    cb11.toggle();
                }
                if(cb12.isChecked()){
                    cb12.toggle();
                }
                if(cb13.isChecked()){
                    cb13.toggle();
                }
                if(cb14.isChecked()){
                    cb14.toggle();
                }

                editor.putString("quest10", "0");
                editor.commit();
            }
        });
        cb9.setOnClickListener(new View.OnClickListener() {

            SharedPreferences infor = getSharedPreferences("informacoes_salvas",0);
            SharedPreferences.Editor editor =  infor.edit();

            public void onClick(View v) {

                if(cb8.isChecked()){
                    cb8.toggle();
                }
                if(cb10.isChecked()){
                    cb10.toggle();
                }
                if(cb11.isChecked()){
                    cb11.toggle();
                }
                if(cb12.isChecked()){
                    cb12.toggle();
                }
                if(cb13.isChecked()){
                    cb13.toggle();
                }
                if(cb14.isChecked()){
                    cb14.toggle();
                }

                editor.putString("quest10", "1");
                editor.commit();
            }
        });
        cb10.setOnClickListener(new View.OnClickListener() {

            SharedPreferences infor = getSharedPreferences("informacoes_salvas",0);
            SharedPreferences.Editor editor =  infor.edit();

            public void onClick(View v) {

                if(cb9.isChecked()){
                    cb9.toggle();
                }
                if(cb8.isChecked()){
                    cb8.toggle();
                }
                if(cb11.isChecked()){
                    cb11.toggle();
                }
                if(cb12.isChecked()){
                    cb12.toggle();
                }
                if(cb13.isChecked()){
                    cb13.toggle();
                }
                if(cb14.isChecked()){
                    cb14.toggle();
                }

                editor.putString("quest10", "2");
                editor.commit();
            }
        });
        cb11.setOnClickListener(new View.OnClickListener() {

            SharedPreferences infor = getSharedPreferences("informacoes_salvas",0);
            SharedPreferences.Editor editor =  infor.edit();

            public void onClick(View v) {

                if(cb9.isChecked()){
                    cb9.toggle();
                }
                if(cb10.isChecked()){
                    cb10.toggle();
                }
                if(cb8.isChecked()){
                    cb8.toggle();
                }
                if(cb12.isChecked()){
                    cb12.toggle();
                }
                if(cb13.isChecked()){
                    cb13.toggle();
                }
                if(cb14.isChecked()){
                    cb14.toggle();
                }

                editor.putString("quest10", "3");
                editor.commit();
            }
        });
        cb12.setOnClickListener(new View.OnClickListener() {

            SharedPreferences infor = getSharedPreferences("informacoes_salvas",0);
            SharedPreferences.Editor editor =  infor.edit();

            public void onClick(View v) {

                if(cb9.isChecked()){
                    cb9.toggle();
                }
                if(cb10.isChecked()){
                    cb10.toggle();
                }
                if(cb11.isChecked()){
                    cb11.toggle();
                }
                if(cb8.isChecked()){
                    cb8.toggle();
                }
                if(cb13.isChecked()){
                    cb13.toggle();
                }
                if(cb14.isChecked()){
                    cb14.toggle();
                }

                editor.putString("quest10", "4");
                editor.commit();
            }
        });
        cb13.setOnClickListener(new View.OnClickListener() {

            SharedPreferences infor = getSharedPreferences("informacoes_salvas",0);
            SharedPreferences.Editor editor =  infor.edit();

            public void onClick(View v) {

                if(cb9.isChecked()){
                    cb9.toggle();
                }
                if(cb10.isChecked()){
                    cb10.toggle();
                }
                if(cb11.isChecked()){
                    cb11.toggle();
                }
                if(cb12.isChecked()){
                    cb12.toggle();
                }
                if(cb8.isChecked()){
                    cb8.toggle();
                }
                if(cb14.isChecked()){
                    cb14.toggle();
                }

                editor.putString("quest10", "5");
                editor.commit();
            }
        });
        cb14.setOnClickListener(new View.OnClickListener() {

            SharedPreferences infor = getSharedPreferences("informacoes_salvas",0);
            SharedPreferences.Editor editor =  infor.edit();

            public void onClick(View v) {

                if(cb9.isChecked()){
                    cb9.toggle();
                }
                if(cb10.isChecked()){
                    cb10.toggle();
                }
                if(cb11.isChecked()){
                    cb11.toggle();
                }
                if(cb12.isChecked()){
                    cb12.toggle();
                }
                if(cb13.isChecked()){
                    cb13.toggle();
                }
                if(cb8.isChecked()){
                    cb8.toggle();
                }

                editor.putString("quest10", "6");
                editor.commit();
            }
        });
    }

    public void passarPagina10(View view){

        SharedPreferences infor = getSharedPreferences("informacoes_salvas",0);
        SharedPreferences.Editor editor =  infor.edit();

        if((infor.getString("quest09", "").equals(""))||(infor.getString("quest10", "").equals(""))){
            aviso.setText("Faltou responder uma pergunta!");
        }else {
            aviso.setText("");
            Intent intent = new Intent(getApplicationContext(), quest06.class);
            startActivity(intent);
        }
    }
}
