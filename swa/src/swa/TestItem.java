package swa;

import java.util.ArrayList;
import java.util.Collection;

public class TestItem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Item it1 = new Item("pen",60);
		Item it2 = new Item("pen",60);
		System.out.println("it1==it2 > "+(it1==it2));
		System.out.println("it1.equals(it2) - "+it1.equals(it2));

		System.out.println("it1 = "+it1);

		Collection list = new ArrayList();
		list.add(it1);
		System.out.println("is it2 present in col = "+list.contains(it2));
		System.out.println(list);
		list.remove(it1);
		System.out.println(list);

	}




}


