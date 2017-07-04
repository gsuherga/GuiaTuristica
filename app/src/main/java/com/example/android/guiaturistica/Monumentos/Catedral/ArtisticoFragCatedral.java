package com.example.android.guiaturistica.Monumentos.Catedral;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.guiaturistica.R;

/**
 * Created by jesus on 1/07/17.
 */

public class ArtisticoFragCatedral extends Fragment{

    public ArtisticoFragCatedral() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.monumentos, container, false);

        //Obtener la textview y disponer el texto
        TextView texto = (TextView) rootView.findViewById(R.id.fragmentos_monumentos_textos);
        texto.setText(getResources().getString(R.string.catedral_artistico_texto));

        //Obtener la textview y disponer el texto de la web del monumento
        Button web = (Button) rootView.findViewById(R.id.web_monumentos);
        web.setText(R.string.catedral);
        web.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String uri = getString(R.string.web_catedral);
                abrirWeb(uri);
            }
        });


        //Obtener la imageview y disponer la imagen de fondo
        ImageView fondo = (ImageView) rootView.findViewById(R.id.fondo_fragmentos_monumentos);
        fondo.setImageResource(R.drawable.catedral08);

        return rootView;
    }
    public void abrirWeb(String url) {
        Uri webpage = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        if (intent.resolveActivity(getContext().getPackageManager()) != null) {
            startActivity(intent);
        }
    }
}
