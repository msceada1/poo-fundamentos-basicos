package boletin_2.linea;

public class Linea {

    private Punto puntoA;
    private Punto puntoB;

    public Linea(Punto puntoA, Punto puntoB) {
        this.puntoA = puntoA;
        this.puntoB = puntoB;
    }

    /**
     * Metodo que recibe dos objetos de tipo Punto y comprueba si son iguales
     *
     * @param puntoA el primer punto con el que s trabaja
     * @param puntoB el segundo punto con el que se trabaja
     * @return {@code true} si tienen el mismo valor, {@code false} en caso contrario
     */
    public boolean mismaLinea(Punto puntoA, Punto puntoB) {
        return puntoA.equals(puntoB);
    }

}
