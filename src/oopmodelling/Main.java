package oopmodelling;

import java.util.Date;

/**
 * @author cepv
 * @created 10/8/2026
 */
public class Main {
    public static void main(String[] args) {
        //create three objects from "Circle" class
        Circle c1 = new Circle(2);
        Circle c2 = new Circle();
        Circle c3 = new Circle();
        //Print the memory addresses of the objects
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        //Call methods of the objects
        System.out.println(c1.circumference());
        System.out.println(c2.circumference());
        System.out.println(c1.area());
        System.out.println(c2.area());
        System.out.println(c3.area());

        // Tarea 5: un libro con cada constructor
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
