package Day5;

 abstract class animal
{
	 int age;
	 
	 animal(int age){
		 
		 this.age=age;
		 System.out.println("animal constructor");
		 System.out.println();
	 };
	 
	 
	abstract void sound();
	
	
	void sleep()
	{
		System.out.println("sleeping");
	}
	
}

 

class dog extends animal
{


	dog(int age) {
		super(age);//calling abstract class contructor
		
		// TODO Auto-generated constructor stub
	}

	void sound() {
		// TODO Auto-generated method stub
		
		System.out.println("sound..");
		
	}
	
}




public class TC_Abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		animal a=new dog(5);
		a.sound();
		a.sleep();
	}

}
