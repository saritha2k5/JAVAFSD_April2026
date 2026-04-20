package Day1;

interface MathConstants {
    int VALUE = 100;  // public static final


void sleep();
 static void sleep1() {
    System.out.println("Sleeping...");
}


}
class dog implements inter1
{

	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("Dog barks");
	}

	public void sound1() {
		// TODO Auto-generated method stub
		System.out.println("Dog barks1");
	}
}
public class tc1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dog obj=new dog();
		obj.sound();
		
		System.out.println(MathConstants.VALUE);
		
	}

}
