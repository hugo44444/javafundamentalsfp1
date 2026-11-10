package basics.loops;

/**
 * Loops practicas - For loop básico.
 *
 * Estructura del for:
 *   for (inicio; condición; incremento) { ... }
 *   - inicio:     se ejecuta UNA vez al principio (int i = 1)
 *   - condición:  se comprueba ANTES de cada vuelta (i <= 10)
 *   - incremento: se ejecuta al FINAL de cada vuelta (i++)
 *
 * @author Hugo
 */
public class ForLoop1 {

    public static void main(String[] args) {

        // 1) Contar del 1 al 10
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // 2) Sumar los números del 1 al 100
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum = sum + i; // también se puede escribir: sum += i;
        }
        System.out.println("Suma del 1 al 100: " + sum); // 5050

        // 3) Números pares del 0 al 20 (sumando de 2 en 2)
        for (int i = 0; i <= 20; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();

        // 4) Cuenta atrás del 5 al 1
        for (int i = 5; i >= 1; i--) {
            System.out.println(i + "...");
        }
        System.out.println("¡Despegue!");
    }
}
