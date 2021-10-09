package ArrayBJ;

import java.util.Arrays;
import java.util.Scanner;

public class AvgOver {
	public static void main(String[] args) {
		System.out.println("hello");
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		int a = 0;
		int[][] arr = new int[c][];
		for(int i = 0 ; i<c ; i++) {
			a = sc.nextInt();
			arr[i][0]=a;
			for(int j = 0 ; j<a;j++) {
				arr[i][j+1] = sc.nextInt();
			}
		}//for end
		System.out.println(Arrays.deepToString(arr));
	}//main end
}
