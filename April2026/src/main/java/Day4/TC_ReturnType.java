package Day4;

public class TC_ReturnType {
	
	int getnumber(int a,int b) //primitive return
	{
		
		
		return a+b;
		
	}
	
	String gettext()
	{
		return "hello";
		
	}
	
	
	int[] getarray()
	{
		return new int[] {1,2,3,45};
		
	}
	
	double cal()
	{
		return 2.7;
		
	}
	
	void showmessage()
	{
		System.out.println("no return value");
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TC_ReturnType obj=new TC_ReturnType();
		System.out.println(obj.getnumber(10,40));

		System.out.println(obj.gettext());
		System.out.println(obj.getarray());
		System.out.println(obj.cal());
		//System.out.println(obj.showmessage());
		obj.showmessage();
		
	}

}
