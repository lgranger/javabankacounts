package bank;

public class Transactions {

	public static void main(String[] args) {
		Checking myChecking = new Checking();
		System.out.println(myChecking.id);
		System.out.println(myChecking.balance);
		System.out.println(myChecking.Withdraw(7));
		System.out.println(myChecking.Deposit(10));
		System.out.println(myChecking.balance);
		

		Checking yourChecking = new Checking();
		System.out.println(yourChecking.id);
		System.out.println(yourChecking.balance);
		System.out.println(yourChecking.Withdraw(9));
		System.out.println(yourChecking.Deposit(10));
		System.out.println(yourChecking.balance);
		
	}

}
