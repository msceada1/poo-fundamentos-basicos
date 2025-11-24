package boletin_2.videojuego;

public class Ordenador {

    private int numNucleosProcesador;
    private double velCPU;
    private int espacioDiscoDuro;
    private int nucleosGPU;
    private int memoriaGPU;

    public Ordenador(int numNucleosProcesador, double velCPU, int espacioDiscoDuro, int nucleosGPU, int memoriaGPU) {
        this.numNucleosProcesador = numNucleosProcesador;
        this.velCPU = velCPU;
        this.espacioDiscoDuro = espacioDiscoDuro;
        this.nucleosGPU = nucleosGPU;
        this.memoriaGPU = memoriaGPU;
    }
}
