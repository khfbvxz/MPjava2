package 조건문;

import java.util.Scanner;

public class LeapYearExam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int year = 1988;
//		System.out.println(
//				year%4==0 && year %100!=0||year%400==0);

		Scanner scanner = new Scanner(System.in);
		System.out.print("년도 입력 : ");
		int year = scanner.nextInt();
		System.out.print("월 입력 : ");
		int month = scanner.nextInt();
		System.out.print("일 입력 : ");
		int day = scanner.nextInt();
		int sum = 0;
		int yun = 0;
		

		if (month < 1 || month > 12) {
			System.out.println("월 입력이 잘못되었습니다.");
		} else if ((month % 2 == 1 && day > 31) || (month % 2 == 0 && day > 30)) {
			System.out.println("일 입력이 잘못되었습니다.");

		} else {
			switch (month) {
			case 1:
				sum = day;
				break;
			case 2:
				sum = 31 +day;
				if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
					yun = 29;
				} else
					yun = 28;
				break;
			case 3:
				sum = 31 + yun + day;
			}//스위치 end
		}
		System.out.printf("%4d년1월1일부터 %4d년 %2d월 %2d일까지의 날짜의 합은 %3d ", year, year, month, day, sum);
	}
}
