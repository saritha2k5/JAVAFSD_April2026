package Day11;

public class TC_ExceptionHierarchy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
			int a=10/0;//arithmetic 
						
		}catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Excption caught"+e.getMessage());
		}
		catch(RuntimeException e)
		{
			System.out.println("RunException Caught:"+e.getMessage());
		}
		catch(Exception e)
		{
			System.out.println("General Exception Caught:"+e.getMessage());
		}
		
	}

}
