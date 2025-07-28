package pack3;
import java.util.HashSet;
public class CountDuplicate {

	public static void main(String[] args) {
		int arr[]= {5,2,7,7,5};
		HashSet<Integer> hs=new HashSet<>();
		for(int i=0;i<arr.length-1;i++) {
			hs.add(arr[i]);
		}
		int count =0;
		count= arr.length-hs.size();
		System.out.println(count);
	}

}
