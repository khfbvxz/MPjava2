package 조건문;

public class IfExam5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char gender = 'x';
		String msg = "입력오류";
		if (gender == 'f' || gender == 'F') {
			msg = "여자";
		} else if (gender == 'm' || gender == 'M') {
			msg = "남자";
		}
//	        else {
//	            msg = "입력오류";
//	        }

		// 공통부분 조건에 만족 하던 하지 않던 공통적으로 처리할 부분
		System.out.println("입력된문자:" + gender + " : " + msg);
	}
}
