package Day10;

public class TC_Excpetion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
		int a=10/0;//arithmeticexception
		}
		catch(ArithmeticException e)
		{
			System.out.println("cannot divide by zero");
		}
		
		finally
		{
			System.out.println("finally block must be executed");
		}
		//System.out.println(a);
		System.out.println("Hello");
		try
		{
		String str=null;
		str.equals("Hello");
		}
		catch(NullPointerException e)
		{
			System.out.println("str is null");
		}
		
			System.out.println("after null pointer exception");
		
		
	}

}
