package com.example.projetointegrador;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class TelaAddValor extends AppCompatActivity {
ImageView voltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_add_valor);
        voltar = findViewById(R.id.fechar);

        voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                retornar();
            }
            private void retornar(){
                Intent intent = new Intent(TelaAddValor.this, MainActivity.class);
                startActivity(intent);
            }

        });
    }
}