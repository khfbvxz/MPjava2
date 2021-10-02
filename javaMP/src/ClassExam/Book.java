package ClassExam;
/*
 * this 레퍼런스
 * this 의 기초 개념 : this 는 객체 자신의 대한 레퍼런스 현재 실행되고 있는 메소드가 속한 객체에 대한 레퍼런스
 * 
 * 필요성
 * public Circle(int radius) { radius = radius} 둘다 모두 매개변수 radius에 접근  
 * public Circle(int radius) { this.radius = radius} 
 *                             멤버 radius     매개변수 radius
 *                             
 * 사용시 주의할 점
 * this()는 반드시 생성자 코드에서만 호출 할 수 있다.
 * this()는 반드시 같은 클래스 내 생성자를 호출할 때 사용
 * this()는 반드시 생서자의 첫번재 문장이 되어야 한다.!!
 */
public class Book {
	String title;
	String author;
	
	void show() { System.out.println(title + " " + author);}
	// this 로 다른 생성자 호출
	public Book() {
//		System.out.println("생성자 호출됨~");  // 주의할점 3번째 
		this("","");
		System.out.println("생성자 호출됨~");  // 주의할점 3 
	}
	public Book(String t) {// 생성자 
		this(t,"작자미상");
		
	}
	public Book(String t,String a) {// 생성자 
		this.title = t;
		this.author = a;
		
	}
	
	public static void main(String[] args) {
		Book littlePrince = new Book("어린왕자","생택쥐페리");
		Book loveStory = new Book("춘향전");
		Book emptyBook = new Book();
		littlePrince.show();
		loveStory.show();
		emptyBook.show();
//		Book littlePrince = new Book("어린왕자","생택쥐페리");
//		// 생성자 public Book(String t,String a)호출
//		Book loveStory = new Book("춘향전"); //생성자 public Book(String t) 호출
		
//		System.out.println(littlePrince.title + "  " + littlePrince.author);
//		System.out.println(loveStory.title + "  " + loveStory.author);
		
	}
}
