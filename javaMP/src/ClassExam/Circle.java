package ClassExam;

public class Circle {
// 접근권한 클래스선언 클래스명
//	public int radius ; // 원의 반지름 필드    필드(변수)
//	public String name; // 원의 이름 필드
//	
//	// 생성자의 이름은 클래스의 이름과 같게  
//	// 생성자는 여러개 작성(오버로딩) 가능
//	// 생성자에 리턴타입 지정할수 없음!!!  void를 리턴타입으로 사용할 수 없읍!!
//	// public void Circle() {...} 
//	
//	//  생성자의 목적!!!
//	// 객체 생성될때 필요한 초기작업을 위함!!!!
//	public Circle() { // 매개변수 없는 생성자
//		radius=1; name =""; // 필드 초기화
//	}
//	public Circle(int r, String n) { 
//		radius =r ; name = n ;
//	}
//	public double getArea() {// 원의 면적 계산 메소드
//		return 3.14*radius*radius;
//	}
	
	int radius; 
	public Circle(int radius) {this.radius = radius;}
	public void set(int radius) {this.radius=radius;}
	
	public static void main(String[] args) {
		Circle ob1 = new Circle(1);
		Circle ob2 = new Circle(2);
//		Circle ob3 = new Circle(3);
		Circle s;
		// ## 객체 치횐 시 주의 할 점
		s = ob2;
		ob1 = ob2 ;
	
//		ob1.set(4);
//		ob2.set(5);
//		ob3.set(6);
		System.out.println("ob1.radius>>" + ob1.radius);
		System.out.println("ob2.radius>>" + ob2.radius);
//		System.out.println("ob3.radius>>" + ob3.radius);
		
//		Circle pizza = new Circle(10,"자바피자");    // Circle 객체 생성 반지름 10 , 이름 자바피자로 초기화
//		// 생성자는 new 를 통해 객체를 생성할 때 한번만 호출!!!
//		double area = pizza.getArea();
//		System.out.println(pizza.name + "의 면적은 "+ area);
//		
//		Circle donut = new Circle(); // 객체 생성 매개변수 없으므로 1, "" 으로 초기화
//		donut.name = "던킨도넛"; // 이름 변경 
//		double darea = donut.getArea();
//		System.out.println(donut.name + "의 면적은 "+ darea);
	}
}
