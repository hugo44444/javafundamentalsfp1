package basics.loops;

public class ForLoop2 {

	public static void main(String[] args) {
		int value = 0;
		for (int i = 0; i < 4; i++) {
			System.out.println("the value of variable i is " + i);
			value = value + 1;
		}
		System.out.println(value);
	}
}
