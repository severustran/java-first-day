package exercise78;

import java.util.Scanner;

public class Exercise78 {

	public static void main(String[] args) {
		
		int input;
		while(true) {
			Scanner sc = new Scanner(System.in);
			if(sc.hasNextInt()) {
				int n = Integer.parseInt(sc.nextLine());
				if ( n <= 0) {
					System.out.println("Please enter positive number!");
				} else {
					input = n;
					break;
				}
			} else {
				System.out.println("Please enter a number!");
			}
		}
		
		int tempSubmultiple = 1;
		while (tempSubmultiple <= input/2) {
			if( input%tempSubmultiple == 0) {
				System.out.println(tempSubmultiple);
			}
			tempSubmultiple++;
		}
		System.out.println(input);
	}

}
