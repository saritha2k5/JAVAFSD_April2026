package Pac1;

public class TC_ControlStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int x=75;
		if(x>=90)
		{
			System.out.println("Grade A");
		}
		else if(x>=60)
		{

			System.out.println("Grade B");
		}
		
		else
		{
			System.out.println("Grade C");
		}
		
			
		
		int day=2;
				switch(day)
				{
				case 1: System.out.println("Monday"); break;
				case 2: System.out.println("TuesDay");break;
				case 3: System.out.println("Wednesday");break;
				default: System.out.println("Invalid");
				}
		
				
				for(int j=6;j>0;j--)
				{
					System.out.println(j);
				}
				
				int k=1;
				while(k<=5)
				{
					System.out.println(k);
					k++;
				}
				
				
				int l=1;
				do
				{
					System.out.println(l);
					l++;
				}while(l<=5);
				
				int[] a1= {10,20,30,40};
				
				for(int num:a1)
				{
					System.out.println(num);
				}
				
	
	}

}
