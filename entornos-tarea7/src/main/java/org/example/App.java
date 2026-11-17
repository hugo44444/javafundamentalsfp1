package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int number = 0;
        //We use "new" key word to create a new object from a class
        Calculator calculator1 =
                new Calculator();
        Calculator calculator2 =
                new Calculator();
        System.out.println(calculator2.square(2));
        System.out.println(calculator1.exponential(2, 4));



    }
}
