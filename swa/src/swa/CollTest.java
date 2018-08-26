package swa;

import java.util.Collection;
import java.util.HashSet;
import java.util.TreeSet;

public class CollTest {

	public static void main(String[] args) {
		String s1="baba";
		String s2="ramanna";
		String s3="rameshwara";
		String s4="eshwara";
		String s5="someshwaraa";
		String s6="marra";
		// TODO Auto-generated method stub
		System.out.println("identity check = "+(s1==s2));
		System.out.println("equality = "+(s1.equals(s2)));
		System.out.println(s1.hashCode());
		//System.out.println(s2.hashCode());
		//System.out.println(s3.hashCode());
		//Collection col=new HashSet();
		Collection col=new TreeSet();
		System.out.println(col.add(s1));
		System.out.println(col.add(s2));
		System.out.println(col.add(s3));
		System.out.println(col.add(s4));
		System.out.println(col.add(s5));
		System.out.println(col.add(s6));
		//System.out.println(col);
		
		for( Object p:col)
		{			
		String s = (String) p;
		System.out.println(s);
		System.out.println(s.contains("rama"));
		}
		
		
	
	}
}
	
	

