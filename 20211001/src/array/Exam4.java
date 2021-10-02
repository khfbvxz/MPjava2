package array;

public class Exam4 {
	public static void main(String[] args) {
		// 2x3
		int[][] nums = new int[2][3];
		nums[0][0] = 123;
		nums[0][1] = 33;
		nums[0][2] = 7;
		nums[1][0] = 4;
		nums[1][1] = 9;
		nums[1][2] = 2;
//		nums[2][0] = 123;
//		nums[2][1] = 33;
//		nums[2][2] = 7;
//		nums[0][3] = 99;//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3at array.Exam4.main(Exam4.java:10)
		int[][] nums2 = new int[][] { { 123, 33, 7 }, { 4, 9, 2 } };
		int[][] nums3 = { { 123, 33, 7 }, { 4, 9, 2 } };
		
		
		for(int i = 0 ; i<nums2.length;i++) {
			for(int j = 0 ;j< nums2[i].length;j++) {
				System.out.printf("%4d",nums2[i][j]);
			}
			System.out.println("");
		}
		System.out.println("nums의 길이 (행):"+ nums.length);
		System.out.println("nums의 0번째 행의 길이 (열):"+ nums[0].length);
		
		// 열의 데이터가 비어 있을 때?
		int [][] nums4= {{1,2,3,4},{5,6}};
		for(int i = 0 ; i<nums4.length;i++) {
			for(int j = 0 ;j< nums4[i].length;j++) {
				System.out.printf("%4d",nums4[i][j]);
			}
			System.out.println("");
		}
		
	}
}
