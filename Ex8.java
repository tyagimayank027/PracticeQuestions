import java.util.*;

public class Ex8 {
	
	public static void main(String[] args) {
		Ex8  c = new Ex8();
		ArrayList<Integer> List1 = new ArrayList<>();
		ArrayList<Integer> List2 = new ArrayList<>();
		
		List1.add(1);
		List1.add(2);
		List1.add(3);
		List1.add(4);
		List1.add(5);
		
		List2.add(6);
		List2.add(7);
		List2.add(8);
		List2.add(9);
		List2.add(10);
		
		c.listCompare(List1,List2);
		
	}
	
	public void listCompare(ArrayList<Integer> List1,ArrayList<Integer> List2) {

		ArrayList<Integer> List3 = new ArrayList<>();
		for(int i=0;i<List1.size();i++) 
		{
			int a = List1.get(i);
			int b = List2.get(i); 
			if(a%2==0) 
				List3.add(a);
			else if (b%2==0)
				List3.add(b);
		}
		
		
		System.out.println(List3);
	}
	

}