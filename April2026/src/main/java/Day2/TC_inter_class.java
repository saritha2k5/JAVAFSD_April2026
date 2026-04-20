package Day2;

class c1 implements printer<String>
{

	public void print(String data) {
		// TODO Auto-generated method stub
		System.out.println("String:"+data);
	}

	
}


class c2 implements printer<Integer>
{

	public void print(Integer data) {
		// TODO Auto-generated method stub
		System.out.println("Integer:"+data);
	}



	
}


public class TC_inter_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		c2 obj=new c2();
		obj.print(100);
		c1 obj1=new c1();
		obj1.print("hi");
	}

}


