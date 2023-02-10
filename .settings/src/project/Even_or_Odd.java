package project;

import java.util.Scanner;

public class Even_or_Odd {

	public static void main(String[] args) {
		
		Scanner abc=new Scanner(System.in);
		String a=" ";
		do {
		System.out.println("You are enter any number and check Even or Odd");
		int x=abc.nextInt();
		
		if(x%2==0) {
			System.out.println("Even number");
		}
		else {
			System.out.println("Odd number");
		}
		System.out.println("Do you want to check another number?(yes/no)");
		
		a=abc.next();
		
		}while(a.equalsIgnoreCase("yes"));
		System.out.println("Thank You!");
	}

}
