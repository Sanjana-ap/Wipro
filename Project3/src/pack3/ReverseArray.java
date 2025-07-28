package pack3;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		int arr[]= {5,2,7,9,6};
		int left=0,right=arr.length-1;
		System.out.println("orginal array: "+Arrays.toString(arr));
		while(left<right) {
			int temp=arr[left];
			arr[left]=arr[right];
			arr[right]=temp;
			left++;
			right--;
		}
		System.out.println("Reversed array : "+Arrays.toString(arr));

	}

}
