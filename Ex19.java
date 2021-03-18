import java.util.*;
public class Ex19 {

	public static void main(String[] args) {
		Ex19 output = new Ex19();
		String arr[]={"2AA","12","ABC","c1a"};
		System.out.println(output.count(arr));

	}
	
	public int count(String []str) {
		String s1 = "";
		int sum=0;
		for (String t1 : str)
		{
		    s1 += t1 ;
		}
		for(int i=0;i<s1.length();i++) {
			if(Character.isDigit(s1.charAt(i))) {
				sum=sum+Integer.parseInt(String.valueOf(s1.charAt(i)));
			}
		}
		return sum;
	}

}