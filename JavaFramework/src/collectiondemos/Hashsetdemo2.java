package collectiondemos;

import java.util.HashSet;

public class Hashsetdemo2 {

	public static void main(String[] args) {
	HashSet<Integer> evenNumber=new HashSet<Integer>();
	evenNumber.add(2);
	evenNumber.add(4);
	evenNumber.add(6);
System.out.println(evenNumber);
HashSet<Integer>numbers=new HashSet();
numbers.addAll(evenNumber);
numbers.add(88);
System.out.println(numbers);
//removeALl()
numbers.removeAll(evenNumber);
System.out.println(numbers);

	}

}
