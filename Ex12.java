import java.util.*;
public class Ex12 {

	public static void main(String[] args) {
		ArrayList<String> l1 = new ArrayList<String>();
		ArrayList<String> l2 = new ArrayList<String>();
		l1.add("arun#12#12#12");
		l2.add("deepak#13#12#12");
		Ex12 c = new Ex12();
		System.out.println(c.max(l1, l2));
	}
	
		 
		public String max(ArrayList<String> l1,ArrayList<String> l2) {
			
			String s1 ="";
			String s2="";
			for (String t1 : l1)
			{
			    s1 += t1 ;
			}
			for (String t2 : l2)
			{
			    s2 += t2 ;
			}
			String[] str1;
			String[] str2;
			str1=s1.split("#");
			str2=s2.split("#");
			int sum1=0;
			int sum2=0;
			for(int i=1;i< str1.length;i++) {
				sum1=sum1+Integer.parseInt(str1[i]);
				sum2=sum2+Integer.parseInt(str2[i]);
			}
			if(sum1>sum2) {
				return str1[0];
			}
			else {
				return str2[0];
			}
		}

	}


