package ClassExam;

public class GarbageEx {
/*
 * 가비지 자바 응용프로그램에거 더이상 사용되지 않게 된 객체나 배열메모리이다.
 * 
 * 가비지 컬렉션 
 * 카비지는 더 이상 참조되지 않기 때문에 가비지가 차지하고 있는 메모리 공간은 회수되어야 한다. 
 * 가비지가 많아지면 자바 플랫폼이 응용프로그램에게 할당해줄 수 있는 가용 메모리 양이 줄어들게 된다.
 * 
 * 이런경우를 대비하여 자바 플랫폼은 가용 메모리가 일정 크기 이하로 줄어들면 자동으로 가비지를 회수 하여 가용 메모리를 늘린다. --> 가비지 컬렉션 
 * 가비지 컬렉션은 준비된 가비지 컬렉션 스레드에 의해 처리된다. 
 * 가비지 컬렉션 강제요청 
 * System or Runtime 객체의 gc() 메소드를 호출하면 가비지 컬렉션을 요청 할 수 있다. 
 * 
 * System.gc() 
 * 
 * 가비지 컬렉션이 필요한 이유 
 * new로 할당 받은 객체나 배열 메모리를 사용한 후 시스템에 반환하는 기능x 
 * 프로그램에서 더 이상 사용되지 않는 메모리, 즉 가비지를 자동으로 회수하는 가비지 컬렉션 필요
 * 
 * 장점 : 프로그래머가 메모리 관리를 안해도 되는 편리함
 * 단점 : 가비지 컬렉션이 진행되는 동안 응용프로그램이 일시 중단된다.
 */
	public static void main(String[] args) {
		String a = new String("Good");
		String b = new String("Bad");
		String c = new String("Normal");
		String d, e ;
		a =null;
		d =c;
		c =null;
		System.out.println(a);
		System.out.println(d);
		System.out.println(c);

	}

}
