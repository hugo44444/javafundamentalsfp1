package oopexercises;

/**
 * Ejercicio 3: clase Estudiante con nombre y nota.
 * (El cálculo de la media de 3 estudiantes está en OopExercisesMain.)
 *
 * @author Hugo
 */
public class Estudiante {

    private String nombre;
    private double nota;

    public Estudiante(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public String getNombre() { return nombre; }
    public double getNota()   { return nota; }
}
