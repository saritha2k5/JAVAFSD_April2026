package util;

public class Transactionutil {
	
	public static double calculateinterest(double balance)
	{
		return balance*0.05;
	}
	

	public static boolean isvaliamount(double amount)
	{
		return amount>0;
	}
	
}
