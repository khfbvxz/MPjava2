package homework;


import java.util.Scanner;

public class IfExam5 {
	public static void main(String[] args) {
		
		Scanner inputStr = new Scanner(System.in);
		System.out.print("성별을 영어(F/M)로 입력해주세요: ");
		String answer = inputStr.next();
		
		String gender1 = "f";
		String gender2 = "F";
		// 객체 자료형에서 == 으로 비교하면 주소를 비교한다. 
		System.out.println("answer.equals(gender1)==>"+answer.equalsIgnoreCase(gender1));
		
		
		
		
		
				
	}
}
