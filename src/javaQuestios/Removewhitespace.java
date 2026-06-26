package javaQuestios;

public class Removewhitespace {

	public static void main(String[] args) {
	String str="shadan     ahmad    khan";
	System.out.println(str);
str=str.replaceAll("\\s","");
System.out.println(str);
	}

}
