package GenericCollection;

import java.util.*;
class Student{
	private int id;
	private String tel;
	public Student(int id , String tel) {this.id =id; this.tel = tel;}
	public int getId() {return id;}
	public String getTel() {return tel;}
	
}
public class HashMapStudentEx {
	public static void main(String[] args) {
		//학생 이름, Student 객체) 를 저장하는 해시맵 
		HashMap<String,Student> map = new HashMap<String,Student>();
		map.put("원일", new Student(1, "010-111-1111"));
		map.put("지훈", new Student(2, "010-222-2222"));
		map.put("경덕", new Student(3, "010-333-3333"));
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("검색할 이름?");
			String name = sc.nextLine();
			if(name.equals("exit")) {break;}
			Student st = map.get(name);
			if(st == null)
				System.out.println(name + "없는 사람 입니다.");
			else 
				System.out.println("id:" + st.getId() + ", 전화 " + st.getTel());
			
		}
		sc.close();
		
	}
	
}
