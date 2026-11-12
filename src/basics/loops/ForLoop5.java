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
 * @author Hugo
 */
public class ForLoop5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // hacemos 5 lecturas del sensor (los decimales con coma: 41,5)
        for (int i = 0; i < 5; i++) {
            System.out.print("Temperatura: ");
            float temperature = scanner.nextFloat();

            if (temperature > 40) {
                System.out.println("Ventilador encendido");
            } else {
                System.out.println("Ventilador apagado");
            }
        }
        scanner.close();
    }
}
