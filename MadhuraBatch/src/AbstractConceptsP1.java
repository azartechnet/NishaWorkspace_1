abstract class BankAccount
{
	abstract void deposit(double amount);
	abstract void withdraw(double amount);

	
}
class SavingAccount extends BankAccount
{
	double balance=1000;
	void deposit(double amount)
	{
		balance+=amount;
		System.out.println("Deposited in saving::"+amount+"Your balance::"+balance);
	}
	void withdraw(double amount)
	{
		balance-=amount;
		System.out.println("Withdraw from saving::"+amount);
	}
}
class CurrentAccount extends BankAccount
{
	double balance=5000;
	void deposit(double amount)
	{
		balance+=amount;
		System.out.println("Deposite in Current::"+amount+"Your balance is::"+balance);
	}
	void withdraw(double amount)
	{
		balance-=amount;
		System.out.println("Withdraw from current::"+amount);
	}
}
public class AbstractConceptsP1 {

	public static void main(String[] args) {
		
		SavingAccount s1=new SavingAccount();
		s1.deposit(90000);
		s1.withdraw(20000);
		
		
		CurrentAccount c1=new CurrentAccount();
		c1.deposit(40000);
		c1.withdraw(20000);
		
//		c1.showBalance(20000);

	}

}
