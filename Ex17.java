import java.util.*;
public class Ex17 {

	public static void main(String[] args) {
		Ex17 run = new Ex17();
		ArrayList<String> input1 = new ArrayList<>();
		input1.add("aaa");
		input1.add("bb");
		input1.add("cccc");
		input1.add("d");
		System.out.print(run.count(input1,input1.get(1)));

	}
	public int count(ArrayList<String> input1, String input2) {
		int lenght2 = input2.length();
		int sum=0;
		for(String element:input1) {
			if(element.length()!=lenght2) {
				sum++;
			}
		}
		return sum;
	}

}
