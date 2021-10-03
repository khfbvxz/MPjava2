package Inheritance;

class A {
	public A() {
		System.out.println("생성자 A");
	}

	public A(int x) {
		System.out.println("생성자 A 매개변수"+x);
	}
}

class B extends A {
	public B() {// 오류 발생
		System.out.println("생성자 B");

	}

	public B(int x) {
		super(x);
		System.out.println("생성자 B 매개변수"+x);
	}
}

public class ConstructorEx2 {
	public static void main(String[] args) {
		B b;
		b = new B(5);
	}
}
