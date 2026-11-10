package oopinheritance;

/**
 * Tarea 7 OOP: Herencia.
 *
 * Rama elegida del árbol de clases:  Animal -> Mammal -> Dog -> Puppy
 *
 * Animal es la clase "padre" (superclase) de toda la rama.
 * Aquí van las propiedades COMUNES a TODOS los animales.
 *
 * Usamos "protected" en vez de "private" para que las clases hijas
 * (y las clases del mismo paquete) puedan usar estos atributos.
 *
 * @author Hugo
 */
public class Animal {

    // Propiedades comunes a todos los animales
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Comportamiento común a todos los animales
    public void eat() {
        System.out.println(name + " está comiendo.");
    }
}
