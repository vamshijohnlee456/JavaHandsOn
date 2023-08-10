package JavaPackage;

import java.util.Scanner;

public class OperatorUsingSwitch {

	public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("enter the fisrt number");
       int a= scanner.nextInt();
       System.out.println("enter the second number");
       int b = scanner.nextInt();
       System.out.println("enter the operator ");
       char op = scanner.next().charAt(0);

       switch (op) {
       case '+':
    	   System.out.println(a+b);
    	   break;
      case '-':
    	  System.out.println(a-b);
    	   break;

       case '*':
    	   System.out.println(a*b);
    	   break;

       case '/':
    	   System.out.println(a/b);
    	   break;

       case '%':
    	   System.out.println(a%b);
    	   break;

       default:
    	   System.err.print("unknown operator");
    	   break;
       }


       scanner.close();
	}

}
