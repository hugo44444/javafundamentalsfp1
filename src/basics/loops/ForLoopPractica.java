package basics.loops;

/**
 * Loops practicas: for
 *
 * @author Hugo
 */
public class ForLoopPractica {

    public static void main(String[] args) {

        // contar del 1 al 10
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        // sumar del 1 al 100
        int suma = 0;
        for (int i = 1; i <= 100; i++) {
            suma = suma + i;
        }
        System.out.println("Suma: " + suma);

        // números pares hasta 20
        for (int i = 0; i <= 20; i = i + 2) {
            System.out.println(i);
        }

        // cuenta atrás
        for (int i = 5; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println("Fin");
    }
}
