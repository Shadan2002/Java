package javaQuestios;

public class Countcharacteroccurence {

	public static void main(String[] args) {
	String s="Java Programming java oops";
	int totalcount=s.length();
int totalcountareomve=	s.replace("a","").length();//after removing all a's;
	
int count=totalcount-totalcountareomve;
System.out.println("Numeber of occurence of a is"+count);
	}

}
