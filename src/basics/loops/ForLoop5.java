package basics.loops;

import java.util.Scanner;

/**
 * The problem that we are going to resolve:
 * We have a temperature sensor and a
 * fan connected to a microcontroller.
 * We have to program our microcontroller
 * in the following way:
 * 1 whenever the temperature is greater
 * than 40 degrees, turn on the fan
 * 2 otherwise turn it off
 *
 * (Enunciado del profesor, Sep 24, 2026)
 *
 * El for simula que el microcontrolador lee el sensor muchas veces.
 * El profesor puso 1000 lecturas; aquí usamos 5 para poder probarlo
 * escribiendo las temperaturas a mano.
 *
 * @author Hugo
 */
public class ForLoop5 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        final int LECTURAS = 5;

        for (int i = 1; i <= LECTURAS; i++) {
            System.out.print("Lectura " + i + " - introduce la temperatura: ");
            // OJO: con Windows en español los decimales se escriben con COMA (41,5).
            // Si escribes 41.5 salta un InputMismatchException.
            float temperatura = teclado.nextFloat();

            if (temperatura > 40) {
                System.out.println("Ventilador encendido");
            } else {
                System.out.println("Ventilador apagado");
            }
        }

        teclado.close();
    }
}
