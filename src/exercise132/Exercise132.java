package exercise132;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise132 {

	public static void main(String[] args) {
		
		System.out.println("Enter positive number, enter 0 to stop!");
		List<Integer> numbList = new ArrayList<>();
		while(true) {
			Scanner sc = new Scanner(System.in);
			if (sc.hasNextInt()) {
				int input = Integer.parseInt(sc.nextLine());
				if (input != 0) {
					if( input % 2 == 0) {
						numbList.add(input);
					}
				} else {
					System.out.println("List of even numbers: ");
					for (Integer integer : numbList) {
						System.out.println(integer);
					}
					break;
				}				
			} else {
				System.out.println("Please enter a number!");
			}
		}
		
	}

}
