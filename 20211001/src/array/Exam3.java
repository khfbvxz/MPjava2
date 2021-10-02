package array;

public class Exam3 {
	public static void main(String[] args) {
		//변수에 초기화
		int a ;
		int b ;
		int c ;
		int [] nums = new int[3];
		a=0;
		b=0;
		c=0;
		
		nums[0]=0;
		nums[1]=0;
		nums[2]=0;
		for(int i=0 ; i<nums.length  ;i++   ) {
			nums[i]=0;
		
		}
		
		int [] kors2= new int[]{56,34,78,100}; //같은거
		int [] kors= {56,34,78,100};
		
		int total=0;
//		for(int i =0 ;i< kors.length;i++) {
//			total+=kors[i];
//		}
//		System.out.println("국어점수총합:"+total);
		// 확장 for
		//for ( 구성하고 있는 데이타 타입 변수 : 배열 또는 순서를 가지고 있는 리스트의 인스턴스 )
		for (int kor : kors ) {
			total += kor;
		}
		System.out.println("total"+total);
		
		total = 0;
		int kor ; 
		for (int index=0;index<kors.length;++index) {
			kor = kors[index];
			total+=kor;//누적식
		}
		
		System.out.println("total"+total);
	}
}
