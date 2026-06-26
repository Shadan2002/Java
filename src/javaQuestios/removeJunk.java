package javaQuestios;

public class removeJunk {

	public static void main(String[] args) {
String s="a@#% latin string 545438034843";

 
System.out.println(s.replaceAll("[^ a-zA-Z0-9]"," " ));
	}

}
