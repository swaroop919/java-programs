package swa;

import java.util.ArrayList;

public class TestPer {
	
	public static void main(String[] args)
	{
		Person p1 =new Person("Ramu",20);
		Person p2=new Person("Ramu",20);
		
		ArrayList a=new ArrayList();
		
		System.out.println("identity check = "+(p1==p2));
		System.out.println("equality = "+(p1.equals(p2)));
		System.out.println(p1);

	}
	
	
	

}
