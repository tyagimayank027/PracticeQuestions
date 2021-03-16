import java.util.*;

public class Ex3 {
	public static void main(String[] args) 
    {  
		StringBuffer output = new StringBuffer("");
        ArrayList<Integer> list1 = new ArrayList<>();
         
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(5);
        list3.addAll(list1);
        
        list1.removeAll(list2);
        list2.removeAll(list3);
        list1.addAll(list2);
        StringBuilder sb = new StringBuilder();
        for (Integer s : list1)
        {
            sb.append(s);
            
        }
        System.out.print(sb.toString());
     }
}
