package MainExTry;

import java.util.Scanner;

public class DivideByZero {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int dividend; // 나뉨수
		int divisor;//나눗수
		
		System.out.print("나뉨수 입력:");
		dividend = s.nextInt();
		System.out.print("나눗수 입력: ");
		divisor = s.nextInt();
		System.out.println(dividend + "를 " + divisor + "로 나누면 몫은 "
				+dividend/divisor + "입니다." );
		s.close();
	}
}
