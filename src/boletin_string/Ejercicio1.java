package boletin_string;

public class Ejercicio1 {

    /*
     Realizar un metodo que tenga como parámetros de entrada una cadena
    de caracteres y un carácter y devuelva cuántas veces aparece ese
    carácter en la cadena. No debe distinguir entre caracteres mayúsculas y
    minúsculas.
     */

    public static void main(String[] args) {

        String alimiento = "PatatA";
        char caracter = 'a';

        System.out.println("La letra '" + caracter + "' se repite en la palabra " + alimiento + " " +
                conteoCaracterRepetido(alimiento, caracter) + " veces");
    }

    private static int conteoCaracterRepetido(String cadena, char caracter) {
        int contador = 0;

        char caracterMin = Character.toLowerCase(caracter);

        for (int i = 0; i < cadena.length(); i++) {
            char caracterActualMin = Character.toLowerCase(cadena.charAt(i));
            if (caracterActualMin == caracterMin) {
                contador++;
            }
        }

        return contador;
    }
}

