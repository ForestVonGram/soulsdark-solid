package org.example;

import java.util.Collection;
import java.util.LinkedList;

public class Jugador implements Personalizacion{
    private final String id;
    private final Collection<Personaje> personajes;

    public Jugador(String id) {
        assert id != null && !id.isBlank();
        this.id = id;
        this.personajes = new LinkedList<>();
    }

    public String getId() {
        return id;
    }public Collection<Personaje> getPersonajes() {
        return personajes;
    }

    @Override
    public void crerPersonaje(String nombre){
        Personaje personaje = new Personaje(nombre);
        personajes.add(personaje);
    }

    @Override
    public void personalizarPersonaje(Personaje personaje,String apodo, String descripcion){
        assert apodo != null && !apodo.isBlank();
        assert descripcion != null && !descripcion.isBlank();


    }

}
