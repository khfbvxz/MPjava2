package modulepackge;

class Point{
	private int x,y;
	public Point(int x, int y) {
		this.x = x; this.y = y;
	}
	public String toString() {
		return "Point(" + x + "," + y + ")";
	}
	public boolean equals(Object obj) {// equals() 오버라이딩
		Point p = (Point)obj;// 
		if(x == p.x && y == p.y) return true;
		else return false;
	}
	
}


public class ObjectPropertyEx {
//	public static void print(Object obj) {
//		System.out.println(obj.getClass().getName()); // 클래스 이름 
//		System.out.println(obj.hashCode());			// 해시 코드 값 
//		System.out.println(obj.toString());			// 객체를 문자열로 만들어 출력
//		System.out.println(obj);					// 객체 출력
//	}
	public static void main(String[] args) {
//		Point p = new Point(2,3);
//		System.out.println(p.toString());
//		System.out.println(p);				// p 는 toString()으로 자동변환
//		System.out.println(p + " 입니다.");  // p.toString() + "입니다." 로 자동변환
		// == equals() 메소드 
		Point a = new Point(2,3);
		Point b = new Point(2,3);
		Point c = new Point(3,4);
		if(a==b)
			System.out.println("a==b");
		if(a.equals(b))
			System.out.println("a equals b");
		if(a.equals(b))
			System.out.println("a equals c");
		
	}
}
