package basics;

/**
 * 
 * Sep 17, 2026
 * cepv
 */
public class ConditionalTest2 {

	public static void main(String[] args) {
		int score = 40;
		if(score >= 80 && score <= 100) {//80 <= score and score >= 100
			System.out.println("excellent");
		}
		else if(score < 80 && score >= 70) {
			System.out.println("good");
		}
		else if(score < 70 && score > 50) {
			System.out.println("ok");
		}
		else {
			System.out.println("so, so");
		}
		
		score = 60;
		if(score > 50) {
			System.out.println("so, so");
		}
		else if(score < 80 && score > 30) {
			System.out.println("good");
		}
	}
}
