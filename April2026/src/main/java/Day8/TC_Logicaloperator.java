package Day8;

public class TC_Logicaloperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age=25;
		int salary=30000;
		
		boolean a=true;
		System.out.println(!a);
		
		if((age==40) && (salary>60000))
		{
			System.out.println("eligible");
		}
		
		else
		{
			System.out.println("not eligible");
		}
		
		int num1=8;
		String result1=(num1%2==0)? "Even":"odd";//condition?true:false
	}

}
