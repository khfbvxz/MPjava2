package GenericCollection;

import java.util.*;

public class HashMapScoreEx {
	public static void main(String[] args) {
		// 이름과 정수를 저장할 해시맵 컬렉션 생성
		HashMap<String, Integer> scoreMap = new HashMap<String, Integer>();
		
		scoreMap.put("고정법", 97);
		scoreMap.put("장성호", 88);
		scoreMap.put("정영훈", 98);
		scoreMap.put("김유환", 70);
		scoreMap.put("엄강사", 99);
		
		System.out.println("HashMap의 요소 개수 : " + scoreMap.size());
		
		// 모든 사람 점수 출력
		Set<String> keys = scoreMap.keySet(); // 모든 키를 가진 Set 컬렉션 리턴
		Iterator<String> it = keys.iterator(); // Set에 있는 모든 key를 순서대로 검색하는 iterator 리턴
		
		while (it.hasNext()) {
			String name =it.next();
			int score = scoreMap.get(name);
			System.out.println(name + " : "+score);  // 주의!! 삽인된 순서와 출력된 순서 다르다!!!
			
		}
		
	}
}
