import java.util.*;


public class Ex7 {
	public int average(){
		HashMap<Integer, Integer> h1 = new HashMap<>();
		h1.put(1,4);
		h1.put(2,6);
		h1.put(4,7);
		h1.put(5,9);
		int sum=0;
		int avg=0;
		Set<Map.Entry<Integer,Integer>> entries = h1.entrySet();
		for (Map.Entry<Integer, Integer> entry : entries) {
			if (entry.getKey()%2!=0) {
				avg=avg+1;
				 sum=sum+entry.getValue();
			}
		}
		return sum/avg;
	}

	public static void main(String[] args) {
		Ex7 output = new Ex7();
		System.out.println(output.average());

	}

}
