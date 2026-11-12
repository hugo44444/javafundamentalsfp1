package basics;
/**
 * 
 * Sep 11, 2026
 * cepv
 * What is va riable?
 * Why are there different variables?
 * What can do with variables?
 */
public class VariablesTest {
	
	public static void main(String[] args) {
		
		//the structure of the declaration of a variable:
		//type of the variable + name of the variable;
		// = is the assignment operator
		String name = "Nestor";
		System.out.println(name);
		System.out.println(1223123);
		System.out.println("Hello Java");
		name = "Asier";
		System.out.println(name);
		//Declaration of an integer variable
		//an integer has 4 bytes
		//1 byte is 8 bits
		int age = 23;
		long weight = 24l;// a long variable has 8 bytes
		float height = 23.3f;// a float variable holds 4 bytes
		double b = 324.34234234;//a double has 8 bytes
		byte a = -127;//a byte has only one byte of capacity
		
		//increase the value of "age" by 10
		age = age + 10;// + addition operator
		System.out.println(age);
		age = age * 10;// * multiplication operator
		System.out.println(age);
		weight = weight - 100000;
		System.out.println(weight);
		height = height / 100;// division
		System.out.println(height);
		
		a = 3;
		b = 4;
		System.out.println("the square of a = " + a * a);
		System.out.println("the square of b = " + b * b);
		System.out.println("the square of c = " + a * a + b * b);
		
		final int SPEED_OF_LIGHT = 300000000;
		float mass = 2.5f;
//		SPEED_OF_LIGHT = 234;
		System.out.println(mass * SPEED_OF_LIGHT * SPEED_OF_LIGHT);
	}
	
}
