package MainExTry;

import java.util.Scanner;

public class DivideByZero {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int dividend; // ������
		int divisor;//������
		
		System.out.print("������ �Է�:");
		dividend = s.nextInt();
		System.out.print("������ �Է�: ");
		divisor = s.nextInt();
		System.out.println(dividend + "�� " + divisor + "�� ������ ���� "
				+dividend/divisor + "�Դϴ�." );
		s.close();
	}
}
