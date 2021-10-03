package Inheritance;
class Pointa {  
	private int x,y;
	public Pointa() {
		this.x = this.y = 0;
	}
	public Pointa(int x, int y) {
		this.x = x; this.y = y;  // this 사용 
		}
	public void showPoint() {//점의 좌표 출력
		System.out.println("("+x+","+y+")");
	}
}

class ColorPoint2 extends Pointa{ // Point를 상속받는다 // 상속 선언
	private String color;// 점의색
	public ColorPoint2(int x , int y ,String color) {
		super(x,y);
		this.color = color;
	}
	public void showColorPoint() {// 컬러 점의 좌표 출력
		System.out.print(color);
		showPoint();
	}
}
public class SuperEx {
	public static void main(String[] args) {
		ColorPoint2 cp = new ColorPoint2(5,6,"blue");
		cp.showColorPoint();
	}
}
