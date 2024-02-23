package org.example;

public class Arquero extends Personaje{
    private double destreza;
    private double agilidad;
    private double precision;

    public Arquero(String nombre, String tipo) {
        super(nombre, tipo);
        this.destreza = 120;
        this.agilidad = 150;
        this.precision = 125;
    }

    public double getPrecision() {
        return precision;
    }public double getDestreza() {
        return destreza;
    }public double getAgilidad() {
        return agilidad;
    }

    public double disparoRapido() {
        return precision*1.12;
    }
    public double flechaVenenosa() {
        return destreza*1.25;
    }
    public double tiroCertero() {
        return precision*0.75 + destreza*0.9;
    }

    @Override
    public void subirNivel() {
        this.precision += 10;
        this.agilidad += 10;
        this.destreza += 15;
    }
}
