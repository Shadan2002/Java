package javaQuestios;

public class ReverseeachString {

	public static void main(String[] args) {
//		//approach1
//String str="Welecome  to java";
//String[] words=str.split(" ");//splitting string to word
//String reverseString="";
//for(String  w :words)
//{
//	String reverseword="";
//	for(int i=w.length()-1;i>=0;i--) 
//	{
//		reverseword=reverseword+w.charAt(i); 
//	}
//	reverseString=reverseString+reverseword+" ";
//	
//}
//System.out.println(reverseString);

	//Approach2
		String str="welecome to java";
		String[] words=str.split("\\s");
String reverseword="";
for(String w:words)
{
	StringBuilder sb=new StringBuilder(w);
	sb.reverse();
	reverseword=reverseword+sb.toString()+" ";
}
System.out.println(reverseword);
	}

}
