package com.odonto.aplicativoodontologia;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;




public class espera extends AppCompatActivity {

    private Handler aguarde = new Handler();

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_espera);

        aguarde.postDelayed(new Runnable() {

            public void run() {

                try {
                    Intent intent = new Intent(getApplicationContext(), quest02Controle.class);
                    startActivity(intent);

                    finish();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }, 45000);
    }
}
