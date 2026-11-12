package oopexercises;

/**
 * Ejercicio 1: Termostato
 *
 * @author Hugo
 */
public class Termostato {

    private int temperatura;

    public Termostato(int temperatura) {
        this.temperatura = temperatura;
    }

    public void subirTemperatura(int grados) {
        temperatura = temperatura + grados;
    }

    // está en modo calefacción si hay menos de 20 grados
    public boolean modoCalefaccion() {
        if (temperatura < 20) {
            return true;
        } else {
            return false;
        }
    }

    public int getTemperatura() {
        return temperatura;
    }
}
