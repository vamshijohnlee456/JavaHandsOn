package JavaPackage;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.println("enter a number");
       int a= scanner.nextInt();
       if (a%2 == 0) {
    	   System.out.println("The number is an Even number");
           }
       else {
		System.out.println("the number is an odd number");
	}
       
       scanner.close();
	}

}
