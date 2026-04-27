package model;

import exception1.InsufficientBalanceException;

public class CurrentAccount extends Account {
	
	private static final double OVERDRAFT_LIMIT=1000;
	
	public CurrentAccount(int accNo, String name, double balance)
	{
		super(accNo,name,balance);
	}

	public void withdraw(double amount) throws InsufficientBalanceException
	{
		if(getBalance()+OVERDRAFT_LIMIT<amount)
		{
			throw new InsufficientBalanceException("overdraft limit exceeded");
		}
	setBalance(getBalance()-amount);
}
}