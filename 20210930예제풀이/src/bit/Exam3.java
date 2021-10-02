package bit;

/**
 * 3. ABCD ~~특수문자 abcd~~z <br > 
  특수문자 뺴고 출력<br>
  A~Zab~z<br>
  알파벳을 하나씩 증가시켜주면서 옆으로 출력 만복 <br>
  조건 특수문자를 뺀다: 'Z' 와 'a'사이에 있어요
  					'Z'다음부터 'a'전까지 스킵 ==> if
  시작값 : 'A' , 끝나는 값 : 'z' , 증가치는 : 1 
 * 
 *
 */
public class Exam3 {

	public static void main(String[] args) {

		for(char alpha = 'A'; alpha<='z';alpha++ ) {
			// 알파벳을 하나씩 증가시켜주면서 옆으로 출력 반복 
			
			System.out.print(alpha);
			// 'Z'다음부터 'a'전까지 스킵
			if(alpha=='Z') {
				//'a' 전
				alpha = 'a'-1;
				System.out.print("=====>"+alpha);
						 
			}
		}

	}

}
