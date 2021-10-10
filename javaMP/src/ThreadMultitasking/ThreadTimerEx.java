package ThreadMultitasking;
// 스레드를 상속받아 1초 단위로 출력하는 차이머 스레드 만들기
import java.awt.*;
import javax.swing.*;

class TimerThread extends Thread { // Thread 상속 받음
	private JLabel timerLabel; // 타이머 값이 출력되는 레이블
	
	public TimerThread(JLabel timerLabel) {
		this.timerLabel = timerLabel; // 타이머 카운트를 출력하는 레이블
	}
	// 스레드 코드 . run() 이 종료되면 스레드 종료

	@Override
	public void run() {  // start() 메소드가 호출된 후 스레드가 실행을 시작하는 메소드
		int n = 0;  // 타이머 카운트 값 
		while (true) { // 무한루프
			timerLabel.setText(Integer.toString(n));
//			System.out.println(n);  // 레이블에 카운트 값 출력
			n++; //  카운트 증가
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				return;  // 예외가 발생하면 스레드 종료
			}
		}
	}
}

public class ThreadTimerEx extends JFrame{
	public ThreadTimerEx() {
		setTitle("스레드를 상속받은 타이머 스레드 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		// 타이머 값을 출력할 레이블 생성
		JLabel timerLabel = new JLabel();
		timerLabel.setFont(new Font("Gothic", Font.ITALIC , 80));
		c.add(timerLabel);// 레이블에 컨텐트 팬에 부착
		
		TimerThread th = new TimerThread(timerLabel);
		// 타이머 스레드 객체 생성. 타이머 값을 출력할 레이블에 생성자에 전달.
		setSize(300,170);
		setVisible(true);
		th.start(); // 타이머 스레드의 실행을 시작하게 한다. 
	}
	public static void main(String[] args) {
		new ThreadTimerEx();
	}
}
