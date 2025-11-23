package boletin_2.ordenador;

public class TarjetaGrafica {

    private String marca;
    private String modelo;
    private int numNucleos;
    private double velocidadBase;
    private int cantidadMemoria;

    public TarjetaGrafica(String marca, String modelo, int numNucleos, double velocidadBase, int cantidadMemoria) {
        this.marca = marca;
        this.modelo = modelo;
        this.numNucleos = numNucleos;
        this.velocidadBase = velocidadBase;
        this.cantidadMemoria = cantidadMemoria;
    }

    @Override
    public String toString() {
        return "TarjetaGrafica{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", numNucleos=" + numNucleos +
                ", velocidadBase=" + velocidadBase +
                ", cantidadMemoria=" + cantidadMemoria +
                '}';
    }
}
