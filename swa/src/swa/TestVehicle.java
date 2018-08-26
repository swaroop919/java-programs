package swa;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

import com.sun.javafx.collections.MappingChange.Map;

public class TestVehicle {
	public static void main(String[] args)
	{
Vehicle v1=new Vehicle("suzuki", 100);
System.out.println(v1);
Vehicle v2=new Vehicle("suzuki", 100);
//Vehicle v3=new Vehicle("suzuki", 100);
///System.out.println(v1.equals(v2));
@SuppressWarnings("rawtypes")
HashMap coll=new HashMap();



System.out.println(coll.put(v1,"test1"));
System.out.println(coll.put(v2,"test2"));
//System.out.println(a.contains(v2));
HashSet coll1=new HashSet();
System.out.println(coll1.add(v1));
System.out.println(coll1.add(v2));
System.out.println(coll.put(v1,""));


}
}
