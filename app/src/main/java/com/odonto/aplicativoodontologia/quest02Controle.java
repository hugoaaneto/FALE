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

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class quest02Controle extends AppCompatActivity {

    private ImageButton b02,b03, b04, b05, b06, b07, b08;
    private TextView aviso;
    private String path = Environment.getExternalStorageDirectory().getAbsolutePath() + "/Odonto";

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quest02_controle);

        aviso = findViewById(R.id.textView29);
        b02 = findViewById(R.id.imageButton64);
        b03 = findViewById(R.id.imageButton65);
        b04 = findViewById(R.id.imageButton66);
        b05 = findViewById(R.id.imageButton67);
        b06 = findViewById(R.id.imageButton68);
        b07 = findViewById(R.id.imageButton69);
        b08 = findViewById(R.id.imageButton70);

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

    public static String[] Load(File file)
    {
        FileInputStream fis = null;
        try
        {
            fis = new FileInputStream(file);
        }
        catch (FileNotFoundException e) {e.printStackTrace();}
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

        String test;
        int anzahl=0;
        try
        {
            while ((test=br.readLine()) != null)
            {
                anzahl++;
            }
        }
        catch (IOException e) {e.printStackTrace();}

        try
        {
            fis.getChannel().position(0);
        }
        catch (IOException e) {e.printStackTrace();}

        String[] array = new String[anzahl];

        String line;
        int i = 0;
        try
        {
            while((line=br.readLine())!=null)
            {
                array[i] = line;
                i++;
            }
        }
        catch (IOException e) {e.printStackTrace();}
        return array;
    }

    public static void Save(File file, String[] data)
    {
        FileOutputStream fos = null;
        try
        {
            fos = new FileOutputStream(file);
        }
        catch (FileNotFoundException e) {e.printStackTrace();}
        try
        {
            try
            {
                for (int i = 0; i<data.length; i++)
                {
                    fos.write(data[i].getBytes());
                    if (i < data.length-1)
                    {
                        fos.write("\n".getBytes());
                    }
                }
            }
            catch (IOException e) {e.printStackTrace();}
        }
        finally
        {
            try
            {
                fos.close();
            }
            catch (IOException e) {e.printStackTrace();}
        }
    }

    public void passarPagFinal(View view){

        SharedPreferences infor = getSharedPreferences("informacoes_salvas",0);
        SharedPreferences.Editor editor =  infor.edit();

        if(infor.getString("quest14", "").equals("")){
            aviso.setText("Faltou responder uma pergunta!");
        }else{
            aviso.setText("");

            DatabaseReference firebaseRef = FirebaseDatabase.getInstance().getReference();

            String est = infor.getString("nomeEst", "");
            String pac = infor.getString("nomePac", "");
            String idade = infor.getString("idade", "");
            String sexo = infor.getString("sexo", "");

            firebaseRef.child("controle").child(est).child(pac).child("1 nome").setValue(pac);
            firebaseRef.child("controle").child(est).child(pac).child("2 idade").setValue(idade);
            firebaseRef.child("controle").child(est).child(pac).child("3 sexo").setValue(sexo);
            firebaseRef.child("controle").child(est).child(pac).child("Quest01").setValue(infor.getString("quest01", ""));
            firebaseRef.child("controle").child(est).child(pac).child("Quest02").setValue(infor.getString("quest14", ""));

            String q1 = infor.getString("quest01", "");
            String q14 = infor.getString("quest14", "");

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
                aux[aux.length-1] = "->" + est + "|" + pac + "|" + idade + "|" + sexo + "|" +
                        infor.getString("quest01", "") +
                        infor.getString("quest14", "");
                Save(salvar, aux);

            }catch(Exception a){
                String[] aux = new String[1];
                aux[0] = "->" + est + "|" + pac + "|" + idade + "|" + sexo + "|" +
                        infor.getString("quest01", "") +
                        infor.getString("quest14", "");

                Save(salvar, aux);
            }

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
            if (infor.contains("quest14")) {
                editor.putString("quest14", "");
            }
            editor.commit();
            Intent intent = new Intent(getApplicationContext(), telaFinalControle.class);
            startActivity(intent);
        }

    }

}
