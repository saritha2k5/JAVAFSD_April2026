package Pac1;

public class TC_Contructor {
	int id;
	String name;
	
	TC_Contructor(int a,String b)

	{
		this.id=a;
		this.name=b;
		
	}
	TC_Contructor(int c)
	{
		this.id=c;
		this.name="leena";
	}
	TC_Contructor()
	{
		id=1;
		name="pooja";
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TC_Contructor obj=new TC_Contructor(200,"kavya");
System.out.println("id:"+obj.id);
System.out.println("name:"+obj.name);
	}

}
