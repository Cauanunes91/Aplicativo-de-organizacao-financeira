package com.example.projetointegrador;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MinhaCarteira extends AppCompatActivity {
ImageView voltar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_minha_carteira);
        voltar = findViewById(R.id.retornar);

        voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             retorno();
            }
            private void retorno(){
                Intent intent = new Intent(MinhaCarteira.this,MainActivity.class);
                startActivity(intent);
            }
        });


    }
}