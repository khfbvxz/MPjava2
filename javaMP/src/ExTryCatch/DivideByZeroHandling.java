package ExTryCatch;
import java.util.Scanner;
public class DivideByZeroHandling {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		while (true) {
			System.out.print("나뉨수 입력:");
			int dividend = s.nextInt();
			System.out.print("나눗수 입력: ");
			int divisor = s.nextInt();
			try {
				System.out.println(dividend + "를 " + divisor + "로 나누면 몫은 " + dividend / divisor + "입니다.");
				break;
			} catch (ArithmeticException e) {
				System.out.println("0으로 나눌수 없음 다시 입력");
			}
		}
		s.close();
	}
}
