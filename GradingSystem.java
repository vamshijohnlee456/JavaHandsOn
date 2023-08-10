package JavaPackage;

import java.util.Scanner;

public class GradingSystem {

	public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     System.out.println("enter the percentage");
		int a = scanner.nextInt();
		if (a<35) {
			System.out.println("fail");
		}
		else if (a>=35 && a<70) {
			System.out.println("3rd class");
		}
		else if ( a>=70 && a<85) {
			System.out.println("2nd class");
		}
     
		  else if (a>=85 && a<100 ) {
			System.out.println("1st class");
		}
    
     scanner.close();
	}

}
