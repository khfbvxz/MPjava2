package ClassExam;

import java.util.Scanner;

class CurrencyConverter{
	private static double rate; // 1$ 에 대한 원화
	public static double toDollar(double won) {
		return won/rate;
	}
	public static double toKWR(double dollar) {
		return dollar *rate;
	}
	
	public static void setRate(double r) {
		rate = r;
	}
}
public class StaticMember {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("환율 1달러 >>");
		double rate =s.nextDouble();
		CurrencyConverter.setRate(rate);//미국 달러 환율 설정
		System.out.println("백만원 $" + CurrencyConverter.toDollar(10000000)+ "입니다.");
		System.out.println(" $100 " + CurrencyConverter.toKWR(000)+ "입니다.");
		s.close();
	}

}
