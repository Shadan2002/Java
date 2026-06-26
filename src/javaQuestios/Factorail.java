package javaQuestios;

public class Factorail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=5;
int factorial=1;
//for(int i=num;i>=num;i++) {
//	factorial=factorial*i;
//}
for(int i=num;i>=1;i--) {
	factorial=factorial*i;
}
System.out.println(factorial);
	}

}
