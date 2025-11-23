package boletin_2.ordenador;

public class PlacaBase {

    private String marca;
    private String chipset;
    private String socket;

    public PlacaBase(String marca, String chipset, String socket) {
        this.marca = marca;
        this.chipset = chipset;
        this.socket = socket;
    }

    public boolean microprocesadorCompatible(Microprocesador microprocesador) {
        return this.socket.equals(microprocesador.getSocket());
    }

    @Override
    public String toString() {
        return "PlacaBase{" +
                "marca='" + marca + '\'' +
                ", chipset='" + chipset + '\'' +
                ", socket='" + socket + '\'' +
                '}';
    }
}
