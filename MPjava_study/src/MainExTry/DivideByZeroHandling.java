package MainExTry;

import java.util.Scanner;

public class DivideByZeroHandling {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		while (true) {
			System.out.print("������ �Է�:");
			int dividend = s.nextInt();
			System.out.print("������ �Է�: ");
			int divisor = s.nextInt();
			try {
				System.out.println(dividend + "�� " + divisor + "�� ������ ���� " + dividend / divisor + "�Դϴ�.");
				break;
			} catch (ArithmeticException e) {
				System.out.println("0���� ������ ���� �ٽ� �Է�");
			}
		}
		s.close();
	}
}
