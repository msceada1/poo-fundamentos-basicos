package boletin_2.linea;

public class Punto {

    private double posEjeX;
    private double posEjeY;

    public Punto(double posEjeX, double posEjeY) {
        this.posEjeX = posEjeX;
        this.posEjeY = posEjeY;
    }

    public double getPosEjeX() {
        return posEjeX;
    }

    public void setPosEjeX(double posEjeX) {
        this.posEjeX = posEjeX;
    }

    public double getPosEjeY() {
        return posEjeY;
    }

    public void setPosEjeY(double posEjeY) {
        this.posEjeY = posEjeY;
    }

    /**
     * Metodo que desplaza el eje x a la derecha
     * @param nuevaPosEjeX el desplazamiento que desea hacer el usuario
     * @throws LineaException
     */
    public void moverDerecha(double nuevaPosEjeX) throws LineaException {

        if (nuevaPosEjeX <= this.posEjeX) {
            throw new LineaException("ERROR: Te has mantenido o has introducido una posicion inferior a la que estás");
        }

        this.posEjeX = nuevaPosEjeX;
    }

    public void moverIzquierda(double nuevaPosEjeX) throws LineaException {

        if (nuevaPosEjeX >= this.posEjeX) {
            throw new LineaException("ERROR: Te has mantenido o has introducido una posicion superior a la que estas");
        }

        this.posEjeX = nuevaPosEjeX;
    }

    public void moverArriba(double nuevaPosEjeY) throws LineaException {

        if (nuevaPosEjeY <= this.posEjeY) {
            throw new LineaException("ERROR: No puedes mantenerte o introducir una posicion inferior a la que está");
        }

        this.posEjeY = nuevaPosEjeY;
    }

    public void moverAbajo(double nuevaPosEjeY) throws LineaException {

        if (nuevaPosEjeY >= this.posEjeY) {
            throw new LineaException("ERROR: No puedes mantenerte o introducir una posicion superior a la que estás");
        }

        this.posEjeY = nuevaPosEjeY;
    }
}
