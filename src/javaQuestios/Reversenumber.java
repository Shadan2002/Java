
package javaQuestios;
import java.util.*;
public class Reversenumber {
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int num=sc.nextInt();
//	int rev=0;
//	while(num!=0) {
//		rev=rev*10+num%10;
//		num=num/10;
//2)string buffer
//	StringBuffer rev;
//StringBuffer sb=new StiringBuffer(String.valueOf(num));
//rev=sb.reverse();

	
//3)using stringbulider
StringBuilder sbl=new StringBuilder();
sbl.append(num);
sbl.reverse();
StringBuilder rev=sbl.reverse();
System.out.println(" the number "+rev);
}
}
