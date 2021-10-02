package ExTryCatch;

public class NumException {
	public static void main(String[] args) {
		String[] stringNumber = { "23","12","3.154","654"};// 문자열 배열 생성
		
		int i = 0 ;
		try {
			for(i=0; i <stringNumber.length;i++) {
				int j = Integer.parseInt(stringNumber[i]);
				// 3.154 를 정수로 변환할때  NumberFormatException 예외 발생
				System.out.println("정수로 변환된 값은 " + j);
			}
		} catch (NumberFormatException e) {
			System.out.println(stringNumber[i] + "정수로 변환 x");
		}
		
	}
}
