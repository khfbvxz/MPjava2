package 조건문;

import java.util.Scanner;
public class IfExam5_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		char gender = 'm';
//		String msg = ((gender=='f'||gender=='F'))? "여자":((gender=='m'||gender=='M'))?"남자":"입력오류";
//		System.out.println(msg);
		

//		char gender2 = 'F';
//		switch (gender2) {
//		case 'M':case 'm':
//			System.out.println("남자");
//			break;
//		case 'F':case 'f':
//			System.out.println("여자");
//			break;			
//		default:
//			System.out.println("입력오류");
//			break;
//		}
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("점수 0~100 까지만 입력하세요");
		System.out.print("국어점수를 입력하세요: ");
		int kor = scanner.nextInt();
		System.out.print("수학점수를 입력하세요: ");
		int mat = scanner.nextInt();
		System.out.print("영어점수를 입력하세요: ");
		int eng = scanner.nextInt();
	
		int grade = (int)((kor+mat+eng)/3);
		switch (grade/10) {
		case 9:
			System.out.println("A");break;
		case 8:
			System.out.println("B");break;
		case 7:
			System.out.println("C");break;	
		case 6:
			System.out.println("D");break;
		case 5: case 4:case 3:case 2:case 1:case 0:
			System.out.println("F");break;	
		default:
			System.out.println("?");break;
		}
		//if
//		if(grade>=90 && grade =<100) {
//			System.out.println("A");
//		}else if(grade>=80 && grade <90) {
//			System.out.println("B");
//		}else if(grade>=70 && grade <80) {
//			System.out.println("C");
//		}else if(grade>=60 && grade <70) {
//			System.out.println("D");
//		}else if(grade>=0 && grade <60) {
//			System.out.println("F");
//		}else {
//			System.out.println("?");
//		}
		
		
		scanner.close();
	}

}
