package com.example.android.guiaturistica.Saborea;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.guiaturistica.R;

import java.util.ArrayList;

/**
 * Created by jesus on 1/07/17.
 */

public class RestauranteAdapter extends ArrayAdapter<Restaurante> {


    public RestauranteAdapter(@NonNull Activity context, ArrayList<Restaurante> restaurantes) {
        super(context, 0, restaurantes);

            }

    @NonNull
    @Override
    public View getView(int position, @Nullable final View convertView, @NonNull ViewGroup parent) {

        //Comprobamos si la vista existente está siendo usado; en caso contrario la llenamos.
        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.datos_restaurante, parent, false);
        }

        final Restaurante restaurante = getItem(position);

        //Poner texto en las textviews y la foto de cada restaurante

        TextView NombreRestaurante = (TextView) listItemView.findViewById(R.id.nombre_restaurante);
        NombreRestaurante.setText(restaurante.obtenerNombreRestaurante());

        ImageView FotoRestaurante = (ImageView) listItemView.findViewById(R.id.foto_restaurantes);
        FotoRestaurante.setImageResource(restaurante.obtenerImagenRestaurante());

        TextView ComentariosRestaurante = (TextView) listItemView.findViewById(R.id.descripcion_restaurante);
        ComentariosRestaurante.setText(restaurante.obtenerComentariosRestaurante());

        //Hacer que al presionar se abra la página del restaurante en el navegador

        View web = listItemView.findViewById(R.id.dato_restaurante);
        final String WebRestaurante = restaurante.obtenerWebRestaurante();

        web.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openWebPage(WebRestaurante);
            }
        });

        return listItemView;

    }

    //Abrir la pagina del restaurante
    public void openWebPage(String url) {
        Uri webpage = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        if (intent.resolveActivity(getContext().getPackageManager()) != null) {
            getContext().startActivity(intent);
        }
    }
}
