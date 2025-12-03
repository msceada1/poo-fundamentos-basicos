package boletin_3.mensajeria;

import utils.MiEntradaSalida;

public class Persona {

    private static final int CAPACIDAD_BUZON = 5;

    private String nombre;
    private Mensaje[] mensajesEnviados;
    private Mensaje[] mensajesRecibidos;

    public Persona(String nombre) {
        this.nombre = nombre;
        this.mensajesEnviados = new Mensaje[CAPACIDAD_BUZON];
        this.mensajesRecibidos = new Mensaje[CAPACIDAD_BUZON];
    }

    /*
    public void enviarMensaje(Mensaje mensaje) {
        for (int i = 0; i < mensajesEnviados.length; i++) {
            if (mensajesEnviados[i] =)
        }
    }

     */

}
