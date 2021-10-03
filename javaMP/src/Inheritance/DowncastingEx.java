package Inheritance;


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
