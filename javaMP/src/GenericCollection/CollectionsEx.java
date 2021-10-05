package GenericCollection;

import java.util.*;

public class CollectionsEx {
	static void printList(LinkedList<String> l) {  // 리스트의 모든 요소 출력하는 메소드~
		Iterator<String> iterator = l.iterator();  // iterator 객체 리턴
		while(iterator.hasNext()) {
			String e = iterator.next();
			String separator; //??
			if (iterator.hasNext()) {
				separator = "->"; // 마지막 요소가 아니면 -> 출력
			}
			else
				separator = "\n";
			System.out.print(e+separator);
		}
		
		
	}
	public static void main(String[] args) {
		LinkedList<String> myList =new LinkedList<String>(); // 빈 리스트 생성 
		myList.add("트랜스포머");
		myList.add("DP");
		myList.add("오징어게임");
		myList.add(0,"슬의생");
		myList.add(2,"신세경이쁘다"); // 슬의생 트랜스포머 신세경 DP 오징어
		printList(myList);
		Collections.sort(myList); // 정렬 한다음 오름차순? 
		printList(myList);
		Collections.reverse(myList);
		printList(myList);
//		String s = "아바타";
		String s = "슬의생";
		int index = Collections.binarySearch(myList, s)+1; // 아바타의 인덱스 검색 없겠지?
		System.out.println(s + index + "번째 요소입니다.");
		
		

	}
}
