package Inheritance;
class Personb{
	String name;
	String id;
	public Personb(String name) {
		this.name = name;
	}
}

class Studentb extends Personb{
	String grade;
	String department;
	public Studentb(String name) {
		super(name);
	}
}

public class UpcastingEx {
	public static void main(String[] args) {
		Personb p ;
		Studentb s = new Studentb("이제문");
//		p = s ; // 업캐스팅
		p = (Personb)s ;
		System.out.println(p.name);
		// p.grade ="A"
		//p.department = "Com"
	}
}
