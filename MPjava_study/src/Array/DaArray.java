package Array;

public class DaArray {
	public static void main(String[] args) {
		double score[][] = {{3.3,3.4},  // 1�г� 1�б� 2�б�
				{3.5,3.6},
				{3.7,4.0},
				{4.1,4.2}}; // 4�г� 1�б� 2�б�
		
		double sum = 0;
		for (int year = 0 ; year<score.length;year++)
		for(int term = 0; term<score[year].length;term++)
			sum+=score[year][term];
		int n = score.length;
		int m = score[0].length;
		System.out.println("4�г� ��ü �������"+sum/(n*m));
	
	
	}
}
