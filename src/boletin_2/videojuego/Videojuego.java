package boletin_2.videojuego;

import java.time.LocalDate;

public class Videojuego {

    //atributos
    private String nombre;
    private String entidadCreadora;
    private LocalDate fechaCreacion;
    private int numNucleosProcesador;
    private double minVelCPU;
    private int minDiscoDuro;
    private int minNucleosGPU;
    private int minMemoriaGPU;

    //constructor
    public Videojuego(String nombre, String entidadCreadora, LocalDate fechaCreacion, int numNucleosProcesador, double minVelCPU, int minDiscoDuro, int minNucleosGPU, int minMemoriaGPU) {
        this.nombre = nombre;
        this.entidadCreadora = entidadCreadora;
        this.fechaCreacion = fechaCreacion;
        this.numNucleosProcesador = numNucleosProcesador;
        this.minVelCPU = minVelCPU;
        this.minDiscoDuro = minDiscoDuro;
        this.minNucleosGPU = minNucleosGPU;
        this.minMemoriaGPU = minMemoriaGPU;
    }
    /*
    public boolean jugable(Ordenador ordenador) {

    }

     */
}
