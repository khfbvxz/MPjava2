package Array;

public class SkewedArray {
	public static void main(String[] args) {
		int [][] inAt = new int [4][];
		inAt[0]= new int[3];
		inAt[1]= new int[2];
		inAt[2]= new int[3];
		inAt[3]= new int[2];
		for(int i = 0 ; i<inAt.length;i++){
			for( int j =0; j<inAt[i].length;j++)
				inAt[i][j]=(i+1)*10+j;
		}
	
		for (int i = 0 ; i<inAt.length;i++) {
			for(int j = 0 ; j<inAt[i].length;j++)
				System.out.print(inAt[i][j]+" ");
			System.out.println();
		}
		
		
	}
}
