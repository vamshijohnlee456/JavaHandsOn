package JavaPackage;


public class Bank {
	   public int amount = 10000;
	 
	 public static void greeting() {
		 System.out.println("Hi welcome customer to banking");
	 }
	 
	 public  void currentBalance() {
		 System.out.println("current amount is =" + amount);
	 }
	 
	 public  void Deposit(int deposit) {
		 int amount1= amount+deposit;
			 System.out.println("deposited amount is =" + amount1);
	 }
	 public  static void updatedAmount(int amount) {
		System.out.println("amount is updated=" + amount );
	 }
	 
	

	 
	 public static void main(String[] args) {
		    greeting();
		    Bank bank = new Bank();
		    bank.currentBalance();
			bank.Deposit(10000);
			updatedAmount(10);
	 }
}


