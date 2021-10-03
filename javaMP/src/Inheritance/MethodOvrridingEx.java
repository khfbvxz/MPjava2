package Inheritance;

class Shape{  // 수퍼 클래스
	public Shape next;
	public Shape() {next = null;}
	public void draw() {
		System.out.println("Shape");
	}
}

class Line extends Shape{
	public void draw() {//메소드 오버라이딩
		System.out.println("Line");
	}
}

class Rect extends Shape{
	public void draw() {//메소드 오버라이딩
		System.out.println("Rect");
	}
}
class Circle extends Shape{
	public void draw() {//메소드 오버라이딩
		System.out.println("Circle");
	}
}
public class MethodOvrridingEx {
	static void paint(Shape p) {
		p.draw();  // p가 가리키는 객체 내에 오버라이딩 된 draw()호출. 동적 바인딩
	}
	public static void main(String[] args) {
		Line line = new Line();
		// 다음 호출들은 모두 paint ()  메소드 내에서 Shape에 대란 레퍼런스 p로 업캐스팅
		paint(line);		// Line 에 오버라이딩한 draw() 실행 line
		paint(new Shape()); // shpe 의 draw()실행		 		shape
		paint(new Line()); // li							line
		paint(new Rect()); // rect						rect
		paint(new Circle());
	}
}
