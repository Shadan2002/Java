package javaQuestios;
import java.util.*;
public class SortingElement {

	public static void main(String[] args) {
		//int a[]= {5,2,3,4,1,6};
		//Approach1
//		System.out.println("Array elements before sorting"+Arrays.toString(a));
//		
//Arrays.parallelSort(a);
//System.out.println("Array elements after sorting"+Arrays.toString(a));
		
		//approac2
//		System.out.println("Array elements before sorting"+Arrays.toString(a));
//		Arrays.sort(a);
//		System.out.println("Array elements after sorting"+Arrays.toString(a));
		//sorting the element in deceneding order
		Integer a[]= {7,2,3,4,1,5,6};
		System.out.println("Array elements before sorting"+Arrays.toString(a));
	Arrays.sort(a,Collections.reverseOrder());//it will not suppot int beacuse primitive data type
	System.out.println("Array elements after sorting"+Arrays.toString(a));
		
	}

}
