package ClassExam;
/*
 * static 의 황용
 * 전역변수나 전역 함수 필요한 경우 static 황룔
 * 공유멤버를 만들고자 할때 활용
 * 
 */
class Calc {
	public static int abs (int a) {return a>0?a:-a;}
	public static int max (int a,int b) {return (a>b)?a:b;}
	public static int min (int a,int b) {return (a<b)?b:a;}
}
public class CalcEx {
	public static void main(String[] args) {
		System.out.println(Calc.abs(-5));
		System.out.println(Calc.max(10,8));
		System.out.println(Calc.min(-3,-8));
	}
}
