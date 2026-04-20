package Day3;

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
		System.out.println("Dog barks");
	}
	
}



public class TC_Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Animal obj=new Dog(); //upcasting
if(obj instanceof Animal)
{
Dog d=(Dog)obj;

obj.sound();
//obj.bark();
d.sound();
d.bark();
}

	}

}
