package Inheritance;
class Person{
	private int weight; // private 접근 지정. Student 클래스에서 접근x
	int age;			// 디폴트  			Student 클래스에서 접근 가능
	protected int height;//protected   		Student 클래스에서 접근 가능
	public String name;   // public 		Student 클래스에서 접근 가능
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getWeight() {
		return weight;
	}
}

class Student extends Person{
	public void set() {
		age =30;
		name = "홍길동";
		height = 172;
		// weight = 99;  오류 수퍼클래스 private 멤버 접근 불가
		setWeight(99);   // private 멤버 weight 은 setWeight()으로 간접 접근
	}
}
public class InhertanceEx {
	public static void main(String[] args) {
		Student s = new Student();
		s.set();
		System.out.println(s.getWeight());
	}
}
