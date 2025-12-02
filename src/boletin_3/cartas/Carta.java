package boletin_3.cartas;

import java.util.Random;

public class Carta {

    private String palo;
    private int numero;

    public Carta() {
        this.palo = palo;
        this.numero = numero;
    }

    public String getPalo() {
        return palo;
    }

    public int getNumero() {
        return numero;
    }

    /**
     * Metodo que selecciona un indice aletorio de un array de String y devuelve el valor del indice aleatorio
     * generado
     *
     * @return el valor del indice aleatorio de un Array de string
     */
    private String obtenerPalo() {
        String[] palos = {"Oro", "Copas", "Espadas", "Bastos"};
        Random random = new Random();
        String paloAleatorio = palos[random.nextInt(palos.length)];
        return paloAleatorio;
    }

    private String numeroDePalo() {
        int numPalo = (int) (Math.random() * 8) + 1;
        return String.valueOf(numPalo);
    }

    public String cartaCompleta() {
        return numeroDePalo().concat(" de ").concat(obtenerPalo());
    }
}
