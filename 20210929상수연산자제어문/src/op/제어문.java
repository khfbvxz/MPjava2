package op;

import java.util.Scanner;

public class 제어문 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("원하는 단을 입력하세요: ");
		while (true) {
			int x = scanner.nextInt();
			if (x != 1) {
				for (int i = 1; i < 10; i++) {
					System.out.println(x + "*" + i + "=" + x * i);
				}
				System.out.println("원하는 단을 입력하세요 (종료 1 입력):");
			} 
			if(x==1) {
				System.out.println("종료되었습니다.");
				break;
			}
		}
		scanner.close();
	}
}
