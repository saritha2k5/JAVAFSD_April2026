package Day1;

import java.util.Date;
import java.util.Scanner;
import static java.lang.Math.*;


public class TC_Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age");
		int age=sc.nextInt();
		
		System.out.println("Your age is:"+age);
		Date d=new Date();
		System.out.println("Date:"+d);
		
		System.out.println(sqrt(9));
	}

}
