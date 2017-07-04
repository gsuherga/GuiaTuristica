package com.example.android.guiaturistica.Monumentos.Alcazar;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.android.guiaturistica.Monumentos.Archivo.ArtisticoFragArchivo;
import com.example.android.guiaturistica.Monumentos.Archivo.GeneralFragArchivo;
import com.example.android.guiaturistica.Monumentos.Archivo.HistoricoFragArchivo;
import com.example.android.guiaturistica.Monumentos.Archivo.TuristicoFragArchivo;
import com.example.android.guiaturistica.R;

/**
 * Created by jesus on 1/07/17.
 */

public class ArchivoAdap extends FragmentPagerAdapter {

    private Context mcontexto;

    public ArchivoAdap(FragmentManager fm, Context contexto) {
        super(fm);
        mcontexto = contexto;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new GeneralFragArchivo();
        } else if (position == 1){
            return new TuristicoFragArchivo();
        } else if (position == 2) {
            return new HistoricoFragArchivo();
        }else {
            return new ArtisticoFragArchivo();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Genera el título según la posición
        switch (position) {
            case 0:
                return mcontexto.getString(R.string.alcazar_general);

            case 1:
                return mcontexto.getString(R.string.alcazar_turistico);

            case 2:
                return mcontexto.getString(R.string.alcazar_historico);

            case 3:
                return mcontexto.getString(R.string.alcazar_artistico);
        }

        return null;
    }
}