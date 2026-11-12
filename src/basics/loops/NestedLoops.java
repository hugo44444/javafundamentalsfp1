package basics.loops;

/**
 * Loops practicas: bucles anidados (un for dentro de otro)
 *
 * @author Hugo
 */
public class NestedLoops {

    public static void main(String[] args) {

        // tablas de multiplicar del 1 al 3
        for (int i = 1; i <= 3; i++) {
            System.out.println("Tabla del " + i);
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + i * j);
            }
        }

        // triángulo de asteriscos
        for (int fila = 1; fila <= 5; fila++) {
            for (int col = 1; col <= fila; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
