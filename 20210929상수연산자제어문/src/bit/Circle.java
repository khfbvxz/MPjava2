package bit;
import java.util.Scanner;  // 라이브러리에서 스캐너 가져오기

public class Circle {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);  // 스캐너 정의 
		
		final double PI = 3.14; // 원주율 상수 정의 
		System.out.print("반지름 입력:");
		double radius = scan.nextDouble();
		
		System.out.println("원의 둘레:"+(2*PI*radius));
		System.out.println("원의 넓이:"+(PI*radius*radius));
	}
}
