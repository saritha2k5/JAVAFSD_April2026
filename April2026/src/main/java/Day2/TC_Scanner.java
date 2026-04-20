package Day2;

import java.util.Scanner;

public class TC_Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter any number");
int num=sc.nextInt();

if(num%2==0)
{
	System.out.println("You entered the even number");
}
else
{
	System.out.println("You entered the odd number");
}
	
	}

}
