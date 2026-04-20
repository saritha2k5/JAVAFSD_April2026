package Day3;

class BankAccount
{
	private double balance;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	public void deposite(double amount)
	{
		balance+=amount;
	}
}

public class TC_Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount b=new BankAccount();
		b.setBalance(1000);
		b.deposite(3000);
		System.out.println(b.getBalance());
	}

}
