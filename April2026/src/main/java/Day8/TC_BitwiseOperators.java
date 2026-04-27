package Day8;

public class TC_BitwiseOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//&
		int num=5;
		
		if((num & 1)==0)
		{
			System.out.println("even");
		}
		else
			System.out.println("odd");

		
		//|
		
		int permissions=0;
		System.out.println("initial permision");
		permissions=permissions|1;
		System.out.println("after enabling the feature 1:"+permissions);
		permissions=permissions|2;
		System.out.println("after enabling the feature 2:"+permissions);
		
		
		
		//bitwise exclusive or ^
		
		int a=10;
		int b=30;
		
		int result=a^b;
		
		
		System.out.println(result);
		//10   	01010
		//30  ^ 11110
			//	10100  =20;
				
		
		//SHIFT RIGHT
		
		//>>1  divide by 2
		
		//>>2  divide by 4
		
		int s1=10;
		int ps1=2;
		int r1=s1>>>ps1;
		
		System.out.println("reult:"+r1);
		
		System.out.println("binary of original number:"+Integer.toBinaryString(s1));
		System.out.println("binary after right shift:"+Integer.toBinaryString(r1));
		
		//left shift
		
		//&=
		
		int d1=20;
		int d2=10;
		System.out.println("d1 binary:"+Integer.toBinaryString(d1));
		d1 |=d2;
		System.out.println("d1 &=d2:"+d1);
		
		System.out.println("d1 binary:"+Integer.toBinaryString(d1));
		System.out.println("d2 binary:"+Integer.toBinaryString(d2));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
