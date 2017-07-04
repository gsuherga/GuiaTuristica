package com.example.android.guiaturistica.PantallaPrincipal;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.android.guiaturistica.Monumentos.MonumentosActivity;
import com.example.android.guiaturistica.R;
import com.example.android.guiaturistica.Saborea.SaboreaSevilla;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Buscamos el texto de patrimnios para abrir la pantalla correspondiente al pulsarlo

        View patrimonio = (TextView) this.findViewById(R.id.patrimonios);

        patrimonio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent monumentos = new Intent(MainActivity.this, MonumentosActivity.class);
                startActivity(monumentos);
            }
        });

       //Buscamos el texto de saborea para abrir la pantalla correspondiente al pulsarlo

        View saborea = (TextView) this.findViewById(R.id.saborea);

        saborea.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent saborea = new Intent(MainActivity.this, SaboreaSevilla.class);
                startActivity(saborea);
            }
        });
    }
}
