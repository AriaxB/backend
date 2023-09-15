package com.sportan.nicolas.models;

public class Catalogo {
    private int idCatalogo;
    private int nombreCatalogo;

    public Catalogo() {
    }

    public Catalogo(int idCatalogo, int nombreCatalogo) {
        this.idCatalogo = idCatalogo;
        this.nombreCatalogo = nombreCatalogo;
    }


    public int getIdCatalogo() {
        return this.idCatalogo;
    }

    public void setIdCatalogo(int idCatalogo) {
        this.idCatalogo = idCatalogo;
    }

    public int getNombreCatalogo() {
        return this.nombreCatalogo;
    }

    public void setNombreCatalogo(int nombreCatalogo) {
        this.nombreCatalogo = nombreCatalogo;
    }
    
}
