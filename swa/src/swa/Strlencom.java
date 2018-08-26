package swa;

import java.util.Comparator;

public class Strlencom implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		if(o1 instanceof String && o2 instanceof String)
		{
			String s1 = (String) o1;
			String s2 = (String) o2;
			
			return s1.length() - s2.length();
			
		}
		else
			throw new IllegalArgumentException("only strings can be compared!");
		
	}
	
		
	}
