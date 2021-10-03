package Inheritance;

interface PhoneInterface{    // 인터페이스 선언
	final int TIMEOUT = 10000;//상수 필드 선언 public static 생량
	void sendCall();			// 추상메소드 public abstract 생략
	void receiveCall();			// 추상메소드 public abstract 생략
	default void printLogo() {  // 디폴트 메소드 public 생량
		System.out.println("** Phone **");
	}
}

class SamsungPhone implements PhoneInterface{ // 인터페이스 구현
	// 모든 추상메소드 구현
	@Override
	public void sendCall() {
		System.out.println("띠ㄹㄹㄹㄹㄹㄹ");
	}
	public void receiveCall() {
		System.out.println("전화왔어요~~");
	}
	// 메소드 추가 작성
	public void flash() {System.out.println(" 전화기에 불이 켜졌네~");}
	
}

public class InterFaceEx {
	public static void main(String[] args) {
		SamsungPhone phone = new SamsungPhone();
		phone.printLogo();
		phone.sendCall();
		phone.receiveCall();
		phone.flash();
	}
}
