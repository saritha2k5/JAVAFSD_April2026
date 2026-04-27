package Day10;

public class TC_TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Exception e1;

		try
		{
			int[] arr=new int[3];
			arr[5]=10;
			int result=10/0;//never excute
			
	
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("Hello");
		
	}

}
