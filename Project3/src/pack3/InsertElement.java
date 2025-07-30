package pack3;

import java.util.Arrays;

public class InsertElement {

	public static void main(String[] args) {
		
		int arr[]= {25,14,56,15,36};
		System.out.println("Original array: "+Arrays.toString(arr));
		int insertIndex=2;
		for(int i= arr.length-1;i>insertIndex;i--) {
			arr[i]=arr[i-1];
		}
		arr[insertIndex]=5;
		System.out.println("After: "+Arrays.toString(arr));

	}

}
