package bit;

public class Exam8_2 {
	public static void main(String[] args) {
	
		for(int re =2 ; re<=8 ; re+=2) {//4번
			for(int count=1 ; count<=9;count++) {
//				for(int dan=2 ; dan<=3 ; dan++) {
				for(int dan=re ; dan<=re+1 ; dan++) {
					System.out.printf(" %3d X%2d =%3d",dan,count,(dan*count));
				}//for dan
				System.out.println();
			}//for count
			System.out.println();
		}//for re
	
	}
}
