package Day4;

public class Engine {

	void start()
	{
		System.out.println("Engine Started");
	}
	
	
	
}

class car
{
	Engine e=new Engine();
	
	void drive()
	{
		e.start();
		
	}
}