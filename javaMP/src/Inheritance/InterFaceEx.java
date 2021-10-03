package Inheritance;

interface PhoneInterface{    // 인터페이스 선언
	final int TIMEOUT = 10000;//상수 필드 선언 public static 생량
	void sendCall();			// 추상메소드 public abstract 생략
	void receiveCall();			// 추상메소드 public abstract 생략
	default void printLogo() {  // 디폴트 메소드 public 생량
		System.out.println("** Phone **");
	}
}
interface MobilePhoneInterface extends PhoneInterface{
	void sendSMS();//추상 메소드
	void receiveSMS();// 추상 메소드 
}
interface MP3Interface extends PhoneInterface{
	void play();//추상 메소드
	void stop();// 추상 메소드 
}
class PDA{// 클래스 작성
	public int calculate(int x, int y) {
		return x+y;
	}
}
interface MusicPhoneInterface extends MobilePhoneInterface,MP3Interface{ // 다중 상속
	void playMP3RingTone();//추상 메소드
	
}

interface AIInterface{
	void recognizeSpeech();//음성인식
	void systhesizeSpeech();//음성 합성
}
class SmartPhone extends PDA implements MobilePhoneInterface, MP3Interface{ // 인터페이스 구현
	// 모바일 추상메소드 구현
	@Override
	public void sendCall() {
		System.out.println("띠ㄹㄹㄹㄹㄹㄹ");
	}
	@Override
	public void receiveCall() {
		System.out.println("전화왔어요~~");
	}
	@Override
	public void sendSMS() {
		System.out.println("문자가요~");
	}
	@Override
	public void receiveSMS() {
		System.out.println("문자와요~");
	}
	
	/// mp3 추상 메소드 구현
	@Override
	public void play() {
		System.out.println("음악 스타트~");
	}
	@Override
	public void stop() {
		System.out.println("음악 멈춰~~");
	}
	// 메소드 추가 작성
	public void schedule() {System.out.println("일정 관리 합니다");}
	
}

public class InterFaceEx {
	public static void main(String[] args) {
		SmartPhone phone = new SmartPhone();
		phone.printLogo();
		phone.sendCall();
//		phone.receiveCall();
		phone.play();
		System.out.println("3 + 5 = ? >>" + phone.calculate(3, 5));
		phone.schedule();
	}
}
