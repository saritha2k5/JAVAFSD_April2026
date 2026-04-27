package Day8;

public class TC_Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int a=10+5;
		
		
		//assignment operators =, +=, -=,/=,%=
		
		int x=10;
		int y=5;
		
		System.out.println(x^y);
		
		int a[]= {2,3,5,2,6,7,2,6};
		int result=0;
		for(int num:a)
		{
			result ^=num;
		}
		System.out.println("unique numbers:"+result);
		
		
		
		boolean isformvalid=false;
		
		if(!isformvalid)
		{
			System.out.println("formvalid");
		}
		
		if(9==9)
		{System.out.println("equal");
			
		}
		
		
		int num1=8;
		String result1=(num1%2==0)? "Even":"odd";//condition?true:false
		System.out.println(result1);
		
		
	}
}
//^0101
//1111=15