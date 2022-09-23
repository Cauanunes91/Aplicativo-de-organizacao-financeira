package com.example.projetointegrador;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView valor;
    Button saldo,DiminuirValor,addValor;
    ImageView iconAddValor,iconRelatorio,visibility,minhaCarteira;
    int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        valor= findViewById(R.id.valor);
        addValor = findViewById(R.id.addValor);
        saldo = findViewById(R.id.saldo);
        DiminuirValor = findViewById(R.id.DiminuirValor);
        iconAddValor = findViewById(R.id.iconAddValor);
        iconRelatorio = findViewById(R.id.iconRelatorio);
        visibility = findViewById(R.id.visibility);
        minhaCarteira = findViewById(R.id.MinhaCarteira);


        iconAddValor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            adicionaValor();
                //chamar tela de adicionar valor
            }
            private void adicionaValor(){
                Intent intent= new Intent(MainActivity.this, TelaAddValor.class);
                startActivity(intent);
            }
        });

        addValor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            adicionaValor();
            }
            private void adicionaValor(){
                Intent intent = new Intent(MainActivity.this, TelaAddValor.class);
                startActivity(intent);
            }
        });
        minhaCarteira.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chamarCarteira();
            }
            private void chamarCarteira(){
                Intent intent = new Intent(MainActivity.this, MinhaCarteira.class);
                startActivity(intent);
            }
        });
        iconRelatorio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //tela do relatorio
            }
        });
        saldo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                telaSaldo();
                // chamar tela Saldo
            }
            private void telaSaldo(){
                Intent intent = new Intent(MainActivity.this,MinhaCarteira.class);
                startActivity(intent);
            }
        });

        visibility.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                visualizar();
            }

            private void visualizar() {
                //esconde o valor principal

                Drawable drawable= getResources().getDrawable(R.drawable.ic_baseline_remove_red_eye_24);
                 visibility.setImageDrawable(drawable);
            }
        });
        DiminuirValor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                subtraiValor();
            }
            private void subtraiValor(){
                Intent intent = new Intent(MainActivity.this, SubtrairValor.class);
                startActivity(intent);

            }
        });

    }



}