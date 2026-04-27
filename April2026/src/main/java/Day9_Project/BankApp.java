package Day9_Project;

import model.Account;
import service.BankService;
import util.Transactionutil;

public class BankApp {
	
	static
	{
		System.out.println("Bank Application Started");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
BankService service=new BankService();

Account a1=new Account(101,"ram",1000);
Account a2=new Account(102,"sam",2000);


service.addAccount(a1);
service.addAccount(a2);

service.displayAccounts();

service.deposite(102, -88888);
/*
double amount=500;

if(Transactionutil.isvaliamount(amount))
{
	service.deposite(102, amount);
}
*/
service.checkbalance(102);
	}
	

}
