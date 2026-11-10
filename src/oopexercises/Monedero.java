package oopexercises;

/**
 * Ejercicio 4 (parte 1): clase Monedero con una cantidad de monedas.
 *
 * @author Hugo
 */
public class Monedero {

    private int monedas;

    public Monedero(int monedas) {
        this.monedas = monedas;
    }

    public void meter(int cantidad) {
        monedas += cantidad;
    }

    /** Saca monedas si hay suficientes. Devuelve true si se pudo. */
    public boolean sacar(int cantidad) {
        if (cantidad > monedas) {
            return false; // no hay suficientes monedas
        }
        monedas -= cantidad;
        return true;
    }

    public int getMonedas() {
        return monedas;
    }
}
