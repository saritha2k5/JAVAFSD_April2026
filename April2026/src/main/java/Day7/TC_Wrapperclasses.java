package Day7;

import java.util.ArrayList;
import java.util.List;

public class TC_Wrapperclasses {

	void printsquare(Integer x5)
	{
		
		if(x5 instanceof Integer)
		{
			System.out.println("x5 is an object");
		}
		Integer s6=x5*x5;
		if(s6 instanceof Integer);
		{
			
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TC_Wrapperclasses ob5=new TC_Wrapperclasses();
		
		Integer num5=5;
		
		System.out.println("Integer max value:"+Integer.MAX_VALUE);
		System.out.println("Integer minmum value:"+Integer.MIN_VALUE);
		if(num5 instanceof Integer)
		{
			System.out.println("It is an object");
		}
		ob5.printsquare(num5);//unboxing
		
		Integer a1=10;
		Integer a2=20;
		
		Integer sum=a1+a2;//unbox automatically
		
		
		Integer multi=sum*2;
		
		
		
		
		int x6=10;
		
		Integer ob=Integer.valueOf(x6);//boxing
		
		int z=ob.intValue();
		
		Integer y=30; //autoboxing  int to integer
		int y1=y;
		
		
		ArrayList<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(30);
		System.out.println(list);
		
		Integer obj=new Integer(10);
		Integer obj1=Integer.valueOf(10);
		Integer obj3=100; //autoboxing //int to integer
		int x=obj3;//unboxing integer-int
		
		int num=Integer.parseInt("1234");
		double dou=Double.parseDouble("10.6");
		String s=Integer.toString(2000);
		
		Integer a=100, b=30;
		System.out.println(a.compareTo(b));
		a=a+10;
		
		List<Integer> bookid=new ArrayList<>();
		bookid.add(101); //autoboxing
		bookid.add(200);
		
		
		for(Integer id: bookid)
		{
			int value=id;
			System.out.println(value);
			
		}
		
		
		
		Integer i=100;
		Double d=10.5;
		Character c='A';
		
		String s8=c.toString();
		
		System.out.println("wrapper ex"+i+d+c);
		
		

	}

}
