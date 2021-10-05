package test12;

public class Test {
	public static void main(String[] args) {
		int n1 = 79, n2 = 12, n3 = 56;
//		// 3개 숫자 로 소트
		if (n1 > n2) {
			if (n1>n3 && n3<n2) {System.out.println(n3 +" " + n2 + " " + n1); }
			else if(n1>n3 && n3>n2) {System.out.println(n2 +" " + n3 + " " + n1); } 	
		}
		else if (n2 > n1) {
			if(n2 > n3 && n3>n1) {
				System.out.println(n1 + " " + n3 + " "+ n2);
			}
			else if (n2 > n3 && n3<n1) {
				System.out.println(n3 + " " + n2 + " "+ n2);
			}
		}
		else if (n3 > n1) {
			if(n3 > n2 && n2>n1) {
				System.out.println(n1 + " " + n2 + " "+ n3);
			}
			else if (n3 > n2 && n2<n1) {
				System.out.println(n1 + " " + n2 + " "+ n3);
			}
		}
		else if (n3 > n2) {
			if(n3 > n1 && n1>n2) {
				System.out.println(n2 + " " + n1 + " "+ n3);
			}
			else if (n3 > n2 && n2<n1) {
				System.out.println(n1 + " " + n2 + " "+ n3);
			}
		}
		// 아직 좀더 조건을 추가해야될것 같습니다..
	}
}
