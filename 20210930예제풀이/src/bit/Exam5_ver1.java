package bit;

/**
 * 5. ABCDE<br>
 	  FGHIJ<br>
 	  ~~~Z<br>
 	  abcde<br>
 	  fg~~~<br>
 	  ~~z<br>
 	  
 	  앞바벳을 하나씩 증가시켜주면서 옆으로 출력 반복<br>
 	  알파벳을 찍고 카운트 5개 , 5개씩 카운트? 5의 배수로?
 	  
 * 
 *
 */
public class Exam5_ver1 {

	public static void main(String[] args) {

		int count = 0;
		for(char alpha = 'A'; alpha<='z';alpha++ ) {
			// 알파벳을 하나씩 증가시켜주면서 옆으로 출력 반복 
			
			System.out.print(alpha);
			// 알파벳을 찍고 카운트 5개,
			//int count=0;
			//##
//			count++;
			//5의 배수면 개행
			if(++count % 5 == 0) {
				System.out.println();
			}
			
//			'Z'다음부터 'a'전까지 스킵			
			if(alpha=='Z') {
				// count 5로 처리하도록 초기화 
				count = 0;
				System.out.println();// 개행
//				System.out.print("\n");
				//'a' 전
				alpha = 'a'-1;
//				System.out.print("=====>"+alpha+"   ");
						 
			}//if 'Z' end
		}//for end

	}//main() end

}//class end
