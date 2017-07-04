package com.example.android.guiaturistica.Monumentos.Alcazar;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.android.guiaturistica.R;

/**
 * Created by jesus on 1/07/17.
 */

public class AlcazarAdap extends FragmentPagerAdapter {

    private Context mcontexto;

    public AlcazarAdap(FragmentManager fm, Context contexto) {
        super(fm);
        mcontexto = contexto;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new GeneralFragAlcazar();
        } else if (position == 1){
            return new TuristicoFragAlcazar();
        } else if (position == 2) {
            return new HistoricoFragAlcazar();
        }else {
            return new ArtisticoFragAlcazar();
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