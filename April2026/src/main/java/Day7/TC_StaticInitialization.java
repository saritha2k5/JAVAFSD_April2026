package Day7;


class Test
{
	static
	{
		System.out.println("Static block");
	}
	
	{
		System.out.println("instance block");
	}
	Test()
	{
		System.out.println("this is the constructor");
	}
}

public class TC_StaticInitialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Test ob1=new Test();
Test ob2=new Test();


		
	}

}
