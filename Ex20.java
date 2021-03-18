import java.util.*;
public class Ex20 {
	
         public static void main(String[] args) {
		String str[] = {"Vikas", "Lokesh", "Ashok"};
		Ex20 output = new Ex20();
		output.convertToString(str);

}
        public String convertToString(String str[])

	{
		StringBuffer sb = new StringBuffer();
	      for(int i = 0; i < str.length; i++) {
	         sb.append(str[i]);
	      }
	      String s = sb.toString();
	      System.out.println(s);
	      return s;      
	}

	

}