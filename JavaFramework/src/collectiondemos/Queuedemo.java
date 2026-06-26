package collectiondemos;
import java.util.*;
	
public class Queuedemo {

	public static void main(String[] args) {
		PriorityQueue q=new PriorityQueue();
		//Adding element add() offer()
	q.add("A");
	q.add("b");
	q.add("C");
	q.offer("D");
	//System.out.println(q);//insertion oder preserved &duplicate allowed
	//get head element element()	peek()
//	System.out.println(q.element());//header element
//	System.out.println(q.peek());
	//return and remove  element from queue	--remove() poll()
//	System.out.println(q.remove());
//	System.out.println(q);
//System.out.println(q.poll());
//System.out.println(q);
	/*Iterator itr=q.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
		
	}*/
	for(Object ele:q)
	{
		System.out.println(ele);
	}
	}

}
