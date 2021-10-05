package GenericCollection;

import java.util.Vector;

public class VectorEx {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>(); // 정수 값만 다루는 벡터 생성
		v.add(5);   // 5 삽입
		v.add(4);   // 4 삽입 
		v.add(-1);  // -1 삽입
		
		// 벡터 중간에 삽입하기
		v.add(2,100); // size() 보다 큰 곳에 삽입 불가
		System.out.println("백터 내의 요소 객체 수 : " + v.size()); // 크기 3
		System.out.println("벡터의 현재용량 : " + v.capacity() );  // 믈리적 크기!! 
		
		// 모든 요소 정수 출력하기 
		for(int i = 0 ; i<v.size() ; i++ ) {
			int n = v.get(i);
			System.out.println(n);
		}
		
		//벡터 속의 모든 정수 더하기
		int sum = 0;
		for(int i = 0 ; i<v.size() ; i++) {
			int n = v.elementAt(i);
			sum += n;
		}
		System.out.println("벡터 정수의 합.:" + sum);
		
		
	}
}
