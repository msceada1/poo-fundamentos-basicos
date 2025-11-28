package boletin_2.futbol;

public class Equipo {

    private final String nombre;
    private final String ciudad;
    private final String estadio;
    private int partidosGanados;

    public Equipo(String nombre, String ciudad, String estadio) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.estadio = estadio;
    }
}
