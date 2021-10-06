package stream;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {
	public static void main(String[] args) {
		FileReader fin = null;
		try {
			fin = new FileReader("C:\\work\\javatestzzz.txt"); // 문자 입력 스트림 생성
			int c;
//			int c = in.read(); // in.read()는 한바이트를 읽어 int 타입으로 리턴
			while((c = fin.read()) != -1) { // 한 문자씩 파일 끝까지 읽는다.
				System.out.print((char)c);
			}
			fin.close();
		} catch (IOException e) {
			System.out.println("입출력 오류");
		}
	}
}
