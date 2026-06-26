package collectiondemos;
import java.util.*;
import java.util.Hashtable;

public class HashtableDemo {

	public static void main(String[] args) {
		  // Hashtable t=new(intial capacity);create hashtable with some capacity
		//Hashtable t=new Hashtable(initial capacity,fill ratio/load factor);
			
	Hashtable t=new Hashtable();	//Capacity is 11,load factors 0.75
	t.put(101,"john");
	t.put(102,"ohm");
	t.put(103,"hn");
//	t.put(null, "t");
//	t.put(105, "null");
	System.out.println(t);
	System.out.println(t.get(103));
	t.remove(103);
	System.out.println(t);
	//check key is present or not
	System.out.println(t.containsKey(101));
	System.out.println(t.containsKey(103));
	//check value conatin or not
	System.out.println(t.containsValue("hn"));
	System.out.println(t.isEmpty());
	System.out.println(t.keySet());
	System.out.println(t.values());
//	For(int k:t.keySet())
//	{
//	System.out.println(k+"   "+t.get(k));
//	}
	//Entry  specific methods..
	for(Map.Entry entry:t.entrySet())
	{
		System.out.println(entry.getKey()+"  "+entry.getValues());
	}
	//iterator()
Set s=t.entrySet();//set mean collection of entry
Iterator itr=s.iterator();
while(itr.hasNext())
{
	Map.Entry entry=(Entry) itr.next();
	System.out.println(entry.getKey()+"   "+entry.getValue());
}
}}
