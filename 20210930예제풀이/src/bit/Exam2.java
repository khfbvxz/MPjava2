package bit;

/**
 * A~~~~~~~~~~~~~~~~~~~~z
   ABCD ~~~~abcd ~~ z
  알파벳을 하나씩 증가시켜주면서 옆으로 출력 만복 <br>
  시작값 : 'A' , 끝나는 값 : 'z' , 증가치는 : 1 
 * 
 *
 */
public class Exam2 {

	public static void main(String[] args) {
//		char alpha = 'B'+1;
//		System.out.println(alpha);
		for(char alpha = 'A'; alpha<='z';alpha++ ) {
			// 알파벳을 하나씩 증가시켜주면서 옆으로 출력 반복 
			System.out.print(alpha);
		}

	}

}
