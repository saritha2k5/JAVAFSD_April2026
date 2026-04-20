package Day3;

class Base

{
	
	String name="Animal";

	void basemethod()
	{
		System.out.println("Base Method from parent");
		
	}
}


class Child extends Base
{
	String name="Cat";
	
	void basemethod()
	{
		System.out.println("Base Method from child");
		
	}
	
	void childmethod()
	{
		System.out.println("Child Method");
		System.out.println("name from child:"+name);
		System.out.println("name from parent:"+super.name);
		super.basemethod();
		basemethod();
	}
}


public class TC_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Child obj=new Child();
		obj.childmethod();
		
		
		
		
		
		
	}

}
