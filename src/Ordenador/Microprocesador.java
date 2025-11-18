package Ordenador;

public class Microprocesador {

    private String marca;
    private String modelo;
    private int cantidadNucleos;
    private double velocidadBase;
    private String socket;

    public Microprocesador(String marca, double velocidadBase, String modelo, int cantidadNucleos, String socket) {
        this.marca = marca;
        this.velocidadBase = velocidadBase;
        this.modelo = modelo;
        this.cantidadNucleos = cantidadNucleos;
        this.socket = socket;
    }
}
