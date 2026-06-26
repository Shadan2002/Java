package collectiondemos;

import java.util.*;

public class LinkedListDemo3 {

	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.add("cow");
		l.add("dog");
		l.add("cow");
		l.add("billi");
		System.out.println(l);
		l.addFirst("tiger");
		l.addLast("elephant");
		System.out.println(l);
		System.out.println(l.getFirst());
		System.out.println(l.getLast());
		//remove last and firt
		l.removeFirst();
		l.removeLast();
		System.out.println(l);
	}

}
