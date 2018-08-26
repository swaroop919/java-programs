package swa;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Equality {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = new String("Ebenezer");
		String s2 = new String("Ebenezer");

		System.out.println("s1 == s2 ? "+(s1==s2));
		System.out.println("s1.equals(s2) ? "+s1.equals(s2));

		Actor a1 = new Actor("Aathiya",0);
		Actor a2 = new Actor("Aathiya1",0);

		System.out.println("a1 == a2 ? "+(a1==a2));
		System.out.println("a1.equals(a2) ? "+a1.equals(a2));

		List actors = new ArrayList();
		actors.add(a1);
		System.out.println("does a2 exist in col ? "+actors.contains(a2));

		Address homea1 = new Address("no.420","OO Road","Bengaluru","000000");
		Address homea2 = new Address("no.420",new String("OO Road"),"Bengaluru","000000");

		System.out.println("homea1.eq(homea2) ? "+homea1.equals(homea2));

		Date dt1 = new Date();
		Date dt2 = new Date();

		System.out.println("dt1 = "+dt1);
		System.out.println("dt2 = "+dt2);

		Employee e1 = new Employee("ramappa",dt1);
		Employee e2 = new Employee("ramappa",dt2);
		e1.setHomeAdress(homea1);
		e2.setHomeAdress(homea2);

		e1.setOfficeAddress(new Address("No.10","Outer Ring Rd","Bengaluru","5600099"));
		e2.setOfficeAddress(new Address("No.10","Outer Ring Rd","Bengaluru","5600099"));

		System.out.println("e1.eq(e2) ? "+e1.equals(e2));
	}








}


