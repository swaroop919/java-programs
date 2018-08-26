package swa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TestCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List l = new ArrayList();
		l.add("hrithvik");
		l.add("sffs");
		l.add("brachanzvi");
		l.add("rasa");
		l.add("moni");
		l.add("soni");System.out.println("before sorting l = "+l);
		Collections.sort(l);
		System.out.println("after sorting on n.o l = "+l);
		Strlencom c=new Strlencom();
		Collections.sort(l,c);
		System.out.println(l);
		Set ts=new TreeSet(c);
		ts.addAll(l);
		System.out.println(ts);



	}

}
