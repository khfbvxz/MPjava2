package variable;

public class subjectOperator {
	public static void main(String[] args) {
		// 부호 연산자  주로 음수로 만들기 위하여 사용
		int bu1 = 10 ;
		int bu2 = -10; 
		System.out.println("부호 연산자");
        System.out.println("bu1=" + bu1);
        System.out.println("bu2=" + bu2);
        /*
         부호 연산자
		bu1=10
		bu2=-10
         */
        // 증감 연산자  : 앞이나 뒤에 붙여 1만큼 늘리거나 감소
        int o = 10;
        System.out.println("증감연산자");
        System.out.println(o++); // 후위 증가 10 출력 후 10 -> 11
        System.out.println(++o);  // 전위 증가 출력 전  11 -> 12    12 출력
        System.out.println(o--);   // 후위 감소 12 출력 후 12 -> 11 
        System.out.println(--o);   // 전위 감소 출력 전 11 -> 10    10 출력 
        /* 증감연산자
         	10
         	12
			12
			10
         */
        // 논리 연산자
        boolean bo = true;
       
        System.out.println("논리연산자");
        System.out.println("bo=" + bo);
        System.out.println("!bo=" + !bo);
        /*
         bo=true
		!bo=false	
         */
        
		// 산술 연산자
		int a = 1 + 3 ;
		int b = a - 1 ;
		int c = b * 8 ;
        int d = c / 2 ;
        int e = d % 4 ;
        System.out.println("산술 연산자");
        System.out.println("a=" + a);
        System.out.println("b=" + b);
        System.out.println("c=" + c);
        System.out.println("d=" + d);
        System.out.println("e=" + e);
        /*산술 연산자
         	a=4
			b=3
			c=24
			d=12
			e=0
         */
        
        
        // 산술 대입 연산자 
        int q = 4 ;
        int w = 5 ;
        int ee = 6 ;
        
        q += 4;
        w -= 2;
        ee += q * w;
        ee %= 7 ; 
        System.out.println("산술 대입 연산자");
        System.out.println("q=" + q);
        System.out.println("w=" + w);
        System.out.println("ee=" + ee);  // (( 8 * 3 ) + 6 ) % 7 == 2 
        /*산술 대입 연산자
			q=8
			w=3
			ee=2
         */
        
        // 비트 연산자   ex) 3 = 0011   6 = 0110
        int bita = 3;
        int bitb = 6;
        int bitc = bita & bitb;
        int bitd = bita | bitb;
        int bite = bita ^ bitb;
        System.out.println("비트 연산자");
        System.out.println("bitc=" + bitc); // 0010 2
        System.out.println("bitd=" + bitd); // 0111 7 
        System.out.println("bite=" + bite); // 0101 5
        System.out.println("~bite=" + ~bite); // 1010 -6
        // 왜 -6인가  https://m.blog.naver.com/yunwoosup/221979482864 참고 
        /*
         	bitc=2
			bitd=7
			bite=5
			~bite=-6
         */
        // 시프트 연산자 
        int num1= 5 ;  // 2진수  00000101   
        int num2 = 0B0001010; // 10 을 2진수로
        byte num3 = -4;
		System.out.println("쉬프트 연산자");
        System.out.println("num1<<2 = " + (num1<<2)); // 00010100 (20)
        System.out.println("num2>>1  " + (num2>>1));  //  0000101 (5) 
        System.out.println("num3>>1  " + (num3>>2));  //  11111011 -> 11111110
        System.out.println("num3>>>1  " + (num3>>>1));// 
        /*
         	num1<<2 = 20
			num2>>1  5
			num3>>1  -1
			num3>>>1  2147483646
         */
        
        // 관계연산자
        int rea = 10 ;
        int reb = 20 ;
        int rec = 10 ;
        boolean red = rea > reb ;
        boolean ree = rea >= reb ;
        boolean ref = rea < reb ;
        boolean reg = rea <= rec ;
        boolean reh = rea == rec ;
        boolean rei = rea != reb ;
        System.out.println("관계연산자");
        System.out.println("red = " + red);   // 10>20 false
        System.out.println("ree = " + ree);   // 10>=20 false
        System.out.println("ref = " + ref);   // 10<20 true 
        System.out.println("reg = " + reg);   // 10<=20 true
        System.out.println("reh = " + reh);   // 10==10 true
        System.out.println("rei = " + rei);   // 10!=20 true
        
        // 논리연산자
        boolean boola = true;
        boolean boolb = false;
        boolean boolc = true;
        System.out.println("논리연산자");
        System.out.println("boola&&boolb = " + (boola&&boolb));
        System.out.println("boola&&boolc = " + (boola&&boolc));
        System.out.println("boola||boolb = " + (boola||boolb));
        System.out.println("boola||boolc = " + (boola||boolc));
        System.out.println("boola&=boolb = " + (boola&=boolb));
       
        /*
         	boola&&boolb = false	
			boola&&boolc = true
			boola||boolb = true
			boola||boolc = true
			boola&=boolb = false
         */
        
        // 삼항 연산자 
        int x = 3 ;
        int y = 5 ;
        int max = (x>y)? x: y;
        
        System.out.println("삼항연산자");
        System.out.println("max=" + max);
        // max=5
	}
}
