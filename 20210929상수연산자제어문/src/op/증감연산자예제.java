package op;

public class 증감연산자예제 {

	public static void main(String[] args) {
		int a = 5 ;
		a++; //6 a =a+1; a+=1;
		System.out.println(a);
		
		int b = 5;
		System.out.println(b);
		b=b+1;
		System.out.println(b);
		
		a = 5;
		++a;
		
		b= 5;
		b = b+1;
		System.out.println(b);
		
		a = 5;
		
		int c ;
		c = ++a;
		System.out.println(c + "  " + a);
		
		a= 5;
		c = a ;
		a = a+1;
		System.out.println(c + "  " + a);
		
		a = 5 ;
		c = a++;
		System.out.println(c + "  " + a);
		
		a = 5 ;
		c = a;
		a = a + 1;// 증가식
		System.out.println(c + "  " + a);
	}

}
