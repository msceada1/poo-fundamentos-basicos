package boletin_2.ordenador;

public class OrdenadorApp {

    public static void main(String[] args) {

        DiscoDuro discoDuro = new DiscoDuro("Kingston", "SSD", 500);
        TarjetaGrafica tarjetaGrafica = new TarjetaGrafica("Sapphire", "RADEON RX 9070 XT", 4, 20.00, 16);
        Microprocesador microprocesador = new Microprocesador("Intel", "Core i7-6700", 4, 3.4, "LGA1151");
        PlacaBase placaBase = new PlacaBase("MSI", "AMD B850", "LGA1151");

        System.out.println("Vamos a empezar a montar el primer ordenador:");

        try {
            System.out.println("Comprobando componentes...");
            if (!placaBase.microprocesadorCompatible(microprocesador)) {
                throw new OrdenadorException("Error de incompatibilidad: el socket de la placa base y del microprocesador deben ser iguales");
            }
            System.out.println("Ordenador montado con éxito, mostrando componentes...");
            System.out.println(discoDuro);
            System.out.println(tarjetaGrafica);
            System.out.println(microprocesador);
            System.out.println(placaBase);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        DiscoDuro discoDuro2 = new DiscoDuro("Kingston", "SSD", 500);
        TarjetaGrafica tarjetaGrafica2 = new TarjetaGrafica("Sapphire", "RADEON RX 9070 XT", 4, 20.00, 16);
        Microprocesador microprocesador2 = new Microprocesador("Intel", "Core i7-6700", 4, 3.4, "PGA1151");
        PlacaBase placaBase2 = new PlacaBase("MSI", "AMD B850", "LGA1151");

        try {
            System.out.println("Vamos a montar el segundo ordenador");
            System.out.println("Comprobando componentes...");
            if (!placaBase2.microprocesadorCompatible(microprocesador2)) {
                throw new OrdenadorException("Error de incompatibilidad: el socket de la placa base y del microprocesador deben ser iguales");
            }
            System.out.println(discoDuro2);
            System.out.println(tarjetaGrafica2);
            System.out.println(microprocesador2);
            System.out.println(placaBase2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
