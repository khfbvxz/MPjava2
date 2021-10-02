package 반복문;

public class ForEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 출력 형상
		// *
		// **
		// *** 
		System.out.print("******");
		System.out.print("******");
		System.out.print("******");
		for (int i=0  ;i<=3     ;i++    ) {
			System.out.println("******");
		}
		System.out.print("\n");
		
		for (int i = 0 ; i < 3; i++) {
			System.out.print("*");
		}
		
		System.out.print("\n");
		for (int i = 1 ; i < 6; i++) {
			System.out.print("*");
		}
		System.out.print("\n");
		
		System.out.println("///////변수로 받아서 처리/////////");
		int outForValue = 3; 
		int inForValue = 5;
		
		for (int i = 0 ; i < outForValue; i++) {
			for (int in = 1 ; in < inForValue; in++) {
				System.out.print("*");
			}
			System.out.println();  //#1
		}
		
		
		{
			int x ;//생성
		}//소멸
//		x=9;
		{
			int x ;
		}
		
		{
			int x ;
		}
		
		{
			int x ;
		}
		
		
		
		
	}

}
