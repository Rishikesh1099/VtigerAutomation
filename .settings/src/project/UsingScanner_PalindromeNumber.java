package project;

import java.util.Scanner;

public class UsingScanner_PalindromeNumber {

	public static void main(String[] args) {

		String num,reverse="";  //Object of String class
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to check if it is a palindrome");
		num=sc.nextLine();
		int length=num.length();
		for(int i=length-1;i>=0;i--) 
			
			reverse=reverse+num.charAt(i);
			if(num.equals(reverse)) {
				System.out.println("Palindrome Number");
			}else {
				System.out.println("Not Palindrome Number");
			}
			
			
		
		
		
		
		
	}

}
