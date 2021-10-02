package homework;

public class StringExam1 {
	public static void main(String[] args) {
		String s1 = "asdjlijafhapsijfakd";
		String s2 = "asdjlijafhapsijfakd";
		System.out.println(s1==s2); //true
		
		String s3 = new String("asdjlijafhapsijfakd");
		System.out.println(s1==s3); // false
		
		s2="kim";
		System.out.println(s1);
		System.out.println(s2);
		
		
	}
}
