package Day4;

interface Engine2
{
	void start();
	
}


class PetrolEngine implements Engine2
{
	

	
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("pertol engine started");
	}

}

class car2
{
	Engine2 e;
	car2(Engine2 e)
	{
		this.e=e;
	}
	
	void driver()
	{
		e.start();
		
	}
}

public class Engine1 {

}
