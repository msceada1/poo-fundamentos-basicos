package Ejercicio_Persona;

public class PersonaApp {

    public static void main(String[] args) {

        Persona p1 = new Persona();

        System.out.println("Nombre: " + p1.getNombre());
        System.out.println("Fecha de nacimiento: " + p1.getFechaNacimiento());
        System.out.println("DNI: " + p1.getDNI());
        System.out.println("Sexo: " + p1.getSexo());
        System.out.println("Altura: " + p1.getAltura());
        System.out.println("Peso: " + p1.getPeso());
        System.out.printf("IMC: %.2f ", p1.calculoIMC());
    }
}
