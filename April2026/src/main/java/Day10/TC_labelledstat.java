package Day10;

public class TC_labelledstat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		outterloop:
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				
			
			if(i==1 && j==1)
			{
				break outterloop;//exit the loop
			}
			
			System.out.println(i+""+j);
		}
		
	}

}
}
