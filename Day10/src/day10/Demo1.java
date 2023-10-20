package day10;

import java.util.Arrays;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		int arr[] = {1,2,3,4,5,6};
		System.out.println(arr[3]);
		System.out.println(arr); 
		System.out.println(Arrays.toString(arr));
		
		int arr1[]= {1,2,5};
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.equals(arr, arr1));
		
		
		int arr2[]=Arrays.copyOf(arr1, 10);
		System.out.println(Arrays.toString(arr2));
		

		Arrays.fill(arr2, 20);
		System.out.println(Arrays.toString(arr2));
	}

}
