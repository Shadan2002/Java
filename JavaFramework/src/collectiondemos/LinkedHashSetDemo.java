package collectiondemos;
import java.util.*;
public class LinkedHashSetDemo {

	public static void main(String[] args) {
		//LinkedHashSet <Integer> lset=new LinkedHashSet();

LinkedHashSet lset=new LinkedHashSet();
lset.add(100);
lset.add(200);
lset.add(300);
lset.add(300);
lset.add(400);
lset.add(100);
lset.add(200);
System.out.println(lset);

//No duplicate and in oder
	}

}
