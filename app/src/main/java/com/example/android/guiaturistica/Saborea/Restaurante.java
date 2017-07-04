package com.example.android.guiaturistica.Saborea;

/**
 * Created by jesus on 29/06/17.
 */

public class Restaurante {

    /** Nombre del restaurante */
    private String mNombreRestaurante;

    /** Dirección del restaurante */
    private String  mWebRestaurante;

    /** Comentarios sobre el restaurante */
    private String mComentariosRestaurante;

    //** Foto del restaurante */
    private int mImagenRestaurante;

    /**
     * Crear un nuevo objeto Restaurante
     *
     * @param NombreRestaurante es el nombre del restaurante
     *
     * @param WebRestaurante es la direccion del restaurante
     *
     * @param ComentariosRestaurante son comentarios sobre el restaurante
     *
     * @param ImagenRestaurante es una foto del restaurante.
     */
    public Restaurante(String NombreRestaurante, String WebRestaurante, String ComentariosRestaurante,
                       int ImagenRestaurante ) {

        mNombreRestaurante = NombreRestaurante;
        mWebRestaurante = WebRestaurante;
        mComentariosRestaurante = ComentariosRestaurante;
        mImagenRestaurante = ImagenRestaurante;
    }

    /**
     * Obtener el nombre del restaurante
     */
    public String obtenerNombreRestaurante(){
        return mNombreRestaurante;
    }

    /**
     * Obtener la direccion del restaurante
     */
    public String obtenerWebRestaurante() {
        return mWebRestaurante;
    }

    /*
    Obtener comentarios sobre el restaurante
     */

    public String obtenerComentariosRestaurante (){

        return mComentariosRestaurante;
    }

    public int obtenerImagenRestaurante(){

        return mImagenRestaurante;
    }

}
