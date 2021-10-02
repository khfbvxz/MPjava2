package homework;

import java.util.Scanner;

public class LeepYear {

	public static void main(String[] args) {
		// 변수 선언
		int year ;
		int month;
		int day ;
		int total=0;
		
		Scanner inputStream = new Scanner(System.in);
		
		//입력
		System.out.print("년도 입력: "); year =  inputStream.nextInt();
		System.out.print("월 입력: "); month =  inputStream.nextInt();
		System.out.print("일 입력: "); day =  inputStream.nextInt();
		
		switch (month-1) {
		case 11: total+=31;
		case 10: total+=30;
		case 9: total+=31;
		case 8: total+=30;
		case 7: total+=31;
		case 6: total+=30;
		case 5: total+=31;
		case 4: total+=30;
		case 3: total+=31;
		case 2: total+= ((year%4==0&&year%100!=0 )||year%400==0?29:28);
		case 1: total+=31;
		
		}
		total +=day;
		//출력
		System.out.printf("%1$d년1월1일부터 %1$d년 %2$d월 %3$d일까지의 날짜의 합은 %4$d\n",year,month,day,total);
	}

}
