package oopinheritance;

/**
 * Tarea 7 herencia: Animal -> Mammal -> Dog -> Puppy
 * Animal es la clase padre, tiene lo que comparten todos los animales.
 *
 * @author Hugo
 */
public class Animal {

    // protected para que las clases hijas puedan usarlos
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println(name + " está comiendo.");
    }
}
