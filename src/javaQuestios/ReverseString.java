package javaQuestios;
import java.util.*;
public class ReverseString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String a=sc.next();
		//1)USING +(STRING CONCATENATION)OPERATOR 
		String n="";
//		for(int i=3;i>=0;i--) {
//			n=n+a.charAt(i);
//		}
	//2)USING CHARACTER ARRAY
//		  char v[]=a.toCharArray();
//		  for(int i=v.length-1;i>=0;i--) {
//				n=n+v[i];
//			}
		//System.out.println(n);
	//	3)  Sting buffer class
		StringBuffer ab=new StringBuffer(a);
		
		System.out.println(ab.reverse());
	}

}
