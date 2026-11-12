package oopexercises;

/**
 * Pruebas de los ejercicios OOP.
 *
 * @author Hugo
 */
public class OopExercisesMain {

    public static void main(String[] args) {

        // 1 Termostato
        Termostato t = new Termostato(18);
        System.out.println(t.getTemperatura() + " grados, calefacción: " + t.modoCalefaccion());
        t.subirTemperatura(4);
        System.out.println(t.getTemperatura() + " grados, calefacción: " + t.modoCalefaccion());

        // 2 Bateria
        Bateria b = new Bateria();
        b.usar(8);

        // 3 Nota media de 3 estudiantes
        Estudiante[] estudiantes = new Estudiante[3];
        estudiantes[0] = new Estudiante("Ana", 8.5);
        estudiantes[1] = new Estudiante("Luis", 6);
        estudiantes[2] = new Estudiante("Marta", 9);

        double suma = 0;
        for (int i = 0; i < estudiantes.length; i++) {
            suma = suma + estudiantes[i].getNota();
        }
        System.out.println("Nota media: " + suma / estudiantes.length);

        // 4 Monedero y Persona
        Persona p1 = new Persona("Hugo", 10);
        Persona p2 = new Persona("Asier", 3);
        p1.pasarMonedas(p2, 4);
        p1.pasarMonedas(p2, 20);
        System.out.println(p1.getNombre() + " tiene " + p1.getMonedas() + " monedas");
        System.out.println(p2.getNombre() + " tiene " + p2.getMonedas() + " monedas");
    }
}
