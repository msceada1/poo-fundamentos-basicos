package boletin_3.cartas;

public class Carta {

    public static final String[] PALOS = {"oro", "espadas", "bastos", "copas"};

    private String palo;
    private int numero;

    public Carta(String palo, int numero) {
        this.palo = palo;
        this.numero = numero;
    }

    public String getPalo() {
        return palo;
    }

    public int getNumero() {
        return numero;
    }

    public String toString() {
        return "%d de %s".formatted(numero, palo);
    }
}
