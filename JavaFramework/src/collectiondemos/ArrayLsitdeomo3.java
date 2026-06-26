package collectiondemos;
import java.util.*;
public class ArrayLsitdeomo3 {

	public static void main(String[] args) {
		String arr[]= {"Dog","cat","Elephant"};
		for(String value:arr)
		{
			System.out.println(value);
		}
		ArrayList al=new ArrayList(Arrays.asList(arr));
		System.out.println(al);
	}
	
}
