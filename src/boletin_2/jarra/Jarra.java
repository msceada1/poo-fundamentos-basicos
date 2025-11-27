package boletin_2.jarra;

import boletin_2.linea.LineaException;

public class Jarra {

    //atributos
    private double aguaConsumida = 0;

    private double aguaContenidaEnJarra;

    public Jarra() {
        this.aguaContenidaEnJarra = 0;
    }

    public double getAguaContenidaEnJarra() {
        return aguaContenidaEnJarra;
    }

    public void setAguaContenidaEnJarra(double aguaContenidaEnJarra) {
        this.aguaContenidaEnJarra = aguaContenidaEnJarra;
    }

    public void llenarJarra(double cantidadALlenar, int limiteJarra) throws LineaException {

        if (cantidadALlenar <= 0 || (this.aguaContenidaEnJarra + cantidadALlenar) > limiteJarra) {
            throw new LineaException("ERROR: no puedes introducir una cantida igual o inferior a 0 o mayor al limite");
        }

        setAguaContenidaEnJarra(cantidadALlenar + this.aguaContenidaEnJarra);
    }
}
