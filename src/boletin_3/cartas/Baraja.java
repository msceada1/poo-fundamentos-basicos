package boletin_3.cartas;

import java.util.Arrays;

public class Baraja {

    private String[] baraja;

    Carta carta = new Carta();

    public Baraja() {
        this.baraja = new String[40];
    }

    private void llenarBaraja() {
        for (int i = 0; i < baraja.length; i++) {
            this.baraja[i] = carta.cartaCompleta();
        }
    }

    public void mostrarBaraja() {
        llenarBaraja();
        System.out.println(Arrays.toString(this.baraja));
    }


}
