package oopmodeling.math;

/**
 * @author cepv
 * @created 10/8/2026
 */
public class Main {
    public static void main(String[] args) {
        //create three objects from "Circle" class
        Circle c1 = new Circle(2);
        Circle c2 = new Circle();
        Circle c3 = new Circle();
        //Print the memory addresses of the objects
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        //Call methods of the objects
        System.out.println(c1.circumference());
        System.out.println(c2.circumference());
        System.out.println(c1.area());
        System.out.println(c2.area());
        System.out.println(c3.area());

    }
}
