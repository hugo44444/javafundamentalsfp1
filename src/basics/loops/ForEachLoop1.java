package basics.loops;

/**
 * Loops practicas - For-each loop.
 *
 * Sirve para recorrer TODOS los elementos de un array (o lista)
 * sin tener que usar un índice (i).
 *   for (Tipo elemento : array) { ... }
 * Se lee: "para cada elemento DE array".
 *
 * @author Hugo
 */
public class ForEachLoop1 {

    public static void main(String[] args) {

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String car : cars) {
            System.out.println(car);
        }

        // Calcular la media de unas notas con for-each
        double[] notas = {7.5, 6.0, 9.25, 8.0};
        double suma = 0;
        for (double nota : notas) {
            suma += nota;
        }
        System.out.println("Media: " + (suma / notas.length));
    }
}
