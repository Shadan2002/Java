package collectiondemos;
import java.util.ArrayList;
public class Arraylistdemo1 {

	public static void main(String[] args) {
	//Declare ArrayList
		//ArrayList al=new ArrayList(); 
	//ArrayList<Integer> al=new ArrayList<Integer>();	
		//ArrayList<String> al=new ArrayList<String>();
//	List al=new ArrayList();
		ArrayList al=new ArrayList();
		//add new element 
		al.add(100);
		al.add("Welecome");
		al.add(15.4);
		al.add(true);
		System.out.println(al);//[100, Welecome, 15.4, true]
		System.out.println("Number of element in array "+al.size());
	//remove
		al.remove(1);//index
		//al.remove("welcome");//here welecome is element
	System.out.println(al);
	//add element in between
al.add(1,"raju");
System.out.println(al);
//retreive specific element
System.out.println(al.get(3));//index of element
//change element/replace
al.set(1, "khan");
System.out.println(al);
//search -contains()-return true or false
System.out.println(al.contains("khan"));
System.out.println(al.contains("java"));
//isEmpty()

System.out.println(al.isEmpty());
//read the data
//1)for loop
//System.out.println("reading element for loop");
//for(int i=0;i<al.size();i++) {
//	System.out.println(al.get(i));
//}

//2)for..each loop
//for(Object e:al) {
//	System.out.println("redaing element for each loop");
//	System.out.println(e);
//}



//3)iterator()
//Iterator it=al.iterator();
//while(it.hasNext()) {
//	System.out.println(it.next());
//}


	}

}
