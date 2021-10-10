package stream;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class BufferedIOEx {
	public static void main(String[] args) {
		// 먼가 출력이 되는데 꺠져서 나온다..
		//   "C:\\work\\javatestzzz.txt"
		FileReader fin = null;
		int c;
		try {
			fin = new FileReader("C:\\work\\testfile.txt");
			BufferedOutputStream out = new BufferedOutputStream(System.out, 5); // 한글까지 출력할때 이렇게!
			while ((c = fin.read())!= -1) { // 파일 데이터를 모두 스크린에 출력 
				out.write(c);
			}
			// 파일 데이터가 모두 출력된 상태
			new Scanner(System.in).nextLine();// 엔터키 입력
			out.flush();
			fin.close();
			out.close();
		} catch (IOException e) {
			e.printStackTrace();  //???
		}
		
		
	}
}
