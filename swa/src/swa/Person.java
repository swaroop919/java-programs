package swa;

public class Person 
{
	String name;
	int height;

	public Person(String name, int height) 
	{
		super();
		this.name = name;
		this.height = height;
	}
	// TODO Auto-generated method stub
	public String toString()
	{
		return "person="+ name+" " +"height="+height;
	}


	public boolean equals(Object obj) {
		System.out.println("person->equals()");
		if(obj instanceof Person)
		{
			Person p1 = (Person) obj;
			if(this.name.equals(p1.name) && this.height == p1.height)
				return true;
			else
				return false;
		}
		else
			return false;
	}		
}


