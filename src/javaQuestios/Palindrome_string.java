package javaQuestios;

import java.util.Scanner;

public class Palindrome_string {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter string");
String str=sc.next();
String original=str;
String rev="";


for(int i=str.length()-1;i>=0;i--) {
	rev=rev+str.charAt(i);
}



	
	if(original.equals(rev)) {
		System.out.println(rev+" is palindrome");
	}else
		System.out.println(rev+" not palindrome");
}
}
