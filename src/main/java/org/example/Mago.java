package org.example;

public class Mago extends Personaje {
    private double inteligencia;
    private double sabiduria;
    private double energiaMagica;

    public Mago(String nombre, String tipo){
        super(nombre, tipo);
        this.inteligencia = 100.0;
        this.sabiduria = 100.0;
        this.energiaMagica = 150.0;
    }

    public double getEnergiaMagica() {
        return energiaMagica;
    }public double getSabiduria() {
        return sabiduria;
    }public double getInteligencia() {
        return inteligencia;
    }

    public double bolaFuego() {
        return energiaMagica*1.20;
    }
    public double rayoElectrico() {
        return inteligencia*1.30;
    }
    public double hechizoCuracion() {
        return sabiduria*1.15;
    }

    @Override
    public void subirNivel(){
        this.energiaMagica += 15;
        this.inteligencia += 10;
        this.sabiduria += 20;
    }
}
