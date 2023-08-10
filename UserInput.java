package JavaPackage;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {

		
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter 1st number ");
		int a= scanner.nextInt();
		if (a>10) {
		    System.out.printf("enetr 2nd number");

		    int b= scanner.nextInt();
		    int sum = a+b;
		    System.out.println("addition is"+ sum);
		     }
		
		
		else {
			System.out.printf("enetr positive number");
		}
		
		
	scanner.close();
		
	}

}
