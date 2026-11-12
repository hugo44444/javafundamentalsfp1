package basics;

import java.util.Scanner;

/**
 *
 */
public class ConditionalTest3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int money = scanner.nextInt();
        if (money >= 1000000) {
            System.out.println("1 I will invest half of my money and buy a house next to a beach");
        } else if (money < 1000000 && money > 500000) {
            System.out.println("2 I would  travel more");
        } else if (money <= 500000 && money > 100000) {
            System.out.println("I would  invest all and buy an autonomous car");
        } else {
            System.out.println("I would  eat outside everyday");
        }

    }
}
