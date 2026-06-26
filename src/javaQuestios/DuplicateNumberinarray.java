package javaQuestios;

import java.util.HashSet;

public class DuplicateNumberinarray {

	public static void main(String[] args) {
		
		String arr[]= {"java","c","python","java"};
		
//approach1
	/*	boolean flag=false;
		for(int i=0;i<arr.length;i++) 
		{
			for(int j=i+1;j<arr.length;j++) 
			{
				if(arr[i]==arr[j]) 
				{
					System.out.println("Duplicate number is "+arr[i]);
					flag=true;
				}
			}
		}
		if(flag==false) {
			System.out.println("no duplicate  found");
		}*/
	//approach2:Hashset
		HashSet <String>lan=new HashSet();
	/*	System.out.println(lan.add("java"));
		System.out.println(lan.add("python"));
		System.out.println(lan.add("java"));
		*/
		boolean flag=false;
		for(String l:arr) 
		{
			if(lan.add(l)==false) {
				System.out.println("found duplicate elemnt:"+ l);
				flag=true;
			}
			
		}
		if(flag==false) {
			System.out.println("no duplicate");
		}
		
	
		
}
}