package op;

public class 산술연산자예제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		int b = 7;
		int c = a /b ;
//		System.out.println(c);
		
		// 결과가 실수
		double d = a/b;
		//         i/i
		//          0 
		//     d = 0 
		//    0.0 
//		System.out.println(d);
		
		double f = (a / b);
		//         i/i
		//          0 
		//     d = 0 
		//    0.0 
//		System.out.println(f);
		
		double f2 = (double)a / (double)b;
		//         i/i
		//          0 
		//     d = 0 
		//    0.0 
//		System.out.println(f2);
		
		int x = 23 ;
		int y = 3;
		int z = x/y;
//		System.out.println("나머지는"+ (x - (y*z)));
		
	
	}

}
