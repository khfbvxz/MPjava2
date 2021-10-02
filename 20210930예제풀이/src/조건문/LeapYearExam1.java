package 조건문;

import java.util.Scanner;

public class LeapYearExam1 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("년도 입력 : ");
		int year = scanner.nextInt();
		System.out.print("월 입력 : ");
		int month = scanner.nextInt();
		System.out.print("일 입력 : ");
		int day = scanner.nextInt();

		if (month < 1 || month > 12) {
			System.out.println("월 입력이 잘못되었습니다.");
		} else if ((month % 2 == 1 && day > 31) || (month % 2 == 0 && day > 30)) {
			System.out.println("일 입력이 잘못되었습니다.");
		} else {
			int sum = 0;
			switch (month) {
			case 12:
				if (month == 12) 
					sum += day;
				 else 
					sum += 30;
			case 11:
				if (month == 11) 
					sum += day;
				 else 
					sum += 31;
			case 10:
				if (month == 10) 
					sum += day;
				 else 
					sum += 30;
			case 9:
				if (month == 9)
					sum += day;
				else
					sum += 31;
			case 8:
				if (month == 8)
					sum += day;
				else
					sum += 30;
			case 7:
				if (month == 7)
					sum += day;
				else
					sum += 31;
			case 6:
				if (month == 6)
					sum += day;
				else
					sum += 30;
			case 5:
				if (month == 5)
					sum += day;
				else
					sum += 31;
			case 4:
				if (month == 4)
					sum += day;
				else
					sum += 30;
			case 3:
				if (month == 3)
					sum += day;
				else
					sum += 31;
			case 2:
				if (month == 2)
					sum += day;
				else {
					if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
						sum += 29;
					else
						sum += 28;
				}
			case 1:
				if (month == 1)
					sum += day;
				else
					sum += 31;
				System.out.printf("%4d년1월1일부터 %4d년 %2d월 %2d일까지의 날짜의 합은 %3d ", year, year, month, day, sum);
			}
		}
	}
}
