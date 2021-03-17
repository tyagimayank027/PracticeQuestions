import java.util.*;

public class Ex6 {
	public HashMap<String,String> result() {
		HashMap<String, Integer> h1 = new HashMap<>();
		HashMap<String, String> h2 = new HashMap<>();
		h1.put("abc", 50);
		h1.put("efg", 70);
		Set<Map.Entry<String, Integer>> entries = h1.entrySet();
		for (Map.Entry<String, Integer> entry : entries) {
			if (entry.getValue() <60) {
				h2.put(entry.getKey(),"fail");
			}
			else {
				h2.put(entry.getKey(),"pass");
			}

		}
		return h2;
	}
	
	public static void main(String[]args) {
		Ex6 output = new Ex6();
		System.out.println(output.result());
	}
	
}
