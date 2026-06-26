package collectiondemos;
import java.util.*;
public class Hashmapdemo {

	public static void main(String[] args) {
		//HashMap<Integer,String>m=new HashMap<Integer,String>();
		HashMap m=new HashMap();
	m.put(101, "shadan");
	m.put(102, "asad");
	m.put(103, "ahmad");
	m.put(104, "raju");
	m.put(105, "raju");
	System.out.println(m);
System.out.println(	m.get(105));
m.remove(103);
System.out.println(m);//remove pair from hashmap

System.out.println(m.containsKey(101));
System.out.println(m.containsValue("Mary"));		
System.out.println(m.isEmpty());
//retrive only key
System.out.println(m.keySet());//return aall the keys as set
for(Object i:m.keySet())
{
	System.out.println(i);
}
System.out.println(m.values());
for(Object i:m.values())
{
	System.out.println(m.keySet());
}

//System.out.println(m.values());//return aall the values as collection
//System.out.println(m.entrySet());//return all the entries as set

//Entry methods
//**********
for(Object r:m.entrySet())
{
	System.out.println(r);
}

	}

}
