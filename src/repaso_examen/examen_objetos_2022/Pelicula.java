package repaso_examen.examen_objetos_2022;

import java.time.LocalDate;

public class Pelicula {

    private String titulo;
    private LocalDate yearLanzamiento;
    private String director;
    private double presupuesto;
    private double recaudacion;
    private String sipnosis;
    private String etiquetas;
    private double valoracion;

    public Pelicula(String titulo, LocalDate yearLanzamiento, String director, double recaudacion, double presupuesto, String sipnosis, String etiquetas) {
        this.titulo = titulo;
        this.yearLanzamiento = yearLanzamiento;
        this.director = director;
        this.recaudacion = recaudacion;
        this.presupuesto = presupuesto;
        this.sipnosis = sipnosis;
        this.etiquetas = etiquetas;
        this.valoracion = 0;
    }


    private void calcularValoracion(Pelicula pelicula) {
        if (this.recaudacion == this.presupuesto) {
            pelicula.setValoracion(5.00);
        }

        if (this.recaudacion == 0) {
            pelicula.setValoracion(0.00);
        }

        if (this.recaudacion > this.presupuesto) {
            pelicula.setValoracion(10.00);
        }
    }

    public void setValoracion(double valoracion) {
        this.valoracion = valoracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getEtiquetas() {
        return etiquetas;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "titulo='" + titulo + '\'' +
                ", yearLanzamiento=" + yearLanzamiento +
                ", director='" + director + '\'' +
                ", presupuesto=" + presupuesto +
                ", recaudacion=" + recaudacion +
                ", sipnosis='" + sipnosis + '\'' +
                ", etiquetas='" + etiquetas + '\'' +
                ", valoracion=" + valoracion +
                '}';
    }
}
