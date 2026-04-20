package Day1;

public class T_Variables {
	
	
	int id=30;
	static String collage="abc";
	
	void display()
	{
		int x=10;
		System.out.println("value od x inside method:"+x);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		
		
		T_Variables obj =new T_Variables();
		
		
		
		System.out.println("instance varible:id value:"+obj.id);
		System.out.println("Static variable:"+obj.collage);	
		obj.display();
		
		
		
	}

}
