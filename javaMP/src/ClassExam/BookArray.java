package ClassExam;

import java.util.Scanner;

class Book2{
	String title;
	String author;
	
	public Book2(String t,String a) {// 생성자 
		this.title = t;
		this.author = a;
	}
	
	
}
public class BookArray {
	public static void main(String[] args) {
		Book2 [] book = new Book2[2];
		Scanner s = new Scanner(System.in);
		for(int i=0;i<book.length;i++) {// 길이 2
			System.out.print("제목  ");
			String title = s.nextLine();
			System.out.print("저자  ");
			String author = s.nextLine();
			book[i]= new Book2(title,author);
		}
		
		for(int i=0; i<book.length;i++)
			System.out.print("(" + book[i].title + " , " + book[i].author + ")\n");
		
		s.close();
	}	
}
