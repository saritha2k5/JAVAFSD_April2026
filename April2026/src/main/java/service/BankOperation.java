package service;

//interface

public interface BankOperation {
	
	void deposite(int accNo,double amount);
	void withdraw(int accNo,double amount);
	void checkbalance(int accNo);
	
	

}
