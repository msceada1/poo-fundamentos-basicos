package boletin_2.futbol;

public class PartidoApp {

    public static void main(String[] args) {

        System.out.println("Bienvenido al juego de la liga. Vamos a empezar a crear los equipos");

        Equipo equipo1 = new Equipo("Liverpool");
        Equipo equipo2 = new Equipo("Manchester United");
        Equipo equipo3 = new Equipo("Chelsea");

        System.out.println(equipo1);
        System.out.println(equipo2);
        System.out.println(equipo3);

        try {
            Partido partido1 = new Partido(15, equipo1, equipo2, "Anfield", "Liverpool");
            System.out.println(partido1);
            System.out.println("Partido en progreso... ¡Finalizado!");
            partido1.setJugado();
            String resultado = "2-2";
            partido1.ponerResultado(resultado);
            System.out.println(partido1);
        } catch (PartidoException e) {
            System.out.println(e.getMessage());
        }

        try {
            Partido partido2 = new Partido(40, equipo3, equipo1, "Stamford Bridge", "Londres");
        } catch (PartidoException e) {
            System.out.println(e.getMessage());
        }

        try {
            Partido partido3 = new Partido(4, equipo1, equipo1, "Anfield", "Liverpool");
        } catch (PartidoException e) {
            System.out.println(e.getMessage());
        }

        try {
            Partido partido4 = new Partido(8, equipo2, equipo3, "Old Trafford", "Manchester");
            System.out.println(partido4);
            System.out.println("Partido en progreso... ¡Finalizado!");
            partido4.setJugado();
            String resultado = "4-3";
            partido4.ponerResultado(resultado);
            System.out.println(partido4);
        } catch (PartidoException e) {
            System.out.println(e.getMessage());
        }
    }
}
