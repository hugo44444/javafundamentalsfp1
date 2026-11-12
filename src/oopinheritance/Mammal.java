package oopinheritance;

/**
 * Mammal hereda de Animal y añade el color del pelo.
 *
 * @author Hugo
 */
public class Mammal extends Animal {

    protected String hairColor;

    public Mammal(String name, int age, String hairColor) {
        super(name, age); // llama al constructor de Animal
        this.hairColor = hairColor;
    }

    public void feedMilk() {
        System.out.println(name + " toma leche de su madre.");
    }
}
