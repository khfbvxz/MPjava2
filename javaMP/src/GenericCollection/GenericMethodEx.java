package GenericCollection;


public class GenericMethodEx {
	public static <T> GStack<T> reverse(GStack<T> a){
		GStack<T> s = new GStack<T>(); // 스택을 반대로 저장할 목적 GStack 생성
		while(true) {
			T tmp;
			tmp = a.pop(); // 원래 스택에서 요소 하나 꺼냄
			if ( tmp == null)// 스택이 비었음
				break;
			else
				s.push(tmp);
		}
		return s; // 새 스택 리턴
	}
	public static void main(String[] args) {
		GStack<Double> gs = new GStack<Double>(); 
		
		for ( int i = 0 ;i<5; i++) {
			gs.push(new Double(i));
			
		}
//		for (int i = 0 ; i<5 ; i++) {
//			System.out.println(gs.pop());
//		}
		gs = reverse(gs);
		for (int i = 0 ; i<5 ; i++) {
			System.out.println(gs.pop());
		}
	}
}
