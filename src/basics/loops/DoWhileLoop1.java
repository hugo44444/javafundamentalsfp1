package basics.loops;

/**
 * Loops practicas: do while
 * El do while se ejecuta al menos una vez porque comprueba la condición al final.
 *
 * @author Hugo
 */
public class DoWhileLoop1 {

    public static void main(String[] args) {

        int i = 0;
        do {
            System.out.println("Vuelta " + i);
            i++;
        } while (i < 5);

        // aunque la condición es falsa, entra una vez
        int x = 100;
        do {
            System.out.println("x vale " + x);
        } while (x < 5);
    }
}
