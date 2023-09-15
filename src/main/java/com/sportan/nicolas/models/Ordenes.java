package com.sportan.nicolas.models;

public class Ordenes {
    private int idOrden,cantidadProducto, docVendedor,docComprador,idProducto,idTipoPago;
    private String descripcionOrden;
    private double precioTotal;

    public Ordenes() {
    }

    public Ordenes(int idOrden, int cantidadProducto, int docVendedor, int docComprador, int idProducto, int idTipoPago, String descripcionOrden, float precioTotal) {
        this.idOrden = idOrden;
        this.cantidadProducto = cantidadProducto;
        this.docVendedor = docVendedor;
        this.docComprador = docComprador;
        this.idProducto = idProducto;
        this.idTipoPago = idTipoPago;
        this.descripcionOrden = descripcionOrden;
        this.precioTotal = precioTotal;
    }

    public int getIdOrden() {
        return this.idOrden;
    }

    public void setIdOrden(int idOrden) {
        this.idOrden = idOrden;
    }

    public int getCantidadProducto() {
        return this.cantidadProducto;
    }

    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    public int getDocVendedor() {
        return this.docVendedor;
    }

    public void setDocVendedor(int docVendedor) {
        this.docVendedor = docVendedor;
    }

    public int getDocComprador() {
        return this.docComprador;
    }

    public void setDocComprador(int docComprador) {
        this.docComprador = docComprador;
    }

    public int getIdProducto() {
        return this.idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getIdTipoPago() {
        return this.idTipoPago;
    }

    public void setIdTipoPago(int idTipoPago) {
        this.idTipoPago = idTipoPago;
    }

    public String getDescripcionOrden() {
        return this.descripcionOrden;
    }

    public void setDescripcionOrden(String descripcionOrden) {
        this.descripcionOrden = descripcionOrden;
    }

    public double getPrecioTotal() {
        return this.precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }


}
