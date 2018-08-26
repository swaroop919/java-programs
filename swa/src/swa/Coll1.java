package swa;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Coll1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="rama";
		String s2="rammana";
		String s3="ramesha";
		String s4="bheema";
		String s5="soma";
		String s6="mama";
		Collection c=new ArrayList();
		System.out.println(c.add(s1));
		System.out.println(c.add(s2));
		System.out.println(c.add(s3));
		System.out.println(c.add(s4));
		System.out.println(c.add(s5));
		System.out.println(c.add(s6));

		/*for(Object o:c)
		{
			if(o instanceof String)
			{
				String st=(String)o;
				if(st.contains("rama"))
					c.remove(st);
			}
		}*/
		
		Iterator it=c.iterator();
		while(it.hasNext())
		{
			Object o=it.next();
			
			if(o instanceof String)
			{
				String st=(String)o;
				if(st.contains("rama"))
				  it.remove();
			}
			
			
		}
		System.out.println(c);
		
		System.out.println();
		List l=new ArrayList<>();
		l.add(5);
		l.add(5);
		add(l);
	}
	public static   int add(List l) 
	{
		int s=0;
		for(Object o:l)
		{
			if(o instanceof Integer)
			{
				int i=(Integer)o;
				s=s+i;
			}
		}
		System.out.println(s);
		return s;
	}
}
