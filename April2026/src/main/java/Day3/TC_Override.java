package Day3;


class parent1
{
	String color="white";
	
	 void show()
	{
		System.out.println("parent method");
	}
}

class child1 extends parent1
{
	String color="Black";
	@Override
	void show()
	{
		System.out.println("child method");
	
	}
	
	void display()
	{
		System.out.println("color from child:"+color);
		System.out.println("color from child:"+super.color);
		super.show();
		
	}
}

public class TC_Override {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		child1 p=new child1();
		
		p.display();
		
		
	}

}
