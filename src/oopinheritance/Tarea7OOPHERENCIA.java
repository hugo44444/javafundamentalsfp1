package oopinheritance;

/**
 * Tarea 7 OOP: Herencia - clase principal para probar la rama
 * Animal -> Mammal -> Dog -> Puppy.
 *
 * ¿POR QUÉ USAMOS LA HERENCIA?
 *  1. Para NO REPETIR CÓDIGO: "name" y "age" se escriben una sola vez
 *     en Animal y todas las clases hijas los reciben automáticamente.
 *  2. Para ORGANIZAR el código como en el mundo real: un cachorro ES UN
 *     perro, un perro ES UN mamífero y un mamífero ES UN animal.
 *  3. Para que sea FÁCIL DE AMPLIAR: si mañana creamos "Cat extends Mammal",
 *     ya tiene nombre, edad y color de pelo sin escribir nada más.
 *
 * Cada clase tiene propiedades comunes (heredadas) y propiedades únicas:
 *  - Animal: name, age            (comunes a todos)
 *  - Mammal: hairColor            (única de mamíferos)
 *  - Dog:    breed                (única de perros)
 *  - Puppy:  months               (única de cachorros)
 *
 * @author Hugo
 */
public class Tarea7OOPHERENCIA {

    public static void main(String[] args) {

        Puppy dog = new Puppy("Toby", 1, "Brown", "Labrador", 8);

        // Atributos: los 4 primeros son HEREDADOS, "months" es propio de Puppy
        System.out.println("Name: " + dog.name);            // de Animal
        System.out.println("Age: " + dog.age);              // de Animal
        System.out.println("Hair color: " + dog.hairColor); // de Mammal
        System.out.println("Breed: " + dog.breed);          // de Dog
        System.out.println("Months: " + dog.months);        // de Puppy

        // Métodos: también se heredan
        dog.eat();      // de Animal
        dog.feedMilk(); // de Mammal
        dog.bark();     // de Dog
        dog.play();     // de Puppy
    }
}
