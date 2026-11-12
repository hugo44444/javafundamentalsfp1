package basics.loops;

/**
 * Loops practicas: for-each para recorrer un array
 *
 * @author Hugo
 */
public class ForEachLoop1 {

    public static void main(String[] args) {

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String car : cars) {
            System.out.println(car);
        }

        double[] notas = {7.5, 6, 9.25, 8};
        double suma = 0;
        for (double nota : notas) {
            suma = suma + nota;
        }
        System.out.println("Media: " + suma / notas.length);
    }
}
