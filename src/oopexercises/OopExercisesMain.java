package oopexercises;

/**
 * Prueba de los 4 Ejercicios OOP.
 *
 * @author Hugo
 */
public class OopExercisesMain {

    public static void main(String[] args) {

        System.out.println("=== 1. Termostato ===");
        Termostato t = new Termostato(18);
        System.out.println(t.getTemperatura() + " ºC -> ¿calefacción? " + t.modoCalefaccion());
        t.subirTemperatura(4);
        System.out.println(t.getTemperatura() + " ºC -> ¿calefacción? " + t.modoCalefaccion());

        System.out.println("\n=== 2. Batería ===");
        Bateria b = new Bateria();
        b.usar(8);

        System.out.println("\n=== 3. Estudiantes ===");
        // Un ARRAY de 3 objetos Estudiante
        Estudiante[] clase = {
            new Estudiante("Ana", 8.5),
            new Estudiante("Luis", 6.0),
            new Estudiante("Marta", 9.0)
        };
        double suma = 0;
        for (int i = 0; i < clase.length; i++) {
            System.out.println(clase[i].getNombre() + ": " + clase[i].getNota());
            suma += clase[i].getNota();
        }
        System.out.println("Nota promedio: " + (suma / clase.length));

        System.out.println("\n=== 4. Monedero y Persona ===");
        Persona p1 = new Persona("Hugo", 10);
        Persona p2 = new Persona("Asier", 3);
        p1.pasarMonedas(p2, 4);
        p1.pasarMonedas(p2, 20); // no tiene tantas
        System.out.println(p1.getNombre() + " tiene " + p1.getMonedas() + " monedas");
        System.out.println(p2.getNombre() + " tiene " + p2.getMonedas() + " monedas");
    }
}
