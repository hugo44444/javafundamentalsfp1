package oopmodelling;

/**
 * Tarea 5: clase principal donde probamos los 3 constructores de Book.
 *
 * @author Hugo
 */
public class Main {

    public static void main(String[] args) {

        // Objeto 1: constructor por defecto (sin parámetros)
        Book b1 = new Book();

        // Objeto 2: constructor con 2 parámetros (id y title)
        Book b2 = new Book(2, "Los pilares de la Tierra");

        // Objeto 3: constructor completo con los 6 parámetros
        Book b3 = new Book(3, "Así habló Zaratustra", "Friedrich Nietzsche", 352, 1883, "Filosofía");

        // b1 y b2 se crearon SIN categoría (vale null).
        // Como "category" es public, la asignamos con la sintaxis de punto:
        b1.category = "Terror";
        b2.category = "Novela Histórica";

        System.out.println("Categoría del libro 1: " + b1.category);
        System.out.println("Categoría del libro 2: " + b2.category);
        System.out.println("Categoría del libro 3: " + b3.category);
    }
}
