package Day7;

class demo
{ int x;
	//instance initialization block
	{
		System.out.println("instance block executed");
		x=10;
		
	}
	
	demo(){
		System.out.println("Constructor is executed");
		
	}
	
	void dispaly()
	{
		System.out.println("this is the method");
	}
}

public class TC_Initialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		demo d1= new demo();
		demo d2=new demo();
		d1.dispaly();
		
		
		
		
	}

}
