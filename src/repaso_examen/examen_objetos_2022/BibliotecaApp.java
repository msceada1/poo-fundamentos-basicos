package repaso_examen.examen_objetos_2022;

import utils.MiEntradaSalida;

import java.time.LocalDate;

public class BibliotecaApp {

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        boolean ejecutar = true;

        while (ejecutar) {
            System.out.println("bienvenido a la biblioteca de peliculas, actualemente, su biblioteca se encuentra vacía");
            menu();
        }
    }

    private Pelicula introducirDatosPelicula(String titulo, LocalDate fechaLanzamiento, String director, double presupuesto, double recaudacion, String sipnosis, String etiquetas) {
        return new Pelicula(titulo, fechaLanzamiento, director, presupuesto, recaudacion, sipnosis, etiquetas);
    }

    private static void menu() {
        System.out.println("Opciones: \n 1-añadir nueva pelicula \n 2-consultar la biblioteca \n 3-buscar pelicula por etiquetas" +
                "\n 4-buscar pelicula por titulo \n 5-Buscar peliculas por presupuesto \n 6-Salir");
    }
}
