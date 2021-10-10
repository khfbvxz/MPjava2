package ThreadMultitasking;

public class SysnchronizedEx {
	public static void main(String[] args) {
		SharedBoard board = new SharedBoard(); // 집계한 공유데이터 생성
		
		// 스레드 생성 시 집계판의 주소를 알려준다. 두 스레드는 집계판에 동시에 접근한다.
		Thread th1 = new StudentThread("kitae", board); // 스레드 생성
		Thread th2 = new StudentThread("junbum", board); // 스레스 생성
		// 두 스레드를 실행시킨다.
		th1.start();
		th2.start();
		
	}
}
// 공유데이터인 집계판을 시뮬레이션 하는 클래스
// 두 StudentThread 스레드에 의해 동시 접근됨!
class SharedBoard{
	private int sum = 0 ;// 집계판의 합
//	public void add() {
	synchronized public void add() {
		int n = sum ;
		Thread.yield();// 현재 실행중인 스레드 양보
		n+=10; // 10 증가
		sum = n ; // 증가한 값을 집계합에 기록
		System.out.println(Thread.currentThread().getName() + " : " + sum);
	}
}
// 학생을 시뮬레이션 하는 스레드 클래스
class StudentThread extends Thread{
	private SharedBoard board; // 집계판의 주소
	
	public StudentThread(String name , SharedBoard board) {
		super(name);
		this.board = board;
		
	}
	@Override
	public void run() {
		for (int i = 0 ; i < 10 ; i++) {
			board.add();
		}
	}
}