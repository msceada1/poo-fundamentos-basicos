package Ejercicio_Persona;

import java.time.LocalDate;

public class Persona {

    //definicion de constantes
    private static final char[] listaLetrasDNI = {
            'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'
    };

    //definicion de atributos
    private final String nombre;
    private final String DNI;
    private final char sexo;
    private double altura;
    private double peso;
    private final LocalDate fechaNacimiento;

    //constructor
    public Persona() {
        this.nombre = "Manuel";
        this.DNI = "28644988";
        this.sexo = 'H';
        this.altura = 1.85;
        this.peso = 76;
        this.fechaNacimiento = LocalDate.of(2005, 2, 10);
    }

    public String getDNI() {
        return DNI + calculoLetraDNI();
    }

    public String getNombre() {
        return nombre;
    }

    public char getSexo() {
        return sexo;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calculoIMC() {
        return this.peso / Math.pow(this.altura, 2);
    }

    private char calculoLetraDNI() {

        int DNI = Integer.parseInt(this.DNI);
        int resto = DNI % 23;

        return listaLetrasDNI[resto];
    }
}
