package ExTryCatch;

public class ArrayException {

	public static void main(String[] args) {
		int[] intArr = new int[5];
		intArr[0]=0;
		try { 
			for ( int i = 0 ; i<5 ; i++) {
				intArr[i+1]= i + 1 +intArr[i];
				System.out.println("intArr[" + i + "]" + "=" + intArr[i]);
			}
			
		} 
		catch (ArrayIndexOutOfBoundsException e) {//배열의 범위를 벗어난 접근시 발생 
			// 객체 e에 예외정보가 넘어온다. 
			System.out.println("배열의 인덱스가 범위를 벗어났어요.");
		}

	}

}
