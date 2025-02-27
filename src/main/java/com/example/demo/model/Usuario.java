package com.example.demo.model;

public class Usuario {

    private String Nombre, Apellido, email;

    public Usuario() {
    }

    public Usuario(String nombre, String apellido, String email) {
        Nombre = nombre;
        Apellido = apellido;
        this.email = email;
    }

    // Getters y Setters
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        this.Apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
