package Ejercicio_Persona;

import java.time.LocalDate;

public class PersonaApp {

    public static void main(String[] args) {

        Persona p1 = new Persona("Manuel", "28944889", 'H', LocalDate.of(2005, 2, 10), 1.85, 76);

        String persona1 = p1.toString();
        System.out.println(persona1);
    }
}
