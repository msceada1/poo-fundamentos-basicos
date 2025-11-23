package boletin_2.ordenador;

public class Microprocesador {

    private String marca;
    private String modelo;
    private int numNucleos;
    private double velocidadBase;
    private String socket;

    public Microprocesador(String marca, String modelo, int numNucleos, double velocidadBase, String socket) {
        this.marca = marca;
        this.modelo = modelo;
        this.numNucleos = numNucleos;
        this.velocidadBase = velocidadBase;
        this.socket = socket;
    }

    public String getSocket() {
        return socket;
    }

    @Override
    public String toString() {
        return "Microprocesador{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", numNucleos=" + numNucleos +
                ", velocidadBase=" + velocidadBase +
                ", socket='" + socket + '\'' +
                '}';
    }
}
