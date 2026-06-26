package javaQuestios;

public class Print_evenandodd_inarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,6};
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]%2==0) {
//				System.out.println("is even number "+arr[i]);
//			}else
//				System.out.println("is odd number "+arr[i]);
//		}
//Enhanced for loop
		for(int value:arr) {
			if(value%2==0) {
				System.out.println("is even number "+value);
				
			}
		}
	}

}
