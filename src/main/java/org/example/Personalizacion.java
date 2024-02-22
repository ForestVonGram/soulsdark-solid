package org.example;

public interface Personalizacion {
    public abstract void crearPersonaje(String nombre, String tipo);
    public abstract void personalizarPersonaje(Personaje personaje, String apodo, String descripcion);
}
