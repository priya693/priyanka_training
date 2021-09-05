package assgn4;

import java.util.Scanner;

public class exceptionhandling3 {

	public static void main(String[] args) {
		SavingAccount s=new SavingAccount();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter balance :");
		double balance=sc.nextDouble();
		s.setBalance(balance);
		s.id=700000001;
		System.out.println("Enter the amount");
		
		double amount=sc.nextDouble();
		try {
			System.out.println("successfully withdrawn "+s.withdraw(amount)+"amount");
			System.out.println("Remaining balance"+(s.balance));
		} catch (Exception e) {
			
			System.out.println(e);
		}
		

	}
	
	static class SavingAccount{
		long id;
		double balance;
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id=id;
		}
		public double getBalance() {
			return balance;
		}
		public void setBalance(double balance) {
			this.balance=balance;
		}
		
		double withdraw(double amount) throws InsufficientBalanceException, illegalBankTransactionException
		{
			if(amount<0)
			{
				System.out.println("Negative Value");
				throw new illegalBankTransactionException();
			}
			if(amount>balance || balance==0) 
			{
				System.out.println("Insufficient Balance");
                throw new InsufficientBalanceException();
		}
		
		this.balance=this.balance-amount;
		
		return amount;
	}

}
static class illegalBankTransactionException extends Exception {
	private static final long serialVersionUID = 1L;
}

static class InsufficientBalanceException extends Exception {
	private static final long serialVersionUID = 1L;
}

}
