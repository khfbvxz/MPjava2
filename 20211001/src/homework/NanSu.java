package homework;

import java.util.Scanner;

public class NanSu {

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
		boolean isContinue;

		Scanner inStream = new Scanner(System.in);

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
		// 고객에게 받는다.
//		System.out.print(num1 + " " + op + " " + num2+"= ? ");
//		inRes = inStream.nextInt();

		// 비교 count 이 1 이거 res==inRes한다면 최초에 맞춘거다
		int count = 1;
//
//		if (res == inRes&&count==1) {
//			msg = "천재";
//		}else {
//			count++;
//			System.out.print(num1 + " " + op + " " + num2+"= ? ");
//			inRes = inStream.nextInt();
//			if(res==inRes) {
//				msg="잘했음";
//			}else {
//				count++;
//				System.out.print(num1 + " " + op + " " + num2+"= ? ");
//				inRes = inStream.nextInt();
//				if(res==inRes) {
//					msg="겨우 맞힘ㅜㅜ";
//				}else {
//					msg="바보";
//				}
//			}
//		}
		
		
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
				msg="바보";
			}
			
		}

		System.out.println(msg);

		// 정답

		// 고객에게

//		for (int i =1 ; i<=40; i++) {
//			int x =(int)(Math.random()*5);
//			System.out.println(x);

	}
}
