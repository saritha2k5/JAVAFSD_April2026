package Day2;


enum Day{
	Monday,Tuesday,Wenesday,Thursday,Friday,Saturday,Sunday
}

public class TC_Enum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Day d=Day.Monday;

switch(d) {
case Monday:
	System.out.println("start Day of the week");
	break;
case Sunday:
	
	System.out.println("last Day of the week");
}
		
		
	}

}
