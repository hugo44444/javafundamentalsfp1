package oopinheritance;

/**
 * Puppy (cachorro) es el último eslabón de la rama:
 * Animal -> Mammal -> Dog -> Puppy
 *
 * Hereda TODO lo anterior (name, age, hairColor, breed, eat(),
 * feedMilk(), bark()) y añade su propiedad única: los meses de vida.
 *
 * @author Hugo
 */
public class Puppy extends Dog {

    // Propiedad única de los cachorros
    protected int months;

    public Puppy(String name, int age, String hairColor, String breed, int months) {
        super(name, age, hairColor, breed); // llama al constructor de Dog
        this.months = months;
    }

    public void play() {
        System.out.println(name + " está jugando con una pelota.");
    }
}
