package Array;

public class ReturnArray {
	// 정수형 배열을 리턴하는 메소드
	static int[] makeArray() {
		int temp[] = new int[4];
		for (int i = 0; i < temp.length; i++)
			temp[i] = i; // 배열원소 초기화 0 1 2 3
		return temp;// 배열 리턴
		// makeArray() 가 종료해도 생성된 배열은 소멸x
	}

	// 2차원 배열 리턴
	static int[][] make2DArr() {
		int temp[][] = new int[3][4];
		for (int i = 0; i < temp.length; i++)
			for (int j = 0; j < temp[i].length; j++)
				temp[i][j] = ((i + 1) * 10 + j);
		return temp;
	}

	public static void main(String[] args) {
		int intArr[];
		intArr = makeArray();
		for (int i = 0; i < intArr.length; i++) {
			System.out.print(intArr[i] + " ");
		}
		System.out.println();
		int[][] int2Arr = make2DArr();
		for (int i = 0; i < int2Arr.length; i++) {
			for (int j = 0; j < int2Arr[i].length; j++) {
				System.out.print(int2Arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
