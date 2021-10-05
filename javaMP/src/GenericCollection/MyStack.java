package GenericCollection; 
class GStack<T>{ // 제네릭 스택 선언, 제네릭 타입 T
	int tos;
	Object [] stck; // 스택에 요소를 저장할 공간 배열
	public GStack() {
		tos = 0 ;
		stck = new Object [10]; // 제너릭 매개변수로 객체를 생성하거나 배열을 생성할 수 없으므로 Object배열을 생성하여 실제 타입의 객체를 요소로 삽입
	}
	public void push(T item) { 
		if(tos==10) // 스택이 꽉 차서 더이상 요소를 삽입할 수 없음
			return;
		stck[tos]=item;
		tos++;
	}
	public T pop() {
		if(tos == 0) {
			return null;
		}
		tos--;
		return (T)stck[tos]; // 타입 매개변수 타입으로 캐스칭 주목 
	}
}
public class MyStack {
	public static void main(String[] args) {
		GStack<String> stringStack = new GStack<String>(); //스트링 타입의 GStack 생성
		
		stringStack.push("seoul");
		stringStack.push("busan");
		stringStack.push("LA");
		
		for(int n = 0 ; n<3 ; n++) {
			System.out.println(stringStack.pop()); // stringStack 스택에 있는 3개의 문자열 팝
		}
		
		GStack<Integer> intStack = new GStack<Integer>();
		intStack.push(1);
		intStack.push(3);
		intStack.push(5);
		for(int n = 0 ; n<3; n++)
			System.out.println(intStack.pop());// intStack 스택에 있는 3개의 정수 팝
	}
}
