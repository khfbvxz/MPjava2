package Array;

import java.util.Scanner;

public class Arrayavg {
	public static void main(String[] args) {
		int [] intArray = new int[5];
		int sum = 0;
		Scanner s = new Scanner(System.in);
		System.out.print(intArray.length+" 개의 정수를 입력");
		for(int i =0; i<intArray.length;i++) {
			intArray[i] =s.nextInt();
			
		}
		for(int i=0 ; i< intArray.length;i++) {
			sum+=intArray[i];
		}
		System.out.print("평균 : " +(double)sum/intArray.length);
		s.close();
	}
}
