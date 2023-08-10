package JavaPackage;

import java.util.Scanner;

public class EvenOddusingSwitch {


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a number");
		int number1 = scanner.nextInt();
		int number = number1%2; 
		switch (number) {
		case 0:
            System.out.println(number1 + " " + "is prime number");
			break;
		default:
			System.out.println(number1 + " " + "is odd number");
			break;
		}
		
		scanner.close();
	}
}