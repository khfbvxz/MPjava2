package ClassExam;
class StaticSample{
	public int n ;
	public void g() {
		m=20;
	}
	public void h() {
		m=30;
	}
	public static int m;
	public static void f() {
		m=5;
	}
}
/*
 * 
 */
public class Ex {
	public static void main(String[] args) {
//		StaticSample s1,s2;
//		s1 = new StaticSample();
//		s1.n = 5;
//		s1.g();
//		s1.m = 50;//static
//		System.out.println(s1.m);
//		s2 =new StaticSample();
//		s2.n = 8;
//		System.out.println(s1.m);
//		s2.h();
//		s2.f(); // 여기서 5로 호출 공유 
//		System.out.println(s1.m);
		StaticSample.m = 10;  // static 멤버 생성
		StaticSample s1;		
		s1 = new StaticSample();  //객체 s1생성
		System.out.println(s1.m);  //10
		s1.f();                 //s1.f()호출에ㅐ 의해 스태틱 멤버 m의 값이 5로 변경
		StaticSample.f();		// 
		System.out.println(s1.m);
	}
}
