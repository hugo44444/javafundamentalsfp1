package oopexercises;

/**
 * Ejercicio 2: clase Bateria que empieza al 100 % y pierde
 * un 15 % por cada ciclo de uso, usando un bucle while.
 *
 * @author Hugo
 */
public class Bateria {

    private int carga = 100; // empieza siempre al 100 %

    /** Usa la batería tantos ciclos como se indique (o hasta que se agote). */
    public void usar(int ciclos) {
        int ciclo = 1;
        // Seguimos mientras queden ciclos Y quede batería
        while (ciclo <= ciclos && carga > 0) {
            carga = carga - 15;
            if (carga < 0) {
                carga = 0; // la batería no puede bajar de 0 %
            }
            System.out.println("Ciclo " + ciclo + ": batería al " + carga + "%");
            ciclo++;
        }
        if (carga == 0) {
            System.out.println("¡Batería agotada!");
        }
    }

    public int getCarga() {
        return carga;
    }
}
