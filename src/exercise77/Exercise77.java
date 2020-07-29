package exercise77;

import java.util.Scanner;

public class Exercise77 {

	public static void main(String[] args) {
		
		int number, result = 0;
		
		while(true) {
		
			Scanner sc = new Scanner(System.in);
			if (sc.hasNextInt()) {
				int input = Integer.parseInt(sc.nextLine());
				if (input <= 0) {
					System.out.println("Please enter positive number!");
				} else {
					number = input;
					break;
				}				
			} else {
				System.out.println("Please enter a number!");
			}
			
		}
		
		for (int i = 1; i <= number; i++) {
			result += i;
		}
		
		System.out.println("Result is: " + result);
	}
}
