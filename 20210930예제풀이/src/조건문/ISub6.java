package 조건문;

import java.util.Scanner;
import java.util.Random;
import java.lang.Math;

/*
 * 수 1 , 연산자 , 수 2는 난수입니다.
 * 
 */
public class ISub6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		char ch = 'y';
		int count = 0;
		while (ch == 'y') {
			String op = "+-*/";
			int num1 = (int) (random.nextDouble() * 10);
			int num2 = (int) (random.nextDouble() * 10);
			char opp = op.charAt(random.nextInt(4));
			int result = 0;
			switch (opp) {
			case '+':
				result = num1 + num2;
				break;
			case '-':
				result = num1 - num2;
				break;
			case '*':
				result = num1 * num2;
				break;
			case '/':
				result = num1 / num2;
				break;
			}
			System.out.print(num1 + " " + opp + " " + num2 + "? ");
			int q = scan.nextInt();
			if (result == q) {
				System.out.println("천재");
				System.out.println("또?");
				char rech = scan.next().charAt(0);
				ch = rech;

			} else if (count == 2) {
				System.out.println("바보");
				System.out.println("또?");
				char rech = scan.next().charAt(0);
				ch = rech;
			} else if (result != q) {
				++count;
			}
		} // game end
		System.out.println("종료");
	}// main end

}
