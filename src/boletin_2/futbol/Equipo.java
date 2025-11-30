package boletin_2.futbol;

public class Equipo {

    private final String nombre;
    private int partidosGanados;

    public Equipo(String nombre) {
        this.nombre = nombre;
    }

    public void setPartidosGanados(int partidosGanados) {
        this.partidosGanados = partidosGanados;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Equipo{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
