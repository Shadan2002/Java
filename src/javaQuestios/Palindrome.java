package javaQuestios;
import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int num=sc.nextInt();
	int original=num;
	int rev=0;
	while(num!=0) {
		rev=rev*10+num%10;
		num=num/10;
	}
	if(original==rev) {
		System.out.println(original+" palindrome");
	}else
		System.out.println(original+"not  palindrome");
		


	}

}
