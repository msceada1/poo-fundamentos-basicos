package boletin_2.ordenador;

public class DiscoDuro {

    private String marca;
    private String tipo;
    private int capacidad;

    public DiscoDuro(String tipo, String marca, int capacidad) {
        this.tipo = tipo;
        this.marca = marca;
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "DiscoDuro{" +
                "marca='" + marca + '\'' +
                ", tipo='" + tipo + '\'' +
                ", capacidad=" + capacidad +
                '}';
    }
}
