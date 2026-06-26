package collectiondemos;

import java.util.HashSet;

public class HashsetDemo3 {

	public static void main(String[] args) {
		//Union ,intersection,diffrence
		HashSet<Integer>set1=new HashSet<Integer>();
	set1.add(1);
	set1.add(2);
	set1.add(3);
	set1.add(4);
	System.out.println("Hashset1"+set1);
	HashSet<Integer>set2=new HashSet<Integer>();
	set2.add(6);
	set2.add(3);
	set2.add(5);
	set2.add(9);
	set2.add(7);
//	System.out.println("Hashset2"+set2);
	//union
//set1.addAll(set2);
//System.out.println("union:"+set1);

//intersection//common element
//set1.retainAll(set2);
//System.out.println("Interrsection:"+set1);

//difference
//set1.removeAll(set2);
//System.out.println("diffrence"+set1);
//subset
System.out.println(set1.containsAll(set2));
System.out.println("subset:"+set1);
	}

}
