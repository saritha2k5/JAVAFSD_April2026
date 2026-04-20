package Day2;

class Animal
{
	void sound()
	{
		System.out.println("Animal sound");
	}
}

class Dog extends Animal
{
	void bark()
	{
		System.out.println("Dogs sound");
	}
}

public class TC_TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal a=new Dog();//upcasting
		Dog d=(Dog)a;//downcasting
		a.sound();
		
		d.sound();
		d.bark();

	
		
	}

}
