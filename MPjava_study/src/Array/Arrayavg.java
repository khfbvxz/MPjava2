package Array;

import java.util.Scanner;

public class Arrayavg {
	public static void main(String[] args) {
		int [] intArray = new int[5];
		int sum = 0;
		Scanner s = new Scanner(System.in);
		System.out.print(intArray.length+" ���� ������ �Է�");
		for(int i =0; i<intArray.length;i++) {
			intArray[i] =s.nextInt();
			
		}
		for(int i=0 ; i< intArray.length;i++) {
			sum+=intArray[i];
		}
		System.out.print("��� : " +(double)sum/intArray.length);
		s.close();
	}
}
