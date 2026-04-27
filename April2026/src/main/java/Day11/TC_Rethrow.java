package Day11;

public class TC_Rethrow {
	
	static void check() 
	{
		try
		{
			int a=10/0;
			
		}catch(ArithmeticException e)
		{
			System.out.println("ArithmeticException caught in this method");
			
			throw e;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//check() ;
		//System.out.println("hello");
	try
		{
			check() ;
		}catch(ArithmeticException e)
		{
			System.out.println("Handled again in main");
		} 
		System.out.println("hello");
	}

}
