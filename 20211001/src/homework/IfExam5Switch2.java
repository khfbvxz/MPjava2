package homework;


import java.util.Scanner;

public class IfExam5Switch2 {
	public static void main(String[] args) {
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
		} else {
			switch ((int)avg/10) {
			case 10: case 9:
				grade='A';
				break;
			case 8: 
				grade='B';
				break;
			case 7: 
				grade='C';
				break;
			case 6: 
				grade='D';
				break;
			default:
				grade = 'F';
				break;
			}
		}

		
		System.out.printf("평균점수 ㅣ % .1f\n",avg);
		System.out.println("성적: "+ grade);
		
		
		
	}
}
