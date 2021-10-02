package ExTryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputException {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("정수 4개를 입력하세요");
		int sum=0, n=0; // 초기화
		for(int i = 0 ; i<4;i++) {
			System.out.print(i+">>");
			try {
				n = s.nextInt(); // 정수 입력
				
			} catch (InputMismatchException e) {  // 정수가 아닌 문자 또는 다른 타입으로 입력하면 예외
				System.out.println("정수가 아닙니다. 다시 입력하세요!");
				s.nextLine(); // 현재 입력 스트림에 남아있는 토큰을 지운다? 
				i--; // 인덱스가 증가하지 않도록 감소 시킨다.
				continue; // 다음 루프 ( 인덱스 감소 하고 계속 loop 실행
			}
			sum+=n;		
		}
		System.out.println("합은 : "+ sum);
		s.close();
	}
	
}
