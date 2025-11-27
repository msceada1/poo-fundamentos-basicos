package boletin_2.producto;

public class ProductoApp {

    public static void main(String[] args) {

        Producto pizza = new Producto("pizza 4 quesos", 3.4);
        System.out.println(pizza);
        System.out.println(calcularPrecioConIva(pizza));

        Producto pepinillos = new Producto("pepinillos de tarro", 12.09);
        System.out.println(pepinillos);
        System.out.println(calcularPrecioConIva(pepinillos));

        Producto ketchup = new Producto("ketchup 0 azúcares", 6.12);
        System.out.println(ketchup);
        System.out.println(calcularPrecioConIva(ketchup));
    }

    private static double calcularPrecioConIva(Producto producto) {
        return producto.getPrecio() * (1 + producto.getIva());
    }
}
