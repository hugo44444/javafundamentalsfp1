package basics.loops;
/**
 * 
 * Sep 22, 2026
 * cepv
 */
public class ForLoop3 {

	public static void main(String[] args) {
//		print all even numbers between 5 and 102
//		for (int i = 4; i <= 102; i = i + 2) {
//			System.out.println(i);
//		}
		
//		print all even numbers between 5 and 102
		for (int i = 5; i <= 102; i = i + 1) {
			//if the value of i is even, we print it 
			if(i % 2 == 0) {
				System.out.println(i);
			}
		}
		
		for (int i = 0; i <= 102; i = i + 1) {
			//if the value of i is even, we print it 
			/** 
			 * "i % 2 == 1" 
			 * is equivalent to 
			 * "i % 2 != 0"
			 * "!=" means not equal
			 * "==" means equal
			 */
			if(i % 2 != 0) {
				System.out.println(i);
			}
		}
	}
}
