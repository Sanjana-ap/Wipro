package pack3;

public class MaxAndMin {

	public static void main(String[] args) {
		int arr[]= {53,32,19,79,25,5,47};
		int min = arr[0];
		int max=arr[0];
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]>max)
				max=arr[i];
			if (arr[i]<min)
				min=arr[i];
		}
		System.out.println("Min = "+min+" "+"Max = "+max);

	}

}
