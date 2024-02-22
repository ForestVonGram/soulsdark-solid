package org.example;

public class Guerrero extends Personaje{
    private double fuerza;
    private double resistencia;
    private double vitalidad;

    public Guerrero(String nombre, String tipo){
        super(nombre, tipo);
        this.fuerza = 200.0;
        this.resistencia = 150.0;
        this.vitalidad = 200.0;
    }

    public double getFuerza() {
        return fuerza;
    }public double getResistencia() {
        return resistencia;
    }public double getVitalidad() {
        return vitalidad;
    }

    public double espadaAfilada() {
        return fuerza*1.13;
    }
    public double golpeDefinitivo() {
        return fuerza*1.25;
    }
    public double vitalidad() {
        return vitalidad*0.45;
    }

    @Override
    public void subirNivel(){
        this.fuerza += 10;
        this.resistencia += 5;
        this.vitalidad += 15;
    }
}
