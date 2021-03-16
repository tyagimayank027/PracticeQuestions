import java.util.*;

public class Ex1 {
	public static void main(String[]args) {
		Ex1 up = new Ex1();
		up.start();
	}
	public void start() {
		String[] input = {"goa", "kerala", "Gujrat"};
		HashMap<String,String> map = new HashMap<>();
		  for(int i=0;i<input.length;i++) {
			  String key=input[i].substring(0,3).toUpperCase();
			  map.put(key, input[i]);
		  }
		
		  System.out.print(map);
	}
}
