package test12;

public class Sample {
	public static void main(String[] args) {
		int nmg = 0 ;
		int su = 31792;
		System.out.println("원본 = " + su); // 31792
		int a , b, c ,d ,e ;
		a = 31792/10000;
		b = (su-a*10000)/1000;
		c = (su-a*10000-b*1000)/100;
		d = (su-a*10000-b*1000-c*100)/10;
		e = (su-a*10000-b*1000-c*100-d*10)%10;
		System.out.println(e*10000+d*1000+c*100+b*10+a);
		
	}
}
