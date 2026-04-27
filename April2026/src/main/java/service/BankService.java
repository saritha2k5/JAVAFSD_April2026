package service;

import exception1.AccountNotFoundException;
import exception1.InvalidAmountExeption;
import model.Account;

public class BankService implements BankOperation{

	private static final double MIN_BALANCE=500;
   private Account[] accounts=new Account[5];	
	private int count=0;
	
	
	public void addAccount(Account acc)
	{
		if(count<accounts.length)
		{
			accounts[count++]=acc;
		}
		else
		{
			System.out.println("Bank storage is full");
		}
	}
	
	private Account findAccount(int accNo) throws AccountNotFoundException
	{
		for(int i=0;i<count;i++)
		{
			if(accounts[i].getAccNo()==accNo) {
				return accounts[i];
			}
		}
		throw new AccountNotFoundException("Account not found");
		
	}
	
	@Override
	public void deposite(int accNo, double amount) {
		// TODO Auto-generated method stub
		try
		{
			if(amount<0)
			{
				throw new InvalidAmountExeption("Invalid deposite amount");
			}
		
	for(int i=0;i<count;i++)
		{
			if(accounts[i].getAccNo()==accNo) {

		accounts[i].setBalance(accounts[i].getBalance()+amount);
		System.out.println("Amount Deposited successfully");
		
	}
		}
		}
		catch(Exception e)
		{
			System.out.println("InvalidAmountExeption"+e.getMessage());
		}

	}
	@Override
	public void withdraw(int accNo,double amount) {
		// TODO Auto-generated method stub
		
		try
		{
			if(amount<0)
			{
				throw new InvalidAmountExeption("Invalid withdraw amount");
			}
		
		for(int i=0;i<count;i++)
		{
			if(accounts[i].getAccNo()==accNo) {
				if(accounts[i].getBalance()>=MIN_BALANCE)
				{
		
		accounts[i].setBalance(accounts[i].getBalance()-amount);
		System.out.println("Withdrwa successfull");
		
	}
							else
				{
					System.out.println("Minimum balance of"+MIN_BALANCE +  "must be maintained");
				}
			
		
			}
		}
		}
			catch(Exception e)
			{
				System.out.println("InvalidAmountExeption"+e.getMessage());
			}
	
	}
	
	@Override
	public void checkbalance(int accNo) {
		// TODO Auto-generated method stub
		if(count==0)
		{
			System.out.println("No Accounts available");
		}
		else
		{
			for(int i=0;i<count;i++)
			{
				if(accNo==accounts[i].getAccNo())
				{
				System.out.println(
						accounts[i].getAccNo()+"    "+
								accounts[i].getName()+"    "	+
								accounts[i].getBalance()+"    "	
						
						);
		
			}
			}
		}
	}
	
	
	public void displayAccounts()
	{
		for(int i=0;i<count;i++)
		{
			System.out.println(
					accounts[i].getAccNo()+"    "+
							accounts[i].getName()+"    "	+
							accounts[i].getBalance()+"    "	
					
					);
			
			
		}
	}
	

}
