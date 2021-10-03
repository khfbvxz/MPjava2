package Inheritance;
/*
 * 상속 
 */
class Point {  
	private int x,y; // 한 점을 구성하는 x,y좌표
	public void set(int x, int y) {
		this.x = x; this.y = y;  // this 사용 
		}
	public void showPoint() {//점의 좌표 출력
		System.out.println("("+x+","+y+")");
	}
}
class ColorPoint extends Point{ // Point를 상속받는다 // 상속 선언
	private String color;// 점의색
	public void setColor(String color) {
		this.color = color;
	}
	public void showColorPoint() {// 컬러 점의 좌표 출력
		System.out.print(color);
		showPoint();
	}
}
public class ColorPointEx {
	public static void main(String[] args) {
		Point p = new Point(); // Point 객체 생성
		p.set(1, 2);  // Point 클래스의 set() 호출
		p.showPoint();
		
		// 슈퍼클래스와 서브클래스의 public 멤버를 모두 접근 가능 하다
		// 그러나 x,y,color 필드는 private 속성이어서 접근 x    
		// 서브클래스는 슈퍼클래스의 private멤버 제외하고 모든 멤버 접근 가능
		// x ,y 는 point private멤버로 오직 set() showPoint()에게만 접근 허용 -> ColorPoint 클래스의 메소드들은 메소드들은 접근 x
		
		ColorPoint cp = new ColorPoint(); // colorpoint 객체 생성  //  서브 클래스 객체 생성 
		cp.set(3, 4);// point 클래스 set() 호출
		cp.setColor("red");// colorpoint 클래스의 setcolor() 호출
		cp.showColorPoint();// 컬러와 좌표 출력
	}
}
