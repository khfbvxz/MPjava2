package homework;


import java.util.Scanner;

public class IfExam5Switch {
	public static void main(String[] args) {
		// 
//		char gender = 'x';
//		String msg = "입력오류";
//		switch (gender) {
//		case 'f':case 'F':
//			msg="여자";
//			break;
//		case 'M':case 'm':
//			msg="남자";
//			break;	
//		
//		}
//		
//		System.out.println("문자 :"+gender+ " : "+ msg);
//		
		
		//4 
		
		int kor = 0,mat=0,eng=0 ,tot=0;
		double avg = 0;
		char grade='?';
		Scanner scanner = new Scanner(System.in);
		System.out.println("국어점수를 입력하세요: ");
		kor = scanner.nextInt();
		System.out.println("영어점수를 입력하세요: ");
		eng = scanner.nextInt();
		System.out.println("수학점수를 입력하세요: ");
		mat = scanner.nextInt();
		
		tot = kor+eng+mat;
		avg = (double)(tot/3.);
		
		if(avg < 0 || avg>100) {
			grade='?';
		} else if(avg>=90 && avg<=100) {
			grade = 'A';
		} else if(avg>=80 ) {
			grade = 'B';
		} else if(avg>=70 ) {
			grade = 'C';
		} else if(avg>=60 ) {
			grade = 'D';
		} else {
			grade = 'F';
		} 
		
		System.out.printf("평균점수 ㅣ % .1f\n",avg);
		System.out.println("성적: "+ grade);
		
		
		
	}
}
