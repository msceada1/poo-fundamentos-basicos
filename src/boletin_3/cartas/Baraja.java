package boletin_3.cartas;

import java.util.Arrays;
import java.util.Random;

public class Baraja {

    private Carta[] baraja;

    public Baraja() {
        this.baraja = new Carta[40];
    }


    private void llenarBaraja() {
        int contadorCartas = 0;
        for (String palo : Carta.PALOS) {
            for (int i = 0; i < 10; i++) {
                baraja[contadorCartas++] = new Carta(palo, i + 1);
            }
        }
    }

    public void mostrarBaraja() {
        llenarBaraja();
        System.out.println(Arrays.toString(this.baraja));
    }

    public void barajar() {
        Random random = new Random();
        for (int i = 0; i < baraja.length; i++) {
            int cartaBarajada = random.nextInt(i + 1);
            Carta cartaNueva = baraja[i];
            baraja[i] = baraja[cartaBarajada];
            baraja[cartaBarajada] = cartaNueva;
        }
    }

}
