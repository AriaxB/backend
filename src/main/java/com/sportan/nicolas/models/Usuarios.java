package com.sportan.nicolas.models;
import java.time.LocalDate;

public class Usuarios {
    private int idUsuario, idRol,codGenero,codCiudad;
    private String nombresUser,apellidosUser,direccion,correo,numTelefono,numDocumento,contrasena;
    private LocalDate fechaNacimiento;

    public Usuarios() {
    }

    public Usuarios(int idUsuario, int idRol, int codGenero, int codCiudad, String nombresUser, String apellidosUser, String direccion, String correo, String numTelefono, String numDocumento, String contrasena, LocalDate fechaNacimiento) {
        this.idUsuario = idUsuario;
        this.idRol = idRol;
        this.codGenero = codGenero;
        this.codCiudad = codCiudad;
        this.nombresUser = nombresUser;
        this.apellidosUser = apellidosUser;
        this.direccion = direccion;
        this.correo = correo;
        this.numTelefono = numTelefono;
        this.numDocumento = numDocumento;
        this.contrasena = contrasena;
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getIdUsuario() {
        return this.idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdRol() {
        return this.idRol;
    }

    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }

    public int getCodGenero() {
        return this.codGenero;
    }

    public void setCodGenero(int codGenero) {
        this.codGenero = codGenero;
    }

    public int getCodCiudad() {
        return this.codCiudad;
    }

    public void setCodCiudad(int codCiudad) {
        this.codCiudad = codCiudad;
    }

    public String getNombresUser() {
        return this.nombresUser;
    }

    public void setNombresUser(String nombresUser) {
        this.nombresUser = nombresUser;
    }

    public String getApellidosUser() {
        return this.apellidosUser;
    }

    public void setApellidosUser(String apellidosUser) {
        this.apellidosUser = apellidosUser;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return this.correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNumTelefono() {
        return this.numTelefono;
    }

    public void setNumTelefono(String numTelefono) {
        this.numTelefono = numTelefono;
    }

    public String getNumDocumento() {
        return this.numDocumento;
    }

    public void setNumDocumento(String numDocumento) {
        this.numDocumento = numDocumento;
    }

    public String getContrasena() {
        return this.contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public LocalDate getFechaNacimiento() {
        return this.fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }



}
