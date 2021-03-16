import java.util.*;

public class Ex5 {
	public static void main(String[] args) {
		String s =new String("hello*world");
		char Array[]=s.toCharArray();
		int i=0;
		for(int a=0;a<Array.length;a++) {
			if(Array[a]=='*') {
				i=1;
			}
		}
		if(i>0) {
			String str[]=s.split("\\*");
			if(str[0].equalsIgnoreCase(str[1])) {
				System.out.print(true);
			}
			else {
				System.out.print(false);
			}
		}
		else {
			System.out.print(false);
		}
	}
	}

