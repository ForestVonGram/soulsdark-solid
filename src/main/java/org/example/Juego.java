package org.example;

import java.util.Collection;
import java.util.LinkedList;

public class Juego {
    private Collection<Jugador> jugadores;
    private Collection<Personaje> personajes;

    public Juego() {
        this.jugadores = new LinkedList<>();
        this.personajes = new LinkedList<>();
    }

    public Collection<Jugador> getJugadores() {
        return jugadores;
    }

    public void crearJugador(String id) {
        Jugador jugador = new Jugador(id);
        jugadores.add(jugador);
    }

    public void registrarPersonaje(Personaje personaje) {
        assert personaje != null;
        personajes.add(personaje);
    }
}
