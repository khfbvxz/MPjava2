package modulepackge;

public class AutoBoxingUnBoxingEx {
	public static void main(String[] args) {
		int n = 10;
		Integer intObject =n ; // 자동 박싱 Integer intObject = Integer.valueOf(10); 
		System.out.println("intObj = " + intObject );
		
		int m =  intObject +10; // 자동 언박싱 int m = te
		System.out.println("m = "+m);
		
	}
}
