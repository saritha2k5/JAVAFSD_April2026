package Day10;

import java.io.FileReader;
import java.io.IOException;

public class TC_CheckedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exception e1;
		try
		{
			FileReader file=new FileReader("test.txt");
		}catch(IOException e)
		{
			System.out.println("handled file error"+e.getMessage());
		}
	}

}
