package WhileBJ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;
// 프로그램 종료 조건이 없다. 
// 데이터가 없는 경우를 알려주어야 한다.
// hasnextInt()
public class WhileSecond {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(a+b);
		}
	}
}
