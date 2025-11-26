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
}
