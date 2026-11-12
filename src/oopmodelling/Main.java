package oopmodelling;

import java.util.Date;

/**
 * Tarea 5: uso de diferentes constructores de la clase Book
 *
 * @author Hugo
 */
public class Main {
    public static void main(String[] args) {

        // un libro con cada constructor
        Book b1 = new Book();
        Book b2 = new Book(2, "Los pilares de la Tierra");
        Book b3 = new Book(3, "Así habló Zaratustra", "Friedrich Nietzsche", new Date(), 352, "Filosofía");

        // category es public, así que la podemos cambiar con el punto
        b1.category = "Terror";
        b2.category = "Novela Histórica";

        System.out.println("Categoría del libro 1: " + b1.category);
        System.out.println("Categoría del libro 2: " + b2.category);
        System.out.println("Categoría del libro 3: " + b3.category);
    }
}
