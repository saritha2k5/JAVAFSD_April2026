package Day2;



interface printer<T>
{
	void print(T data);
	
	
	static void add()
	{
		;
	
	}
}
/*

interface inter2
{
	void display4();
	default void display5() {}

}
interface inter3
{
	void display5();
}
public interface TC_inter extends inter3  {
	
	void display5();
	
	default void display3()
	{
		System.out.println("this is default method from interface");
	}
	
	static void display1()
	{
		System.out.println("this is static method from interface");
	}
	
	void display2();
	
	int minbalance=100;

}
*/
