package basics.loops;

/**
 * Loops practicas - Do/While loop.
 *
 * Diferencia con el while normal:
 *  - while:    comprueba la condición ANTES  -> puede no ejecutarse nunca.
 *  - do-while: comprueba la condición DESPUÉS -> se ejecuta MÍNIMO una vez.
 *
 * @author Hugo
 */
public class DoWhileLoop1 {

    public static void main(String[] args) {

        int i = 0;
        do {
            System.out.println("Vuelta número " + i);
            i++;
        } while (i < 5);

        // Aunque la condición sea falsa desde el principio,
        // el do-while se ejecuta una vez:
        int x = 100;
        do {
            System.out.println("Esto se imprime una vez aunque x < 5 sea falso");
        } while (x < 5);
    }
}
