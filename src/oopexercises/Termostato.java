package oopexercises;

/**
 * Ejercicio 1: clase Termostato con un atributo temperatura,
 * un método subirTemperatura(int grados) y modoCalefaccion().
 *
 * @author Hugo
 */
public class Termostato {

    private int temperatura;

    public Termostato(int temperaturaInicial) {
        this.temperatura = temperaturaInicial;
    }

    /** Sube la temperatura los grados indicados. */
    public void subirTemperatura(int grados) {
        temperatura = temperatura + grados;
    }

    /** Devuelve true si está en modo calefacción (menos de 20 ºC). */
    public boolean modoCalefaccion() {
        return temperatura < 20;
    }

    public int getTemperatura() {
        return temperatura;
    }
}
