package 반복문;

public class ForEx2 {

	public static void main(String[] args) {
		// 1. 1 ~~~~~  10
		for (int i = 1; i < 11; i++) {
			System.out.print(i + " ");
		}
		System.out.println("");
//		System.out.println("1번끝");

		// 2.A ~~~~~~~~~~~~~z
		//   ABCD~~abcd~~z
//		for (int i = 65; i < 123; i++) {
//			char a = (char) i;
//			System.out.print(a + "  ");
//		}
//		System.out.println("");
//		System.out.println("2번끝");

		// 3. 특수문자 빼고 A~~Zab~~z
//		for (int i = 65; i < 123; i++) {
//			char a = (char) i;
//			if ((i <= 90) || (i >= 97)) {
//				System.out.print(a + "  ");
//			}
//		}
//		System.out.println("");
//		System.out.println("3번끝");

		// 4 . A~Z 다음행 a~z
//		for (int j = 0; j <= 32; j += 32) {
//			for (int i = 65; i < 91; i++) {
//				char a = (char) (i + j);
//				System.out.print(a + "  ");
//			}
//			System.out.println("");
//		}
//		System.out.println("4번 끝");
		
		// 5. ABCDE 5개씩
//		for (int x = 1; x < 33; x += 31) {
//			if (x==1) {
//				for (int i = 65; i < 91; i += 5) {
//					for (int j = 0; j <= 4; j++) {
//						
//						char a = (char) (i + j);
//						if((i+j)<91)
//							System.out.print(a + "  ");
//					}
//					System.out.println("");
//				}
//			}
//			else if(x==32) {
//				for (int i = x+65; i < x+91; i += 5) {
//					for (int j = 0; j <= 4; j++) {
//						
//						char a = (char) (i + j);
//						if((i+j)<123)
//							System.out.print(a + "  ");
//					}
//					System.out.println("");
//				}
//			}
//		}
//		System.out.println("5번 끝");
		//6 번 301 호 
//		for ( int i = 3 ; i>0 ; i--) {
//			for ( int j =1 ; j<5 ; j++) {
//				System.out.print(i+"0"+j+"호 ");
//			}
//			System.out.println("");
//		}
//		System.out.println("6번 끝");
		
		//7번 
//		for(int i = 1 ; i<10;i++) {
//			System.out.println(7 + " x " + i + " = " + (7*i));
//		}
//		System.out.println("7번 끝");
		
		// 8번 
//		for(int i =1 ; i<=4 ;i++) {
//			int a = (2*i) ;
//			int b = (a+1) ; 
//			System.out.println("  "+a+"\t\t  "+b);
//			for(int j = 1 ; j<=9 ;j++) {
//				System.out.println(a+"x"+j+"="+(a*j)+"\t\t"+b+"x"+j+"="+(b*j));
//			}
//		}
//		System.out.println("8번 끝");
		
		//9번
//		for (int i =1 ; i<=2 ;i++) {
//			for(int j = 1 ; j<=9 ;j++) {
//				for (int z = 2 ; z<=6 ;z++) {
//					
//					if (i==1) {
//						System.out.print((z*i)+"x"+j+"="+((z*i)*j)+"\t");
//					}
//					else if (i==2) {
//						if((z+5<10))
//							System.out.print((z+5)+"x"+j+"="+((z+5)*j)+"\t");
//					}
//						
//				}
//				System.out.println("");
//			}
//			System.out.println("");
//		}
//		System.out.println("9번 끝");
	}
}
