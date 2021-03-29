package com.odonto.aplicativoodontologia;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.io.File;

import static com.odonto.aplicativoodontologia.quest02Controle.Load;
import static com.odonto.aplicativoodontologia.quest02Controle.Save;


public class quest08 extends AppCompatActivity {

    private ImageButton b02,b03, b04, b05, b06, b07, b08;
    private TextView aviso;
    private String path = Environment.getExternalStorageDirectory().getAbsolutePath() + "/Odonto";

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quest08);

        aviso = findViewById(R.id.textView36);
        b02 = findViewById(R.id.imageButton44);
        b03 = findViewById(R.id.imageButton45);
        b04 = findViewById(R.id.imageButton46);
        b05 = findViewById(R.id.imageButton47);
        b06 = findViewById(R.id.imageButton48);
        b07 = findViewById(R.id.imageButton49);
        b08 = findViewById(R.id.imageButton50);

        SharedPreferences infor = getSharedPreferences("informacoes_salvas",0);

        if(infor.contains("quest14")) {

            if(infor.getString("quest14", "").equals("")==false){

                b02.setAlpha((float) 0.5);
                b03.setAlpha((float) 0.5);
                b04.setAlpha((float) 0.5);
                b05.setAlpha((float) 0.5);
                b06.setAlpha((float) 0.5);
                b07.setAlpha((float) 0.5);
                b08.setAlpha((float) 0.5);

                if(infor.getString("quest14", "").equals("0")){
                    b02.setAlpha((float) 1.0);
                }else if(infor.getString("quest14", "").equals("1")){
                    b03.setAlpha((float) 1.0);
                }else if(infor.getString("quest14", "").equals("2")){
                    b04.setAlpha((float) 1.0);
                }else if(infor.getString("quest14", "").equals("3")){
                    b05.setAlpha((float) 1.0);
                }else if(infor.getString("quest14", "").equals("4")){
                    b06.setAlpha((float) 1.0);
                }else if(infor.getString("quest14", "").equals("5")){
                    b07.setAlpha((float) 1.0);
                }else if(infor.getString("quest14", "").equals("6")){
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

                editor.putString("quest14", "0");
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

                editor.putString("quest14", "1");
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

                editor.putString("quest14", "2");
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

                editor.putString("quest14", "3");
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

                editor.putString("quest14", "4");
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

                editor.putString("quest14", "5");
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

                editor.putString("quest14", "6");
                editor.commit();
            }

        });

    }


    public void passarPagina13(View view){


        SharedPreferences infor = getSharedPreferences("informacoes_salvas",0);
        SharedPreferences.Editor editor =  infor.edit();


        if(infor.getString("quest14", "").equals("")){
            aviso.setText("Faltou responder uma pergunta!");
        }else {

            DatabaseReference firebaseRef = FirebaseDatabase.getInstance().getReference();

            String est = infor.getString("nomeEst", "");
            String pac = infor.getString("nomePac", "");
            String idade = infor.getString("idade", "");
            String sexo = infor.getString("sexo", "");

            firebaseRef.child("intervencao").child(est).child(pac).child("1 nome").setValue(pac);
            firebaseRef.child("intervencao").child(est).child(pac).child("2 idade").setValue(idade);
            firebaseRef.child("intervencao").child(est).child(pac).child("3 sexo").setValue(sexo);
            firebaseRef.child("intervencao").child(est).child(pac).child("Quest01").setValue(infor.getString("quest01", ""));
            firebaseRef.child("intervencao").child(est).child(pac).child("Quest02").setValue(infor.getString("quest02", ""));
            firebaseRef.child("intervencao").child(est).child(pac).child("Quest03").setValue(infor.getString("quest03", ""));
            firebaseRef.child("intervencao").child(est).child(pac).child("Quest04").setValue(infor.getString("quest04", ""));
            firebaseRef.child("intervencao").child(est).child(pac).child("Quest05").setValue(infor.getString("quest05", ""));
            firebaseRef.child("intervencao").child(est).child(pac).child("Quest06").setValue(infor.getString("quest06", ""));
            firebaseRef.child("intervencao").child(est).child(pac).child("Quest07").setValue(infor.getString("quest07", ""));
            firebaseRef.child("intervencao").child(est).child(pac).child("Quest08").setValue(infor.getString("quest08", ""));
            firebaseRef.child("intervencao").child(est).child(pac).child("Quest09").setValue(infor.getString("quest09", ""));
            firebaseRef.child("intervencao").child(est).child(pac).child("Quest10").setValue(infor.getString("quest10", ""));
            firebaseRef.child("intervencao").child(est).child(pac).child("Quest11").setValue(infor.getString("quest11", ""));
            firebaseRef.child("intervencao").child(est).child(pac).child("Quest12").setValue(infor.getString("quest12", ""));
            firebaseRef.child("intervencao").child(est).child(pac).child("Quest13").setValue(infor.getString("quest13", ""));
            firebaseRef.child("intervencao").child(est).child(pac).child("Quest14").setValue(infor.getString("quest14", ""));
            firebaseRef.child("intervencao").child(est).child(pac).child("txt").setValue(infor.getString("sgt", ""));

            String q1 = infor.getString("quest01", "");
            String q2 = infor.getString("quest02", "");
            String q3 = infor.getString("quest03", "");
            String q4 = infor.getString("quest04", "");
            String q5 = infor.getString("quest05", "");
            String q6 = infor.getString("quest06", "");
            String q7 = infor.getString("quest07", "");
            String q8 = infor.getString("quest08", "");
            String q9 = infor.getString("quest09", "");
            String q10 = infor.getString("quest10", "");
            String q11 = infor.getString("quest11", "");
            String q12 = infor.getString("quest12", "");
            String q13 = infor.getString("quest13", "");
            String q14 = infor.getString("quest14", "");
            String q15 = infor.getString("sgt", "");

            File diret = new File(path);
            diret.mkdirs();

            File salvar = new File(path + "/inforOdonto.txt");
            try {
                String[] backup = Load(salvar);
                String[] aux = new String[backup.length + 1];
                for(int i=0;i<aux.length;i++){
                    if(backup.length>i){
                        aux[i] = backup[i];
                    }
                }
                aux[aux.length -1] = "-> " + est + "|" + pac + "|" + idade + "|" + sexo + "|" + q1 +
                        q2 + q3 + q4 + q5 + q6 + q7 + q8 + q9 + q10 + q11 + q12 + q13 + q14 + " | " + q15 ;
                Save(salvar, aux);

            }catch(Exception a){
                String[] aux = new String[1];
                aux[0] = "-> " + est + "|" + pac + "|" + idade + "|" + sexo + "|" + q1 +
                        q2 + q3 + q4 + q5 + q6 + q7 + q8 + q9 + q10 + q11 + q12 + q13 + q14 + "| " + q15;
                Save(salvar, aux);
            }

            aviso.setText("");
            if (infor.contains("nomeEst")) {
                editor.putString("nomeEst", "");
            }
            if (infor.contains("nomePac")) {
                editor.putString("nomePac", "");
            }
            if (infor.contains("idade")) {
                editor.putString("idade", "");
            }
            if (infor.contains("sexo")) {
                editor.putString("sexo", "");
            }
            if (infor.contains("quest01")) {
                editor.putString("quest01", "");
            }
            if (infor.contains("quest02")) {
                editor.putString("quest02", "");
            }
            if (infor.contains("quest03")) {
                editor.putString("quest03", "");
            }
            if (infor.contains("quest04")) {
                editor.putString("quest04", "");
            }
            if (infor.contains("quest05")) {
                editor.putString("quest05", "");
            }
            if (infor.contains("quest06")) {
                editor.putString("quest06", "");
            }
            if (infor.contains("quest07")) {
                editor.putString("quest07", "");
            }
            if (infor.contains("quest08")) {
                editor.putString("quest08", "");
            }
            if (infor.contains("quest09")) {
                editor.putString("quest09", "");
            }
            if (infor.contains("quest10")) {
                editor.putString("quest10", "");
            }
            if (infor.contains("quest11")) {
                editor.putString("quest11", "");
            }
            if (infor.contains("quest12")) {
                editor.putString("quest12", "");
            }
            if (infor.contains("quest13")) {
                editor.putString("quest13", "");
            }
            if (infor.contains("quest14")) {
                editor.putString("quest14", "");
            }
            if (infor.contains("sgt")) {
                editor.putString("sgt", "");
            }
            if (infor.contains("casoControle")) {
                editor.putString("casoControle", "");
            }

            editor.commit();
            Intent intent = new Intent(getApplicationContext(), telaFinal.class);
            startActivity(intent);
        }
    }
}
