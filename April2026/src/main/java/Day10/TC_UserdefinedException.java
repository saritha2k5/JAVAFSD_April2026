package Day10;

class InvalidAgeException extends Exception
{
	public InvalidAgeException(String message)
	{
		super(message);
	}
}

public class TC_UserdefinedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age=16;
		try
		{
			if(age<18)
			{
				throw new InvalidAgeException("Age must be 18");
			}
		} catch(InvalidAgeException e)
		{
			System.out.println(e.getMessage());
		}

	}

}
