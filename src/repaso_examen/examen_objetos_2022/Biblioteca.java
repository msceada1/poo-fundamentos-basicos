package repaso_examen.examen_objetos_2022;

import java.util.Arrays;

public class Biblioteca {

    private static final int MAX_CAPACIDAD_PELICULAS = 20;

    private Pelicula[] peliculas;

    public Biblioteca() {
        this.peliculas = new Pelicula[MAX_CAPACIDAD_PELICULAS];
    }

    public void addPelicula(Pelicula pelicula) throws BibliotecaException {
        if (haLlegadoAlLimite()) {
            throw new BibliotecaException("ERROR: ha llegado al limite, no puede añadir mas películas");
        }

        for (int i = 0; i < peliculas.length; i++) {
            if (peliculas[i] == null) {
                peliculas[i] = pelicula;
                break;
            }
        }
    }

    private boolean haLlegadoAlLimite() {
        if (peliculas[peliculas.length - 1] != null) {
            return true;
        }
        return false;
    }

    public void consultarBiblioteca() {
        for (int i = 0; i < peliculas.length; i++) {
            if (peliculas[i] != null) {
                System.out.println(peliculas[i]);
            } else {
                break;
            }
        }
    }

    public void buscarPeliculasPorEtiqueta(String etiqueta) {
        for (int i = 0; i < peliculas.length; i++) {
            if (peliculas[i].getEtiquetas().equalsIgnoreCase(etiqueta)) {
                System.out.println(peliculas[i]);
            }
        }
    }

    public void buscarPeliculaPorTitulo(String titulo) {
        for (int i = 0; i < peliculas.length; i++) {
            if (peliculas[i].getTitulo().equalsIgnoreCase(titulo)) {
                System.out.println(peliculas[i]);
            }
        }
    }

    public void buscarPeliculasConPresupuestoMaximo(double presupuesto) {
        for (int i = 0; i < peliculas.length; i++) {
            if (peliculas[i].getPresupuesto() <= presupuesto) {
                System.out.println(peliculas[i]);
            }
        }
    }

    @Override
    public String toString() {
        return "Biblioteca{" +
                "peliculas=" + Arrays.toString(peliculas) +
                '}';
    }
}
