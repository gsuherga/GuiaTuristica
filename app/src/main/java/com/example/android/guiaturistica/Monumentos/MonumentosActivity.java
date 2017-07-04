package com.example.android.guiaturistica.Monumentos;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.android.guiaturistica.Monumentos.Alcazar.Alcazar;
import com.example.android.guiaturistica.Monumentos.Archivo.Archivo;
import com.example.android.guiaturistica.Monumentos.Catedral.Catedral;
import com.example.android.guiaturistica.R;


/**
 * Created by jesus on 29/06/17.
 */

public class MonumentosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.monumentos_menu_fotos);

        //Buscamos la imagen de la catedral para abrir la pantalla correspondiente al pulsarlo

        final Button catedral = (Button) this.findViewById(R.id.catedral);

        catedral.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent catedral = new Intent(MonumentosActivity.this, Catedral.class);
                startActivity(catedral);
            }
        });

        //Buscamos la imagen del archivo de indias para abrir la pantalla correspondiente al pulsarlo

        final Button archivo = (Button) this.findViewById(R.id.archivo);

        archivo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                      Intent archivo = new Intent(MonumentosActivity.this, Archivo.class);
                      startActivity(archivo);
            }
        });
        //Buscamos la imagen del alcázar para abrir la pantalla correspondiente al pulsarlo

        final Button alcazar = (Button) this.findViewById(R.id.alcazar);

        alcazar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent alcazar = new Intent(MonumentosActivity.this, Alcazar.class);
                startActivity(alcazar);
            }
        });
    }

}
