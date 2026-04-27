package model;

import exception1.InsufficientBalanceException;

//inheritance and polimorphism


public class SavingsAccount extends Account{
	
private static final double MIN_BALANCE=500;

	public SavingsAccount(int accNo, String name, double balance)
	{
		super(accNo,name,balance);
	}
	
	//method overriding
	
	public void withdraw(double amount) throws InsufficientBalanceException
	{
		if(getBalance()-amount<MIN_BALANCE)
			
{
			throw new InsufficientBalanceException("Maintain minimum balance of 500");
}
			setBalance(getBalance()-amount);


	
	}
	
	
}
