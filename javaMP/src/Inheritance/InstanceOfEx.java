package Inheritance;
class Personc{}
class Studentc extends Personc{}
class Resercher extends Personc{}
class Professor extends Resercher{}

public class InstanceOfEx {
	static void print(Personc p) {
		if(p instanceof Personc)
			System.out.print("Person");
		if(p instanceof Studentc)
			System.out.print("Studentc");
		if(p instanceof Resercher)
			System.out.print("Resercher");
		if(p instanceof Professor)
			System.out.print("Professor");
		System.out.println();
		
	}
	public static void main(String[] args) {
		System.out.print("new student() -> \t");		print(new Studentc());
		System.out.print("new Resercher() -> \t");		print(new Resercher());
		System.out.print("new Professor() -> \t");		print(new Professor());
	}
}
