package Day4;

public class TC_Generic {
	
	public static <T> T getvalue(T value)
	{
		return value;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=getvalue(10);
		String text=getvalue("Hello");
		
		System.out.println("int value:"+num);
		System.out.println("string value:"+text);

	}

}
