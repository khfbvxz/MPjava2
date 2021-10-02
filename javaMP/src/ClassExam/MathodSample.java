package ClassExam;

import java.beans.MethodDescriptor;


public class MathodSample {
	// 메소드 오버로딩
	// 메소드 오버로딩 성공 조건
	/* 메소드 이름이 동일하여야한다.
	 * 메소드의 매개변수 개수나 타입이 서로 달라야한다.
	 * 메소드의 이름이 같ㄱ소 인자의 개수나 타입이 모두 같은데 메소드의 리턴 타입이 다르면 메소드 오버로딩이 성립되지 않는다.
	 * 
	 * 메소드가 배열을 전달받는 경우 메소드 내에서 배열 원소의 값을 변경하면 원본배열의 길이 변경되는가>?
	 * 메소드 호출 시 배열의 레퍼런스만 복사되므로 메소드에서 원본 배열의 값을 변경할 수 있다. 
	 */
	public int getSum(int i, int j) {
		return i+j;
	}
	public int getSum(int i, int j, int k) {
		return i+j+k;
	}
	public double getSum(double i, double j) {
		return i+j;
	}
	
	public static void main(String[] args) {
		MathodSample a =new  MathodSample();
		int i = a.getSum(1, 2);
		int j = a.getSum(1, 2, 3);
		double k = a.getSum(1.1, 2.2);
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);

	}
}
