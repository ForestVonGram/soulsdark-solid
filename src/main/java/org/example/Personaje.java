package org.example;

public abstract class Personaje {
    private final String nombre;
    private final String tipo;
    private String apodo;
    private String descripcion;
    private double dinero;

    public Personaje(String nombre, String tipo){
        assert nombre != null && !nombre.isBlank();
        assert tipo != null && !tipo.isBlank();
        this.nombre = nombre;
        this.tipo = tipo;
        this.apodo = "";
        this.descripcion = "";
        this.dinero = 100.0;
    }

    public String getApodo() {
        return apodo;
    }public String getDescripcion() {
        return descripcion;
    }public double getDinero() {
        return dinero;
    }public String getNombre() {
        return nombre;
    }

    public void setApodo(String apodo){
        assert apodo != null && !apodo.isBlank();
        this.apodo = apodo;
    }

    public void setDescripcion(String apodo){
        assert apodo != null && !apodo.isBlank();
        this.apodo = apodo;
    }

    public void agregarDinero(double dinero){
        assert dinero > 0;
        this.dinero += dinero;
    }

    public void retirarDinero(double dinero){
        assert dinero > 0;
        assert this.dinero - dinero > 0;
        this.dinero -= dinero;
    }

    public void capacidades(){

    }

    public abstract void subirNivel();
}
