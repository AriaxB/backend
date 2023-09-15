package com.sportan.nicolas.models;

public class Solicitudes {
    private int numeroSolicitud,codTipoUser,idTipoSolicitud,idEstadoSolicitud;
    private String nombrePersona,descripcionSolicitud,correo,respuesta;

    public Solicitudes() {
    }

    public Solicitudes(int numeroSolicitud, int codTipoUser, String respuesta, int idTipoSolicitud, String nombrePersona, String descripcionSolicitud, String correo, int idEstadoSolicitud) {
        this.numeroSolicitud = numeroSolicitud;
        this.codTipoUser = codTipoUser;
        this.respuesta = respuesta;
        this.idTipoSolicitud = idTipoSolicitud;
        this.nombrePersona = nombrePersona;
        this.descripcionSolicitud = descripcionSolicitud;
        this.correo = correo;
        this.idEstadoSolicitud= idEstadoSolicitud;
    }

    public int getNumeroSolicitud() {
        return this.numeroSolicitud;
    }

    public void setNumeroSolicitud(int numeroSolicitud) {
        this.numeroSolicitud = numeroSolicitud;
    }

    public int getCodTipoUser() {
        return this.codTipoUser;
    }

    public void setCodTipoUser(int codTipoUser) {
        this.codTipoUser = codTipoUser;
    }

    public String getRespuesta() {
        return this.respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public int getIdTipoSolicitud() {
        return this.idTipoSolicitud;
    }

    public void setIdTipoSolicitud(int idTipoSolicitud) {
        this.idTipoSolicitud = idTipoSolicitud;
    }

    public int getIdEstadoSolicitud() {
        return this.idEstadoSolicitud;
    }

    public void setIdEstadoSolicitud(int idEstadoSolicitud) {
        this.idEstadoSolicitud = idEstadoSolicitud;
    }

    public String getNombrePersona() {
        return this.nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public String getDescripcionSolicitud() {
        return this.descripcionSolicitud;
    }

    public void setDescripcionSolicitud(String descripcionSolicitud) {
        this.descripcionSolicitud = descripcionSolicitud;
    }

    public String getCorreo() {
        return this.correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

}
