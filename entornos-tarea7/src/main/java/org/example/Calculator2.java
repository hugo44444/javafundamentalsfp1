package org.example;

/**
 * @author cepv
 * @created 11/3/2026
 */
public class Calculator2 {
    /**
     * "final"
     * A final decorated variable can not be modified its value.
     * On the other hand, a final variable can only
     * be initialized once.
     * "static"
     * Static variables are object specific.
     * The variable "PI" should not depend on
     * any specific object, and in the memory should
     * only exist one copy.
     *
     */
    public static final float PI = 3.14f;

    int size = 23;

    public static int sum(int num1, int num2){
       //size++;
        return num1 + num2;
    }

}
