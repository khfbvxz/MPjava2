package bit;

/**
 * 2 3 4 5 6 
 * 
 * @author yuhwan
 *
 */
public class Exam7_1 {
	public static void main(String[] args) {
		//2~9 단
		for (int count=1 ; count<=9 ; count++ ) {
			for(int dan = 2 ; dan <=9; dan++) {
				//System.out.print(dan+" X "+count+" = "+(dan*count)+"\t");
				System.out.printf("%3d X%2d =%3d",dan ,count,(dan*count));
			}
			System.out.println();
		}
	}
}
