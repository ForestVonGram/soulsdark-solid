package org.example;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Locale;

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
    public void crearPersonaje(String nombre, String tipo){
        Personaje personaje;
        switch (tipo.toLowerCase()){
            case "guerrero":
                personaje = new Guerrero(nombre, tipo);
                break;
            case "mago":
                personaje = new Mago(nombre, tipo);
                break;
            case "arquero":
                personaje = new Arquero(nombre, tipo);
                break;
            default:
                assert false : "Tipo de personaje desconocido: " + tipo;
                return;
        }
        personajes.add(personaje);
    }

    @Override
    public void personalizarPersonaje(Personaje personaje,String apodo, String descripcion){
        assert apodo != null && !apodo.isBlank();
        assert descripcion != null && !descripcion.isBlank();

        boolean encontrado = false;
        for (Personaje p : personajes) {
            if (p.equals(personaje)) {
                p.setApodo(apodo);
                p.setDescripcion(descripcion);
                encontrado = true;
                break;
            }
        }

        assert encontrado : "El personaje no se encuentra en la lista del jugador.";

    }

}
