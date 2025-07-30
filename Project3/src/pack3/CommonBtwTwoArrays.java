package pack3;
import java.util.HashMap;
public class CommonBtwTwoArrays {

	public static void main(String[] args) {
		int arr1[]= {1,2,5};
		int arr2[]= {6,5,8};
		HashMap<Integer,Integer> hm=new HashMap<>();
		for(int i=0;i<arr1.length-1;i++) {
			hm.put(arr1[i], 0);
		}
		for(int i=0;i<arr2.length;i++) {
			if(hm.containsKey(arr2[i])) {
				System.out.println(arr2[i]);
			}
			
		}
	}

}
