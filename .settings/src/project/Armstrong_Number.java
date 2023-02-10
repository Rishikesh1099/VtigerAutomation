package project;

public class Armstrong_Number {

	public static void main(String[] args) {

		int num=153;
		int sum=0;
		while (num>0) {
			int r=num%10;
			//sum=sum+r*r*r;
			sum +=r*r*r;
			num=num/10;
			
		}
		System.out.println(sum);
	}

}
