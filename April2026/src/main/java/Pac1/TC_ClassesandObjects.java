package Pac1;

class Box
{
	double w=30;
	double h=40;
	double d=50;
	
	double calvolume()
	{
		return w*h*d;
		
	}
}


public class TC_ClassesandObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Box obj=new Box();
		System.out.println(obj.w);
		System.out.println(obj.calvolume());
		
	}

}
