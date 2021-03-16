import java.util.*;

public class Ex2 {
	public static void main(String[] args) {
		Ex2 key = new Ex2();
		key.start();
	}
	public void start() {
		StringBuffer s = new StringBuffer("");
		HashMap<String,String> map = new HashMap<>();
		map.put("ram","hari");
		map.put("ciso","barfi");
		map.put("honeywell","cs");
		map.put("cts","hari");
		Set<Map.Entry<String, String>>entries=map.entrySet();
		for (Map.Entry<String,String> entry:entries) {
			if(entry.getValue()=="hari") {
				System.out.print(entry.getKey()+" ");
			}
		}
		
	}

}