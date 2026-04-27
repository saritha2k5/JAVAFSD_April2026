package model;

//Encapsulation+Java Bean

public class Account {

	private int accNo;
	private String name;
	private double balance;
	
	//default constructor
	
	public Account()
	{
		
	}
	
	
	//paramerterized constructor
	
	public Account(int accNo, String name, double balance)
	
	{
		this.accNo=accNo;
		this.name=name;
		this.balance=balance;
		
	}

public void withdraw(double amount) throws Exception
{
	if(balance<amount)
	{
		throw new Exception("Insufficient Balance") ;
		
	}
	balance-=amount;
}
	
	public int getAccNo() {
		return accNo;
	}


	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	
	
}
