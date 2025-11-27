package boletin_2.producto;

public class Producto {

    private static int contador = 0;
    private static double iva = 0.2;

    private String descripcion;
    private double precio;
    private int codigo;

    public Producto(String descripcion, double precio) {
        this.descripcion = descripcion;
        this.precio = precio;
        this.codigo = contador++;
    }

    public double getPrecio() {
        return precio;
    }

    public double getIva() {
        return iva;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    private double precioConIva() {
        return this.precio * (1 + iva);
    }

    @Override
    public String toString() {
        return "Producto{" +
                "descripcion='" + descripcion + '\'' +
                ", precio=" + precio +
                ", codigo=" + codigo +
                ", iva=" + iva +
                '}';
    }
}
