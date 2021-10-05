package GenericCollection;

import java.util.*;

public class IteratorEx {
	public static void main(String[] args) {
		// 정수 값만 다루는 제네릭 백터 생성
		Vector<Integer> v = new Vector<Integer>();
		v.add(5); // 5 삽입
		v.add(4); // 4 삽입
		v.add(-1); 
		v.add(2,100);
		
		Iterator<Integer> it = v.iterator();  // iterator 객체 얻기
		while(it.hasNext()) {
			int n = it.next();
			System.out.println(n);
		}
		
		// iterator를 이용하여 모든 정수 더하기
		int sum = 0 ;
		it = v.iterator();  // it 다시 설정
		while(it.hasNext()) {
			int n = it.next();
			sum += n;
			
		}
		System.out.println(" 벡터 정수 의 합 : " +sum);
		
	}
}
