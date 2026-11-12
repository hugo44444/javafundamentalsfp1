package oopinheritance;

/**
 * Tarea 7 OOP: Herencia
 *
 * Usamos herencia para no repetir código: name y age se escriben solo
 * en Animal y el resto de clases los heredan. Además cada clase añade
 * su propia propiedad (hairColor, breed, months).
 *
 * @author Hugo
 */
public class Tarea7OOPHERENCIA {

    public static void main(String[] args) {

        Puppy dog = new Puppy("Toby", 1, "Brown", "Labrador", 8);

        System.out.println("Name: " + dog.name);
        System.out.println("Age: " + dog.age);
        System.out.println("Hair color: " + dog.hairColor);
        System.out.println("Breed: " + dog.breed);
        System.out.println("Months: " + dog.months);

        // métodos heredados de cada clase
        dog.eat();
        dog.feedMilk();
        dog.bark();
        dog.play();
    }
}
