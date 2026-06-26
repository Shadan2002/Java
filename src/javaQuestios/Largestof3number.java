package javaQuestios;

import java.util.Scanner;

public class Largestof3number {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter first number");
	int a=sc.nextInt();
	System.out.println("Enter second number");
	int b=sc.nextInt();
	System.out.println("Enter third number");
int c=sc.nextInt();
//	if(a>b &&a>c) {
//		System.out.println(a +"is greatest number");
//		
//	} else if(b>c&& b>a){
//	System.out.println(b +"is greatest number");	
//	}else {
//		System.out.println(c +"is greatest number");
//	}
	//ternary number
	int largest=a>b?a:b;
	int largest2=c>largest?c:largest;
	System.out.println(largest2+" is largest Number");
	
	}
}
	


