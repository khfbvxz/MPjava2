package homework;

import java.util.Scanner;

public class NanSu2 {

	public static void main(String[] args) {
		//
		int num1;
		char op;
		int num2;

		char[] ops = { '+', '-', '*', '/', '%' };
		// 0 1 2 3 4
		int inRes;
		int res = -999999;
		String msg = "바보";
		boolean isContinue =true;

		Scanner inStream = new Scanner(System.in);
		
		int count = 1;
///처리
	while(isContinue) {
		// 난수
		num1 = (int) (Math.random() * 10);
		num2 = (int) (Math.random() * 10);
		op = ops[(int) (Math.random() * 5)];
		switch (op) {
		case '+':
			res = num1 + num2;
			break;

		case '-':
			res = num1 - num2;
			break;
		case '*':
			res = num1 * num2;
			break;
		case '/':
			res = num1 / num2;
			break;
		case '%':
			res = num1 % num2;
			break;

		}



		
		for ( count =1 ; count<=3  ;count++ ) {
			System.out.print(num1 + " " + op + " " + num2+"= ? ");
			inRes = inStream.nextInt();
			if (count==1 && res == inRes ) {
				msg="천재";
				break;
			}
			if(count==2 && res == inRes ) {
				msg="잘했음";
				break;
			}
			if(count==3 && res == inRes ) {
				msg="겨우맞힘ㅜㅜ";
				break;
			}else {
				System.out.println(count);
				msg="바보";
				break;
			}
		}
		System.out.println(msg);
		if(count==1 ) {
			
			isContinue = true;
		}else if(count==3) {
			isContinue = true;
		}else {
			isContinue = false;
		}
		
	}// while end

	}
}
