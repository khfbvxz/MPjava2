package Inheritance;


//class Personb {
//	String name;
//	String id;
//
//	public Personb(String name) {
//		this.name = name;
//	}
//}
//
//class Studentb extends Personb {
//	String grade;
//	String department;
//
//	public Studentb(String name) {
//		super(name);
//	}
//}

public class DowncastingEx {
	public static void main(String[] args) {
		Personb p = new Studentb("이재문"); // 업캐스팅
		Studentb s ;
//		
		s = (Studentb) p;
		System.out.println(s.name);
		s.grade ="A";
		//p.department = "Com";
	}
}
