package javaQuestios;

public class Sumofarray {

	public static void main(String[] args) {
	int sum=0;
	int arr[]= {1,2,3,4,5};
//for(int i=0;i<=arr.length;i++) {
//	sum=sum+i;
//}
	//Enhanced for loop
	for(int value:arr) {
		sum=sum+value;
	}
System.out.println(sum);
	}

}
