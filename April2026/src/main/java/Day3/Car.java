package Day3;

public class Car {
	
	int noofcylinders;
	int noofvolves;
	int enginepower;
	boolean ispowersteering;
	
	
	Car()
	{
		noofcylinders=3;
		noofvolves=4;
		enginepower=48;
		ispowersteering=false;
		
	}
	
	Car(boolean powersteering)
	{
		this();
		this.ispowersteering=powersteering;
	
		
	}
	
	Car(int  noofcylinders, int noofvolves, int enginepower)
	{
		this.noofcylinders=noofcylinders;
		this.noofvolves=noofvolves;
		this.enginepower=enginepower;
	
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Car obj=new Car(40,40,40);
		
	}

}
