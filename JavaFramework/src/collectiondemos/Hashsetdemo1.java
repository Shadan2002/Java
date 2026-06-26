package collectiondemos;
import java.util.*;
public class Hashsetdemo1 {

	public static void main(String[] args) {
		HashSet hs=new HashSet();//default capacity 16 load factor 0.75
		//HashSet hs=new HashSet(100);
		//HashSet hs=new HashSet(100,(float)0.90);
		//HashSet<Integer>hs=new HashSet<Integer>();
		
		//Add objects/element into hashset
		 
		hs.add("cheating");
		hs.add("plant");
		hs.add(1000);
		hs.add(false);
		System.out.println(hs);
		//remove
		hs.remove(1000);
		System.out.println(hs);
		//contains()
		
		System.out.println(hs.contains("welcome"));
		System.out.println(hs.isEmpty());
		//reading object/element from hashset using ..each loop
		/*for(Object e:hs) {
			System.out.println(hs);
		}*/
	
		Iterator it=hs.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}

}
