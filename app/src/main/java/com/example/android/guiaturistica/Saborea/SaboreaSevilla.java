package com.example.android.guiaturistica.Saborea;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.example.android.guiaturistica.R;

import java.util.ArrayList;

/**
 * Created by jesus on 2/07/17.
 */

public class SaboreaSevilla extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lista_restaurantes);

        RestauranteAdapter restaurantesAdapter;

        String[] NombresRestaurantes = getResources().getStringArray(R.array.nombres_restaurantes);

        String[] WebsRestaurantes = getResources().getStringArray(R.array.webs_restaurantes);

        String[] ComentariosRestaurantes = getResources().getStringArray(R.array.comentarios_restaurantes);

        int[] FotosRestaurantes = {R.drawable.restaurante_zarabanda01, R.drawable.alacena_san_eloy02,
                R.drawable.chocoandalate03, R.drawable.inesrosales04, R.drawable.tribeca05, R.drawable.alabardero06,
                R.drawable.robesplacentines07, R.drawable.riogrande08, R.drawable.pandocuna09, R.drawable.pandocentro10,
                R.drawable.rinconcillo11};

        ArrayList<Restaurante> restaurantes = new ArrayList<Restaurante>();

        for (int i = 0; i < NombresRestaurantes.length; i++) {

            restaurantes.add(new Restaurante(NombresRestaurantes[i], WebsRestaurantes[i],
                    ComentariosRestaurantes[i], FotosRestaurantes[i]));
        }

        restaurantesAdapter = new RestauranteAdapter(SaboreaSevilla.this, restaurantes);

        ListView listaRestaurantes = (ListView) findViewById(R.id.lista_restaurantes);

        listaRestaurantes.setAdapter(restaurantesAdapter);

    }

}
