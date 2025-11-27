package boletin_2.linea;

import utils.MiEntradaSalida;

public class LineaApp {

    public static void main(String[] args) {

        Punto puntoA = new Punto(0, 0);
        Punto puntoB = new Punto(0, 0);
        Linea linea = new Linea(puntoA, puntoB);

        boolean enFuncionamiento = true;

        menu();

        while (enFuncionamiento) {
            String opcion = MiEntradaSalida.leerCadena("¿Que operacion deseas realizar?");

            switch (opcion) {
                case "mover arriba":
                    double posEjeY = MiEntradaSalida.leerDouble("Hasta donde quieres desplazar el punto A?");
                    try {
                        puntoA.moverArriba(posEjeY);
                        linea.setPuntoA(puntoA);
                    } catch (LineaException e) {
                        System.out.println(e.getMessage());
                    }

                    posEjeY = MiEntradaSalida.leerDouble("Hasta donde quieres desplazar el punto B?");
                    try {
                        puntoB.moverArriba(posEjeY);
                        linea.setPuntoB(puntoB);
                    } catch (LineaException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case "mover abajo":
                    posEjeY = MiEntradaSalida.leerDouble("Hasta donde quieres desplazar el punto A?");
                    try {
                        puntoA.moverAbajo(posEjeY);
                        linea.setPuntoA(puntoA);
                    } catch (LineaException e) {
                        System.out.println(e.getMessage());
                    }

                    posEjeY = MiEntradaSalida.leerDouble("Hasta donde quieres desplazar el punto B?");
                    try {
                        puntoB.moverAbajo(posEjeY);
                        linea.setPuntoB(puntoB);
                    } catch (LineaException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case "mover derecha":
                    double posEjeX = MiEntradaSalida.leerDouble("Hasta donde quieres desplazar el punto A?");
                    try {
                        puntoA.moverDerecha(posEjeX);
                        linea.setPuntoA(puntoA);
                    } catch (LineaException e) {
                        System.out.println(e.getMessage());
                    }

                    posEjeX = MiEntradaSalida.leerDouble("Hasta donde quieres desplazar el punto B?");
                    try {
                        puntoB.moverDerecha(posEjeX);
                        linea.setPuntoB(puntoB);
                    } catch (LineaException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case "mover izquierda":
                    posEjeX = MiEntradaSalida.leerDouble("Hasta donde quieres desplazar el punto A?");
                    try {
                        puntoA.moverIzquierda(posEjeX);
                        linea.setPuntoA(puntoA);
                    } catch (LineaException e) {
                        System.out.println(e.getMessage());
                    }

                    posEjeX = MiEntradaSalida.leerDouble("Hasta donde quieres desplazar el punto B?");
                    try {
                        puntoB.moverIzquierda(posEjeX);
                    } catch (LineaException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case "mirar linea":
                    System.out.println(linea);
                    break;

                case "finalizar":
                    enFuncionamiento = false;
            }
        }

        System.out.println("Cerrando sistema...");
    }

    private static void menu() {
        System.out.println("Opciones:\n" +
                "1-Mover arriba\n2-Mover abajo\n3-Mover derecha\n4-Mover izquierda\n5-Mirar linea\n6-Finalizar");
    }
}
