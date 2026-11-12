package oopmodelling;

/**
 * @author cepv
 * @created 10/8/2026
 */
public class Circle {
    //main properties or attributes of the objects of a class
    private float radius = 1;

    public final float PI = 3.14f;

    //constructors: We use constructors to create objects of a class

    /**
     * The main differences between a normal method and
     * a constructor:
     * 1 A constructor is used only to create objects
     * 2 The name of a constructor is the same as the
     * name of the class
     * Constructor of the class with parameters
     * @param radius
     */
    public  Circle(float radius) {
        this.radius = radius;
    }

    //empty constructor
    public Circle() {

    }

    //behaviours,  functions or methods

    public float area(){
        return PI * radius * radius;
    }
    public float circumference(){
        return 2 * PI * radius;
    }


}
