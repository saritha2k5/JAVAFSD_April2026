package Day1;

public class usestatic {
	
	static int num1=3;
	static int num2;
static {
	System.out.println("static block is initalized");
	num2=num1*4;
}

static void mymethod(int num3)
{
	System.out.println("num1:"+num1);
	System.out.println("num2:"+num2);
	System.out.println("num3:"+num3);
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mymethod(30);
	}

}
