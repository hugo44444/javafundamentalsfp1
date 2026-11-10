package oopinheritance;

/**
 * Dog (perro) HEREDA de Mammal, que a su vez hereda de Animal.
 * Por tanto un Dog tiene: name, age (de Animal), hairColor (de Mammal)
 * y además su propiedad única: la raza (breed).
 *
 * @author Hugo
 */
public class Dog extends Mammal {

    // Propiedad única de los perros
    protected String breed;

    public Dog(String name, int age, String hairColor, String breed) {
        super(name, age, hairColor); // llama al constructor de Mammal
        this.breed = breed;
    }

    public void bark() {
        System.out.println(name + " dice: ¡Guau!");
    }
}
