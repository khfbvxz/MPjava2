package ClassExam;

import java.beans.MethodDescriptor;


public class MathodSample {
	// 메소드 오버로딩
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
