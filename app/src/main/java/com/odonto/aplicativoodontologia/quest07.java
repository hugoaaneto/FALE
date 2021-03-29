package com.odonto.aplicativoodontologia;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class quest07 extends AppCompatActivity {

    private CheckBox cb1, cb2;
    private EditText sugest;
    private TextView aviso;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quest07);

        aviso = findViewById(R.id.textView35);
        cb1 = findViewById(R.id.checkBox44);
        cb2 = findViewById(R.id.checkBox45);
        sugest = findViewById(R.id.sugest);

        SharedPreferences infor = getSharedPreferences("informacoes_salvas",0);

        if(infor.contains("quest13")) {

            if(cb1.isChecked()){
                cb1.toggle();
            }
            if(cb2.isChecked()){
                cb2.toggle();
            }

            if(infor.getString("quest13", "").equals("")==false) {


                if (infor.getString("quest13", "").equals("0")) {
                    cb1.toggle();
                }else if (infor.getString("quest13", "").equals("1")) {
                    cb2.toggle();
                }
            }
        }

        if(infor.contains("sgt")){

            if(infor.getString("sgt","").equals("")==false){
                sugest.setText(infor.getString("sgt",""));
            }
        }

        cb1.setOnClickListener(new View.OnClickListener() {

            SharedPreferences infor = getSharedPreferences("informacoes_salvas",0);
            SharedPreferences.Editor editor =  infor.edit();

            public void onClick(View v) {

                if(cb2.isChecked()){
                    cb2.toggle();
                }

                editor.putString("quest13", "0");
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

                editor.putString("quest13", "1");
                editor.commit();
            }
        });

    }

    public void passarPagina12(View view){

        SharedPreferences infor = getSharedPreferences("informacoes_salvas",0);
        SharedPreferences.Editor editor =  infor.edit();

        if(infor.getString("quest13", "").equals("")){
            aviso.setText("Faltou responder uma pergunta!");
        }else {
            aviso.setText("");
            editor.putString("sgt", sugest.getText().toString());
            editor.commit();
            Intent intent = new Intent(getApplicationContext(), quest08.class);
            startActivity(intent);
        }
    }
}
