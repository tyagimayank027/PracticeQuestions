import java.util.*;

public class Ex10 {

	public void FindCommonElemet(int[] arr1, int[] arr2) {
		int[] arr3 = new int[20];
		int a = 0;
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					arr3[a] = arr1[i];
					a++;
					break;
				}
			}
		}
		for(int b=0;b<arr3.length;b++) {
			if(arr3[b]!=0)
			System.out.print(arr3[b]);
		}
	}

	public static void main(String[] args) {

		Ex10 c = new Ex10();
		int[] arr1 = { 1, 2, 3, 4 };

		int[] arr2 = { 3, 4, 5, 6 };
		 c.FindCommonElemet(arr1, arr2);
	}
}
