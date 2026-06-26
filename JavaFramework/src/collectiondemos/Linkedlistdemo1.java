package collectiondemos;
import java.util.*;
public class Linkedlistdemo1 {

	public static void main(String[] args) {
		//Declare Linked List
//LinkedList <Integer> l=new LinkedList<Integer>();
		
		
	LinkedList l=new LinkedList();
	//Add element into linked list
	l.add(100);
	l.add("welecome");
	l.add(10.4);	
	l.add(true);
	
	System.out.println(l);
	System.out.println(l.size());
	//remove
	l.remove(1);//index
	System.out.println("after removing "+l);
	
	//insert //adding element in the middle of linked list
	l.add(1,"raju");
	System.out.println(l);
	//retriving value/object
	System.out.println(l.get(3));
	//change the value
	l.set(0, "l01");
	System.out.println("after changing value"+ l);
	
	//contain ()//search
	System.out.println(l.contains("java"));
	System.out.println(l.contains("raju"));
	//isEmpty()
System.out.println(l.isEmpty());//false
////reading element from ll using for loop
/*for(int i=0;i<l.size();i++) {
	System.out.println("data present in LL: "+l.get(i));
}*/
//reading elemnt from ll using for ..each loop
//for(Object e:l) {
//	System.out.println(e);
//}

//Iterator () method
Iterator it=l.iterator();
while(it.hasNext()) {
	System.out.println(it.next());
}



	}

}
