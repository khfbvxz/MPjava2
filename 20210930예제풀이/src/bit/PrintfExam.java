package bit;

import java.util.Scanner;

public class PrintfExam {

	public static void main(String[] args) {
		//1번
		int a = 3456678;		
		int y = 2021;
		int m = 9;
		int d = 30;
		System.out.printf("%,d \n",a);
		System.out.printf("%4d-%02d-%2d \n",y,m,d);
		System.out.printf("%.2f \n",Math.PI);
	}
}
