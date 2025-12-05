package repaso_examen.dado;

import utils.MiEntradaSalida;

public class Dado {

    private static final int VALOR_INICIAL = 1;
    private int maxCarasDados;

    private int valorInicialDaddo;

    public Dado(int maxCarasDados) {
        this.valorInicialDaddo = VALOR_INICIAL;
        this.maxCarasDados = maxCarasDados;
    }

    public int lanzarDado() {
        return MiEntradaSalida.generaAleatorioEntre(VALOR_INICIAL, maxCarasDados, true);
    }

    public void mostrarDadoLanzado() {
        lanzarDado();
    }
}
