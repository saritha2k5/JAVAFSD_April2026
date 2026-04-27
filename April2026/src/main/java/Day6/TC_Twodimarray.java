package Day6;

public class TC_Twodimarray {
	
	public static void main(String[] args) {
	
		
		int arr[][]= {{2,3},{4,5},{30,60}};
		
		int td[][]=new int[1][3];
		
		td[0][0]=1000;
		td[0][1]=10001;
		td[0][2]=5000;
		
		
		for(int i=0;i<td.length;i++)
			
		{
			
			for(int j=0;j<td[i].length;j++)
			{
				
			
		System.out.println(td[i][j]);
			}
	}

}
}
