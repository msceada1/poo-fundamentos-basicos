package boletin_2.jarra;

import boletin_2.linea.LineaException;

public class Jarra {

    //atributos
    private double aguaConsumida = 0;

    private double aguaContenidaEnJarra;
    private final int limiteDeJarra;

    public Jarra(int limiteDeJarra) {
        this.aguaContenidaEnJarra = 0;
        this.limiteDeJarra = limiteDeJarra;
    }

    public double getAguaContenidaEnJarra() {
        return aguaContenidaEnJarra;
    }

    public int getLimiteDeJarra() {
        return limiteDeJarra;
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

    public void llenarJarraEnOtra(Jarra jarra1, Jarra jarra2, double cantidadAVolcar) throws JarraException {

        if (jarra1.getAguaContenidaEnJarra() == this.limiteDeJarra && jarra2.getAguaContenidaEnJarra() == this.limiteDeJarra) {
            throw new JarraException("ERROR: Las jarras estan en el limite");
        }

        if (cantidadAVolcar > jarra1.aguaContenidaEnJarra) {
            throw new JarraException("ERROR: La cantidad a volcar es mayor que la capacidad de la jarra");
        }
    }
}
