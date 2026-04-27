package Day6;

public class TC_SumArray {

	
	static int sum(int[] intarray) {
		int result=0;
		for(int index:intarray)
		{
			result+=index;
					
		}
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numbers= {10,20,30,50};
		
System.out.println(sum(numbers));

System.out.println(Integer.MAX_VALUE);
		
	}

}
