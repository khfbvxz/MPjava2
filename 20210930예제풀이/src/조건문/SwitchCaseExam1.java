package 조건문;
/**
 * if 문 스러운 것 
 * @author yuhwan
 *
 */
public class SwitchCaseExam1 {
	public static void main(String[] args) {
		
		/*
		 *  1 : 남자
		 *  2 : 여자 
		 */ 
		int genderCode = 1 ;
//		if(genderCode==1) {
//			System.out.println("남자");
//			
//		}else if(genderCode==2) {
//			System.out.println("여자");
//		}else {
//			System.out.println("없는코드");
//		}
//		System.out.println((genderCode==1)? "남자":(genderCode==2)?"여자":"없는코드");
		switch (genderCode) {
		case 1:
			System.out.println("남자");
			break;
		case 2:
			System.out.println("여자");
			break;
		default:
			System.out.println("없는코드");
			break;
		}
//		
	}
}
