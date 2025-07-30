package pack3;
import java.util.*;
public class ArrayRemoveElement {

	public static void main(String[] args) {
		int arr[] = {25,14,56,15,36};
		System.out.println("orginal array: "+Arrays.toString(arr));
		int n=arr.length-1;
		int removeIndex = 1;
		for(int i=removeIndex;i<n;i++) {
			arr[i]=arr[i+1];
		}
System.out.println("After : "+Arrays.toString(arr));
	}

}
