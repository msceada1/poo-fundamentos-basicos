package Maquina_Cafe;

public class Maquina {

    //definicion de constantes
    private static final int CAPACIDAD_DEPOSITO_CAFE = 50;
    private static final int CAPACIDAD_DEPOSITO_LECHE = 50;
    private static final int CAPACIDAD_DEPOSITO_VASOS = 80;
    private static final int PRECIO_CAFE_SOLO = 1;
    private static final double PRECIO_LECHE_SOLA = 0.8;
    private static final double PRECIO_CAFE_CON_LECHE = 1.5;

    //atributos
    private int dosisDeCafe;
    private int dosisDeLeche;
    private int vasosMaquina;
    private double saldoMaquina;

    public Maquina() {
        this.dosisDeCafe = CAPACIDAD_DEPOSITO_CAFE;
        this.dosisDeLeche = CAPACIDAD_DEPOSITO_LECHE;
        this.vasosMaquina = CAPACIDAD_DEPOSITO_VASOS;
        this.saldoMaquina = 10.00;
    }

    public int getDosisDeCafe() {
        return dosisDeCafe;
    }

    public int getDosisDeLeche() {
        return dosisDeLeche;
    }

    public int getVasosMaquina() {
        return vasosMaquina;
    }

    /**
     * Metodo que comprueba si el dinero introducido es menor que el saldo disponible en la maquina
     *
     * @param dineroIntroducido el saldo que introduce el cliente
     * @return {@code true} si el dinero del usuario es menor que el de la maquina, {@code false} en caso contrario
     */
    private boolean hayCambioDisponible(int dineroIntroducido) {
        return dineroIntroducido < this.saldoMaquina;
    }

    private double realizarCambio(int dineroIntroducido) {

        if (!hayCambioDisponible(dineroIntroducido)) {
            System.out.println("No tengo cambio para esa cantidad");
            return 0.0;
        }

        System.out.println("Su cambio : ");
        return this.saldoMaquina - dineroIntroducido;
    }

    public void servirCafeSolo(int dineroIntroducido) {

        System.out.println("Comprobando cambio ...");
        System.out.println(realizarCambio(dineroIntroducido));
    }
}
