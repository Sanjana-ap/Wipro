package pack3;
import java.util.HashMap;
import java.util.Map;
public class CountDuplicateString {

	public static void main(String[] args) {
		String arr[]= {"bcd","abd","jude","bcd","oiu"};
		HashMap <String,Integer> hm=new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			hm.put(arr[i], hm.getOrDefault(arr[i], 0)+1);
		}
		for(Map.Entry<String,Integer> en :hm.entrySet()) {
			if (en.getValue() >1) {
				System.out.println(en.getKey());
			}
	}

}
}