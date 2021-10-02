package bit;

public class Sample1 {
	public static void main(String[] args) {

//		for(int re=2 ; re<=9;re+=2) {
//			System.out.println(re+", "+(re+1));
//		}//for re

		for (int re = 2; re <= 9; re += 2) {
			for (int dan = re; dan <= re+1; dan++) {
				System.out.printf("%3d",dan);
			}
			System.out.println();
		} // for re
	}
}
