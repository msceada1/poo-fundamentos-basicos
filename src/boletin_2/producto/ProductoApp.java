package boletin_2.producto;

public class ProductoApp {

    public static void main(String[] args) {

        Producto pizza = new Producto("pizza 4 quesos", 3.4);
        System.out.println(pizza);
        System.out.printf("el precio con IVA incluido es %.2f", calcularPrecioConIva(pizza));

        Producto pepinillos = new Producto("pepinillos de tarro", 12.09);
        System.out.println("\n" + pepinillos);
        System.out.printf("el precio con IVA incluido es %.2f", calcularPrecioConIva(pepinillos));

        Producto ketchup = new Producto("ketchup 0 azúcares", 6.12);
        System.out.println("\n" + ketchup);
        System.out.printf("precio con IVA incluido %.2f ", calcularPrecioConIva(ketchup));
    }

    private static double calcularPrecioConIva(Producto producto) {
        return producto.getPrecio() * (1 + producto.getIva());
    }
}
