package Day11;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TC_ExceptionDeclaration {

	static void readfile() throws FileNotFoundException,IOException
	{
		FileReader file=new FileReader("test.txt");
		
		
	}
	
	public static void main(String[] args)   {
		// TODO Auto-generated method stub
try
{
	readfile();
	
}catch(FileNotFoundException e)
{
	System.out.println("FileNotFoundException Exception is handled:"+e.getMessage());
}

catch(IOException e)
{
	System.out.println("IOException  is handled:"+e.getMessage());
}
		
	}

}
