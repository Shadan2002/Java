package collectiondemos;
import java.util.*;
public class Arraylistdemo2 {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("x");
		al.add("y");
		al.add("z");
		al.add("a");
		al.add("b");
		ArrayList al_dup=new ArrayList();
		al_dup.addAll(al);
		System.out.println(al_dup);
		al_dup.removeAll(al);
		System.out.println("After removing:"+al_dup);
		
//sort-- Collection.sort()
System.out.println("Elements in the array list:"+al);
		Collections.sort(al);
		System.out.println(al);
		Collections.sort(al,Collections.reverseOrder());
	System.out.println("Element in the array in reverse order:"+al);	
	//Shuffling -Collections.shuffle()
	Collections.shuffle(al);
	System.out.println("Element in the array list after shuffling"+al);
	}

}
