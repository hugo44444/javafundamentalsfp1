package oopmodelling;

/**
 * Tarea 4: Abstracción y modelación de los objetos de nuestro mundo.
 *
 * ABSTRAER = quedarnos solo con las características de un perro
 * que nos interesan para nuestro programa.
 *
 * Una CLASE es el "molde" y cada OBJETO (new Dog(...)) es un perro
 * concreto creado en memoria a partir de ese molde.
 *
 * @author Hugo
 */
public class Dog {

    // 2) ATRIBUTOS comunes a todos los perros.
    //    Son "private": solo se pueden usar DENTRO de esta clase.
    //    Desde fuera se leen con los métodos get (getters).
    private String name;
    private String breed;
    private int age;
    private double weight;
    private String color;

    // 3) CONSTRUCTORES: métodos especiales que se ejecutan con "new".
    //    Se llaman igual que la clase y no tienen tipo de retorno.
    //    Tener varios con distintos parámetros se llama SOBRECARGA.

    /** Constructor 1: sin parámetros (valores por defecto). */
    public Dog() {
        this.name = "Sin nombre";
        this.breed = "Mestizo";
        this.age = 0;
        this.weight = 0.0;
        this.color = "Desconocido";
    }

    /** Constructor 2: solo nombre y raza. */
    public Dog(String name, String breed) {
        this(); // primero pone los valores por defecto del constructor 1
        this.name = name;
        this.breed = breed;
    }

    /** Constructor 3: todos los atributos. */
    public Dog(String name, String breed, int age, double weight, String color) {
        // "this.name" es el atributo; "name" es el parámetro que recibimos
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    // GETTERS: permiten LEER los atributos privados desde otras clases
    public String getName()   { return name; }
    public String getBreed()  { return breed; }
    public int getAge()       { return age; }
    public double getWeight() { return weight; }
    public String getColor()  { return color; }

    /** Devuelve un texto con todos los datos del perro. */
    @Override
    public String toString() {
        return name + " (" + breed + "), " + age + " años, " + weight + " kg, color " + color;
    }

    /** Pequeña prueba: crea un perro con cada constructor. */
    public static void main(String[] args) {
        Dog d1 = new Dog();
        Dog d2 = new Dog("Luna", "Beagle");
        Dog d3 = new Dog("Rocky", "Pastor alemán", 4, 32.5, "negro y marrón");

        System.out.println("Perro 1: " + d1);
        System.out.println("Perro 2: " + d2);
        System.out.println("Perro 3: " + d3);
    }
}
