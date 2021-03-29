package com.odonto.aplicativoodontologia;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class quest03 extends AppCompatActivity {

    private CheckBox cb1, cb2, cb3, cb4, cb5, cb6, cb7, cb8, cb9, cb10, cb11, cb12, cb13, cb14;
    private TextView aviso;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quest03);

        aviso = findViewById(R.id.textView31);
        cb1 = findViewById(R.id.checkBox1);
        cb2 = findViewById(R.id.checkBox2);
        cb3 = findViewById(R.id.checkBox3);
        cb4 = findViewById(R.id.checkBox4);
        cb5 = findViewById(R.id.checkBox5);
        cb6 = findViewById(R.id.checkBox6);
        cb7 = findViewById(R.id.checkBox7);
        cb8 = findViewById(R.id.checkBox8);
        cb9 = findViewById(R.id.checkBox9);
        cb10 = findViewById(R.id.checkBox10);
        cb11 = findViewById(R.id.checkBox11);
        cb12 = findViewById(R.id.checkBox12);
        cb13 = findViewById(R.id.checkBox13);
        cb14 = findViewById(R.id.checkBox14);

        SharedPreferences infor = getSharedPreferences("informacoes_salvas",0);

        if(infor.contains("quest05")) {

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

            if(infor.getString("quest05", "").equals("")==false){


                if(infor.getString("quest05", "").equals("0")){
                    cb1.toggle();
                }else if(infor.getString("quest05", "").equals("1")){
                    cb2.toggle();
                }else if(infor.getString("quest05", "").equals("2")){
                    cb3.toggle();
                }else if(infor.getString("quest05", "").equals("3")){
                    cb4.toggle();
                }else if(infor.getString("quest05", "").equals("4")){
                    cb5.toggle();
                }else if(infor.getString("quest05", "").equals("5")){
                    cb6.toggle();
                }else if(infor.getString("quest05", "").equals("6")){
                    cb7.toggle();
                }

            }
        }

        if(infor.contains("quest06")) {

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

            if(infor.getString("quest06", "").equals("")==false){


                if(infor.getString("quest06", "").equals("0")){
                    cb8.toggle();
                }else if(infor.getString("quest06", "").equals("1")){
                    cb9.toggle();
                }else if(infor.getString("quest06", "").equals("2")){
                    cb10.toggle();
                }else if(infor.getString("quest06", "").equals("3")){
                    cb11.toggle();
                }else if(infor.getString("quest06", "").equals("4")){
                    cb12.toggle();
                }else if(infor.getString("quest06", "").equals("5")){
                    cb13.toggle();
                }else if(infor.getString("quest06", "").equals("6")){
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

                editor.putString("quest05", "0");
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

                editor.putString("quest05", "1");
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

                editor.putString("quest05", "2");
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

                editor.putString("quest05", "3");
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

                editor.putString("quest05", "4");
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

                editor.putString("quest05", "5");
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

                editor.putString("quest05", "6");
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

                editor.putString("quest06", "0");
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

                editor.putString("quest06", "1");
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

                editor.putString("quest06", "2");
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

                editor.putString("quest06", "3");
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

                editor.putString("quest06", "4");
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

                editor.putString("quest06", "5");
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

                editor.putString("quest06", "6");
                editor.commit();
            }
        });
    }


    public void passarPagina8(View view){

        SharedPreferences infor = getSharedPreferences("informacoes_salvas",0);
        SharedPreferences.Editor editor =  infor.edit();

        if((infor.getString("quest05", "").equals(""))||(infor.getString("quest06", "").equals(""))){
            aviso.setText("Faltou responder uma pergunta!");
        }else {
            aviso.setText("");
            Intent intent = new Intent(getApplicationContext(), quest04.class);
            startActivity(intent);
        }
    }
}
