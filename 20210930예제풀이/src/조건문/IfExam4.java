package 조건문;

public class IfExam4 {

	public static void main(String[] args) {
		char gender='M';
		String msg = null;
		if(gender=='f'||gender=='F') {
			msg="여자";
		}else if(gender=='m'||gender=='M') {
			msg="남자";
		}else {
			msg="입력오류";
		}
		System.out.println("입력된 문자:"+gender+" : "+msg );
	}

}
