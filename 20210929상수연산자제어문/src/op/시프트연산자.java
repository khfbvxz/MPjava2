package op;
import java.util.Scanner;

public class 시프트연산자 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자를 입력: ");
		int x = scanner.nextInt();
		System.out.print("쉬프트할 숫자: ");
		int y = scanner.nextInt();
		double z = Math.pow(2, y);  // Math.pow(밑, 지수);
		System.out.println(x+">>"+y+" = "+ ((int)x*(int)z));
		// 포문 안쓰고 
		
	}
}
