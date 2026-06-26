package collectiondemos;

import java.util.Collections;
import java.util.LinkedList;

public class Linkedlistdemo2 {

	public static void main(String[] args) {

LinkedList l=new LinkedList();
l.add("x");
l.add("y");
l.add("z");
l.add("a");
l.add("b");
l.add("c");
LinkedList new_l=new LinkedList();
new_l.addAll(l);
System.out.println(new_l);
		
		new_l.removeAll(l);
		System.out.println(new_l);//[]
//sort() collection.sort(collection)
		System.out.println("before sorting"+l);
		Collections.sort(l);
		System.out.println("after sorting"+l);
		//reverse oder
		Collections.sort(l,Collections.reverseOrder());
		System.out.println("Reverse oder"+l);
		
	//shuffling 
		Collections.shuffle(l);
		System.out.println("After shuffling:"+l);
		
	}

}
