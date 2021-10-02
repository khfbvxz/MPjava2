package ClassExam;

class Circlea {
	int radius ; // 필드 선언
	public Circlea(int radius) { // 생성자 
		this.radius = radius;
	}
	public double getArae() {  // 면적 계산 메소드
		return 3.14*radius*radius;
	}
}

public class CircleArray {
	public static void main(String[] args) {
		Circlea [] c; // Circle 배열에 대한 레퍼런스 변수 c 선언
		c = new Circlea[5]; // 5개의 래퍼런스 배열 생성
//		Circle [] c2 = new Circle[5];
		
		for(int i = 0 ; i<c.length;i++){ // 배열갯수 만큼
			c[i]=new Circlea(i);// i 번쨰 원소 객체 생성
		}
		
		for(int i = 0 ; i<c.length; i++)
			System.out.print((int)(c[i].getArae()) + "  " );
	}
}
