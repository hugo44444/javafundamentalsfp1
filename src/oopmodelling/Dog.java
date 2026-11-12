package oopmodelling;

/**
 * Tarea 4: clase Dog con atributos privados y tres constructores.
 *
 * @author Hugo
 */
public class Dog {

    // atributos comunes de todos los perros
    private String name;
    private String breed;
    private int age;
    private double weight;
    private String color;

    // constructor 1: sin parámetros
    public Dog() {
        name = "Sin nombre";
        breed = "Mestizo";
        age = 0;
        weight = 0;
        color = "Desconocido";
    }

    // constructor 2: nombre y raza
    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
        age = 0;
        weight = 0;
        color = "Desconocido";
    }

    // constructor 3: todos los atributos
    public Dog(String name, String breed, int age, double weight, String color) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public void printInfo() {
        System.out.println(name + " (" + breed + "), " + age + " años, " + weight + " kg, color " + color);
    }

    public static void main(String[] args) {
        Dog d1 = new Dog();
        Dog d2 = new Dog("Luna", "Beagle");
        Dog d3 = new Dog("Rocky", "Pastor alemán", 4, 32.5, "negro y marrón");

        System.out.print("Perro 1: ");
        d1.printInfo();
        System.out.print("Perro 2: ");
        d2.printInfo();
        System.out.print("Perro 3: ");
        d3.printInfo();
    }
}
