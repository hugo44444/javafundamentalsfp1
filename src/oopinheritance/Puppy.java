package oopinheritance;

/**
 * Puppy hereda de Dog y añade los meses que tiene.
 *
 * @author Hugo
 */
public class Puppy extends Dog {

    protected int months;

    public Puppy(String name, int age, String hairColor, String breed, int months) {
        super(name, age, hairColor, breed);
        this.months = months;
    }

    public void play() {
        System.out.println(name + " está jugando con una pelota.");
    }
}
