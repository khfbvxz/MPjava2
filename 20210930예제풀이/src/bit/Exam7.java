package bit;

/**
 * 6. 301호 302호 201호 202호
 * 
 * @author yuhwan
 *
 */
public class Exam7 {
	public static void main(String[] args) {
//		System.out.print("30"+1+"호");
//		System.out.print("30"+2+"호");
//		System.out.print("30"+3+"호");
//		System.out.print("30"+4+"호");
		for (int f1 = 3 ; f1 > 0 ; f1--) {
			for (int ho = 1; ho <= 4; ho++) {
				System.out.print(f1 + "0" + ho + "호 ");
			}
			System.out.println();
		}
	}
}
