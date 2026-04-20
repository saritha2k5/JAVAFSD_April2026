package Day1;

import java.io.Serializable;

public class TC_JavaBeans implements Serializable{
	
	//private variable
	
	private int id;
	private String name;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public TC_JavaBeans()
	{
		
	}

}
