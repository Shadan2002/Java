package javaQuestios;
import java.util.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class Readdatafromtextfile {

	public static void main(String[] args) throws FileNotFoundException {
//		//Approach1:using fileReader BuferReader
//FileReader fr =new FileReader("C:\\Users\\SHADAN KHAN\\Desktop\\text.txt");
//
//BufferedReader br=new BufferedReader(fr);
//String str;
//while((str = br.readLine())!=null)
//{
//	System.out.println(str);
//}
//br.close();
//	}
		//approach2
		File file =new File("C:\\Users\\SHADAN KHAN\\Desktop\\text.txt");
		Scanner sc=new Scanner(file);
		while(sc.hasNextLine())
		{
			System.out.println(sc.nextLine());
		}
	}}
		

