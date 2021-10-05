package modulepackge;

public class MathEx {
	public static void main(String[] args) {
		System.out.print("이번주 행운의 번호는 ");
		for(int i = 0; i<5 ; i++) {
			System.out.print((int)(Math.random()*45+1) + " ");
		}
	}
}
