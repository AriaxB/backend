package com.sportan.nicolas.models;

public class Producto {
    private int idProducto, estadoProducto,docVendedor,idCatalogo,cantidadProducto;
    private String nombreProducto,descripcion;
    private Double precioProducto;

    public Producto() {
    }

    public Producto(int idProducto, int estadoProducto, int docVendedor, int idCatalogo, int cantidadProducto, String nombreProducto, String descripcion, double precioProducto) {
        this.idProducto = idProducto;
        this.estadoProducto = estadoProducto;
        this.docVendedor = docVendedor;
        this.idCatalogo = idCatalogo;
        this.cantidadProducto = cantidadProducto;
        this.nombreProducto = nombreProducto;
        this.descripcion = descripcion;
        this.precioProducto = precioProducto;
    }

    public int getIdProducto() {
        return this.idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getEstadoProducto() {
        return this.estadoProducto;
    }

    public void setEstadoProducto(int estadoProducto) {
        this.estadoProducto = estadoProducto;
    }

    public int getDocVendedor() {
        return this.docVendedor;
    }

    public void setDocVendedor(int docVendedor) {
        this.docVendedor = docVendedor;
    }

    public int getIdCatalogo() {
        return this.idCatalogo;
    }

    public void setIdCatalogo(int idCatalogo) {
        this.idCatalogo = idCatalogo;
    }

    public int getCantidadProducto() {
        return this.cantidadProducto;
    }

    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    public String getNombreProducto() {
        return this.nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getPrecioProducto() {
        return this.precioProducto;
    }

    public void setPrecioProducto(Double precioProducto) {
        this.precioProducto = precioProducto;
    }


}
