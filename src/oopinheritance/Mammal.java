package oopinheritance;

/**
 * Mammal (mamífero) HEREDA de Animal ("extends Animal").
 *
 * Eso significa que un Mammal ya tiene "name", "age" y "eat()"
 * sin tener que volver a escribirlos.
 * Además añade lo que es ÚNICO de los mamíferos: el color del pelo.
 *
 * @author Hugo
 */
public class Mammal extends Animal {

    // Propiedad única de los mamíferos
    protected String hairColor;

    public Mammal(String name, int age, String hairColor) {
        // super(...) llama al constructor de la clase padre (Animal)
        // para que rellene "name" y "age".
        super(name, age);
        this.hairColor = hairColor;
    }

    public void feedMilk() {
        System.out.println(name + " toma leche de su madre.");
    }
}
