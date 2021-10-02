package ClassExam;

import java.util.Scanner;

class Rectangle{
	int width;
	int height;
	public int getArea() {
		return width*height;
		
	}
}

public class RectApp {

	public static void main(String[] args) {
		Rectangle rect = new Rectangle(); // 객체 생성
		Scanner s = new Scanner(System.in);
		
		System.out.print(">> " );
		rect.width = s.nextInt();
		rect.height = s.nextInt();
		System.out.println("사각형 면적 : " + rect.getArea());
		s.close();
	}
}
