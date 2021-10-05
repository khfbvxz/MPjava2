package GenericCollection;

import java.util.*;

public class ArrayListEx {
	public static void main(String[] args) {
		// 문자열만 삽입 가능한 ArrayList 생성
		ArrayList<String> a = new ArrayList<String>();
		
		//키보드로 부터 4개 이름 입력받아 Arraylist에 삽입
		Scanner sc = new Scanner(System.in); // 스캐너 객체 생성
		for (int i = 0 ; i<4 ; i++) {
			System.out.print(" 이름 입력 >> ");
			String s = sc.next();  //키보드로 부터 입력
			a.add(s); // ArrayList 컬렉션에 삽입
		}
		
		// A L 에 들어있는 모든 이름 출력
		for(int i = 0 ; i<a.size(); i++) {
			String  name = a.get(i);
			System.out.print(name + " ");
		}
		
		// 가장 긴 이름 출력
		int longestIndex = 0; // 현재 가장 긴 이름이 있는 A L 내의 인덱스
		for (int i = 1; i<a.size();i++) {
			if(a.get(longestIndex).length() < a.get(i).length())
				longestIndex = i; // i번째 이름이 더 긴 이름임
		}
		System.out.println("\n가장 긴 이름은: " + a.get(longestIndex));
		sc.close();
	}
}
