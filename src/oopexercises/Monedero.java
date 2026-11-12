package oopexercises;

/**
 * Ejercicio 4: Monedero con una cantidad de monedas.
 *
 * @author Hugo
 */
public class Monedero {

    private int monedas;

    public Monedero(int monedas) {
        this.monedas = monedas;
    }

    public void meter(int cantidad) {
        monedas = monedas + cantidad;
    }

    public void sacar(int cantidad) {
        monedas = monedas - cantidad;
    }

    public int getMonedas() {
        return monedas;
    }
}
