package basics.loops;

/**
 * Loops practicas - Nested loops (bucles anidados).
 *
 * Un bucle anidado es un bucle DENTRO de otro.
 * Por cada vuelta del bucle de fuera, el de dentro da TODAS sus vueltas.
 *
 * @author Hugo
 */
public class NestedLoops {

    public static void main(String[] args) {

        // Tablas de multiplicar del 1 al 3
        for (int i = 1; i <= 3; i++) {            // bucle de fuera: la tabla
            System.out.println("Tabla del " + i + ":");
            for (int j = 1; j <= 10; j++) {       // bucle de dentro: 1..10
                System.out.println("  " + i + " x " + j + " = " + (i * j));
            }
        }

        // Dibujar un triángulo de asteriscos
        //  *
        //  **
        //  ***
        for (int fila = 1; fila <= 5; fila++) {
            for (int col = 1; col <= fila; col++) {
                System.out.print("*");
            }
            System.out.println(); // salto de línea al terminar cada fila
        }
    }
}
