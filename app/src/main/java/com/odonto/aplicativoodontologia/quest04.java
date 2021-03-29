package com.odonto.aplicativoodontologia;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class quest04 extends AppCompatActivity {

    private CheckBox cb1, cb2, cb3, cb4, cb5, cb6, cb7, cb8, cb9, cb10, cb11, cb12, cb13, cb14;
    private TextView aviso;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quest04);

        aviso = findViewById(R.id.textView32);
        cb1 = findViewById(R.id.checkBox15);
        cb2 = findViewById(R.id.checkBox16);
        cb3 = findViewById(R.id.checkBox17);
        cb4 = findViewById(R.id.checkBox18);
        cb5 = findViewById(R.id.checkBox19);
        cb6 = findViewById(R.id.checkBox20);
        cb7 = findViewById(R.id.checkBox21);
        cb8 = findViewById(R.id.checkBox22);
        cb9 = findViewById(R.id.checkBox23);
        cb10 = findViewById(R.id.checkBox24);
        cb11 = findViewById(R.id.checkBox25);
        cb12 = findViewById(R.id.checkBox26);
        cb13 = findViewById(R.id.checkBox27);
        cb14 = findViewById(R.id.checkBox28);

        SharedPreferences infor = getSharedPreferences("informacoes_salvas",0);

        if(infor.contains("quest07")) {

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

            if(infor.getString("quest07", "").equals("")==false){


                if(infor.getString("quest07", "").equals("0")){
                    cb1.toggle();
                }else if(infor.getString("quest07", "").equals("1")){
                    cb2.toggle();
                }else if(infor.getString("quest07", "").equals("2")){
                    cb3.toggle();
                }else if(infor.getString("quest07", "").equals("3")){
                    cb4.toggle();
                }else if(infor.getString("quest07", "").equals("4")){
                    cb5.toggle();
                }else if(infor.getString("quest07", "").equals("5")){
                    cb6.toggle();
                }else if(infor.getString("quest07", "").equals("6")){
                    cb7.toggle();
                }

            }
        }

        if(infor.contains("quest08")) {

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

            if(infor.getString("quest08", "").equals("")==false){


                if(infor.getString("quest08", "").equals("0")){
                    cb8.toggle();
                }else if(infor.getString("quest08", "").equals("1")){
                    cb9.toggle();
                }else if(infor.getString("quest08", "").equals("2")){
                    cb10.toggle();
                }else if(infor.getString("quest08", "").equals("3")){
                    cb11.toggle();
                }else if(infor.getString("quest08", "").equals("4")){
                    cb12.toggle();
                }else if(infor.getString("quest08", "").equals("5")){
                    cb13.toggle();
                }else if(infor.getString("quest08", "").equals("6")){
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

                editor.putString("quest07", "0");
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

                editor.putString("quest07", "1");
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

                editor.putString("quest07", "2");
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

                editor.putString("quest07", "3");
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

                editor.putString("quest07", "4");
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

                editor.putString("quest07", "5");
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

                editor.putString("quest07", "6");
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

                editor.putString("quest08", "0");
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

                editor.putString("quest08", "1");
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

                editor.putString("quest08", "2");
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

                editor.putString("quest08", "3");
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

                editor.putString("quest08", "4");
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

                editor.putString("quest08", "5");
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

                editor.putString("quest08", "6");
                editor.commit();
            }
        });
    }

    public void passarPagina9(View view){

        SharedPreferences infor = getSharedPreferences("informacoes_salvas",0);
        SharedPreferences.Editor editor =  infor.edit();

        if((infor.getString("quest07", "").equals(""))||(infor.getString("quest08", "").equals(""))){
            aviso.setText("Faltou responder uma pergunta!");
        }else {
            aviso.setText("");
            Intent intent = new Intent(getApplicationContext(), quest05.class);
            startActivity(intent);
        }
    }
}
