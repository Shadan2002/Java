package javaQuestios;

public class MaxandminElementinArray {

	public static void main(String[] args) {
		int a[]= {5,55,35,76,30};
//		int max=a[0];
//		for(int i=1;i<a.length;i++) {
//			if(a[i]>max) {
//				max=a[i];
//			}
//			
//		}
//		System.out.println("maximum no. in array "+max);
		int min=a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}
		System.out.println("min no. in array "+min);
	}
	

}
