package javaQuestios;

public class Swaping2numbers {

	public static void main(String[] args) {
	int a=10,b=20;
	//1third variable
	System.out.println("before swaping..."+a+"  "+b);
	/*int t=a;
	a=b;
	b=t;*/
	
	//2+and -
	/*a=a+b;
	b=a-b;
	a=a-b;*/
	//3 * and /
	/*a=a*b;
	b=a/b;
	a=a/b;*/
//	bitwise operator xor (^)
//	a=a^b;
//	b=a^b;
//	a=a^b;
//	single statement
	b=a+b-(a=b);
	
	
	System.out.println("after swaping..."+a+"  "+b);

	}

}
