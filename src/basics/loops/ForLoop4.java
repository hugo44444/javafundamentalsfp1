package basics.loops;


public class ForLoop4 {

	public static void main(String[] args) {
		//add all numbers from 1 to 10
		/**
		 * Step 1: what variables 
		 * should we create to model 
		 * the problem
		 * 
		 */
		int sum = 1 + 2 + 3 + 4 + 5; // 20
		System.out.println(sum);
		sum = 0;
		//first step
		sum = sum + 1;
		//second step
		sum = sum + 2;
		//third step
		sum = sum + 3;
		//fourth step
		sum = sum + 4;
		System.out.println(sum);
		
		sum = 0;
		int j = 0;
		
		j++;
		sum = sum + j;
		
		j++;
		sum = sum + j;
		
		j++;
		sum = sum + j;
		
		j++;
		sum = sum + j;
		
		System.out.println(sum);
		sum = 0;
		int i = 0;
		for (; i < 4;) {
			i++;
			sum = sum + i;
		}
		System.out.println(sum);
		
	}
}
