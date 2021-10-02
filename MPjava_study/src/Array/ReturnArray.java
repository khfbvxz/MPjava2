package Array;

public class ReturnArray {
	// ������ �迭�� �����ϴ� �޼ҵ�
	static int[] makeArray() {
		int temp[] = new int[4];
		for (int i = 0; i < temp.length; i++)
			temp[i] = i; // �迭���� �ʱ�ȭ 0 1 2 3
		return temp;// �迭 ����
		// makeArray() �� �����ص� ������ �迭�� �Ҹ�x
	}

	// 2���� �迭 ����
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
