package oopexercises;

/**
 * Ejercicio 2: Bateria que empieza al 100% y pierde un 15% en cada ciclo.
 *
 * @author Hugo
 */
public class Bateria {

    private int carga = 100;

    public void usar(int ciclos) {
        int ciclo = 1;
        while (ciclo <= ciclos && carga > 0) {
            carga = carga - 15;
            if (carga < 0) {
                carga = 0;
            }
            System.out.println("Ciclo " + ciclo + ": batería al " + carga + "%");
            ciclo++;
        }
        if (carga == 0) {
            System.out.println("Batería agotada");
        }
    }

    public int getCarga() {
        return carga;
    }
}
