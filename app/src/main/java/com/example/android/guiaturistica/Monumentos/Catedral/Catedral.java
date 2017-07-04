package com.example.android.guiaturistica.Monumentos.Catedral;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.example.android.guiaturistica.R;

/**
 * Created by jesus on 1/07/17.
 */

public class Catedral extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Establecer el contenido de la actividad para usar el archivo monumentos_frag
        setContentView(R.layout.monumentos_frag);
        /*
        Encontrar el view pager that permitirá al usuario
         */
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);

        //Crear un adapter that sepa que fragmento debe ir en cada página
        CatedralAdap adapter = new CatedralAdap(getSupportFragmentManager(),this);

        //Establecer el adapter en el view pager
        viewPager.setAdapter(adapter);

        // Dar el TabLayout (títulos de las pestañas) al view pager
        TabLayout tabLayout = (TabLayout) findViewById(R.id.fragmentos_monumentos_titulos);
        tabLayout.setupWithViewPager(viewPager);


    }
}
