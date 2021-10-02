package ClassExam;

public class Circle {
// 접근권한 클래스선언 클래스명
	public int radius ; // 원의 반지름 필드    필드(변수)
	public String name; // 원의 이름 필드
	
	public Circle() { // 원의 생성자 메소드
	}
	public double getArea() {// 원의 면적 계산 메소드
		return 3.14*radius*radius;
	}
	
	public static void main(String[] args) {
		Circle pizza ;			 // Circle 객체에 대한 레퍼런스 변수 pizza 선언
		pizza = new Circle();    // Circle 객체 생성
		
		pizza.radius = 10;       // radius 필드에 10 저장
		pizza.name = "자바피자";   // name 필드에 "자바피자" 지정
		double area = pizza.getArea();
		System.out.println(pizza.name + "의 면적은 "+ area);
		
		Circle donut = new Circle();
		donut.radius = 2;
		donut.name = "던킨도넛";
		area = donut.getArea();
		System.out.println(donut.name + "의 면적은 "+ area);
	}
}
