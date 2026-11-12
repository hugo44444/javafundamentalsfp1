package oopmodelling;

import java.util.Date;

/**
 * Clase principal de oopmodelling.
 *  - Parte 1: ejemplo de clase del profesor con la clase Circle.
 *  - Parte 2: Tarea 5, crear libros con los 3 constructores de Book
 *    (la clase Book es la que dio el profesor).
 *
 * @author Hugo
 */
public class Main {
    public static void main(String[] args) {

        // ===== Parte 1: Circle (ejemplo de clase) =====
        // create three objects from "Circle" class
        Circle c1 = new Circle(2);
        Circle c2 = new Circle();
        Circle c3 = new Circle();
        // Print the memory addresses of the objects
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        // Call methods of the objects
        System.out.println(c1.circumference());
        System.out.println(c2.circumference());
        System.out.println(c1.area());
        System.out.println(c2.area());
        System.out.println(c3.area());

        // ===== Parte 2: Tarea 5, constructores de Book =====
        // Objeto 1: constructor por defecto (sin parámetros)
        Book b1 = new Book();

        // Objeto 2: constructor con 2 parámetros (id y title)
        Book b2 = new Book(2, "Los pilares de la Tierra");

        // Objeto 3: constructor completo con los 6 parámetros
        // (id, title, author, releaseDate, numOfPages, category)
        Book b3 = new Book(3, "Así habló Zaratustra", "Friedrich Nietzsche", new Date(), 352, "Filosofía");

        // b1 y b2 no tienen categoría (vale null). Como "category" es public,
        // la asignamos con la sintaxis de punto:
        b1.category = "Terror";
        b2.category = "Novela Histórica";

        System.out.println("Categoría del libro 1: " + b1.category);
        System.out.println("Categoría del libro 2: " + b2.category);
        System.out.println("Categoría del libro 3: " + b3.category);
    }
}
