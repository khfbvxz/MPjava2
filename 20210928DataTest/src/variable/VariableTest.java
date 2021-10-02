package variable;
import java.util.GregorianCalendar;

public class VariableTest {

	public static void main(String[] args) {
		boolean isMan = true;  //boolean is변수명  앞에 is를 붙이는게 좋다.
		int kor;
		kor = 89;
//		System.out.println(kor);
//		System.out.println(true + 1);
		char alpha = 65 ;
		alpha = 'A';
		
		alpha++; // = alpha +1 // 자동형변환으로 c->i
		System.out.println(alpha);
		
		long payTotal = 2147483647l;
		
		byte temp1 = 45;
		temp1 = (byte)(temp1 + 1);
					// b-> i    i 
		           //      i      i
		// b =  i 
		long temp2 = temp1;
		//    l   =  b -> l
		
		
		GregorianCalendar today = new GregorianCalendar();
		//참조 차료형      참조형 변수  =  실체 메모리상에 얼마만큼 잡힌다.   
		//객체자료형      reference  =  인스턴스 
		//에어컨          리모컨    =  new  에어컨 (); 
		int weekYear = today.getWeekYear();
		System.out.println(weekYear);
		
	}

}
