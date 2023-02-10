package project;
import java.util.Scanner;
public class Leap_Year {
	public static void main(String[] args) {
		String a = " ";
		do {
			Scanner abc = new Scanner(System.in);
			Scanner abc1 = new Scanner(System.in);
			System.out.println("You are enter any year and check leap year or non leap year");
			if (abc.hasNextInt()) {
				int x = abc.nextInt();
				if (x % 4 == 0) {
					System.out.println("Leap year");
				} else if (x % 400 == 0) {
					System.out.println("Leap year");
				} else {
					System.out.println("Non Leap year");
				}
			} else
				System.err.println("invalid input (Only no.are allowed)");
			System.out.println("Do you want to check another year ?(yes/no)");
			a = abc1.next();


		} while (a.equalsIgnoreCase("yes"));

		System.out.println("Thanks You!");
	}
}
