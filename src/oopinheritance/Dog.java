package oopinheritance;

/**
 * Dog hereda de Mammal y añade la raza.
 *
 * @author Hugo
 */
public class Dog extends Mammal {

    protected String breed;

    public Dog(String name, int age, String hairColor, String breed) {
        super(name, age, hairColor);
        this.breed = breed;
    }

    public void bark() {
        System.out.println(name + " dice: ¡Guau!");
    }
}
