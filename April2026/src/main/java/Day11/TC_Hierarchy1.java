package Day11;

public class TC_Hierarchy1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		
		{
			int a=10/0;
			int arr[]=new int[2];
			arr[5]=10;
		}
		
		catch(ArrayIndexOutOfBoundsException e)//handles all the runtime exceptions
		{
			System.out.println("handled ArrayIndexOutOfBoundsException exception:"+e.getMessage());
		}
			
		
		
		catch(RuntimeException e)//handles all the runtime exceptions
		{
			System.out.println("handled run time exception:"+e.getMessage());
		}
		
		catch(Exception e)//
		{
			System.out.println("handled all exception:"+e.getMessage());
		}
		
}
	}


