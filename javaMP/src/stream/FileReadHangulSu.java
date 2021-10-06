package stream;
import java.io.InputStreamReader;
import java.io.*;
public class FileReadHangulSu {
	public static void main(String[] args) {
		InputStreamReader in = null;
		FileInputStream fin = null;
		try {
			fin = new FileInputStream("C:\\work\\javatestzzz.txt");
//			in = new InputStreamReader(fin,"UTF-8");
			in = new InputStreamReader(fin,"US-ASCII");
			int c ;
			System.out.println("인코딩 문자 집한은"+in.getEncoding());
			while((c=in.read()) != -1) {
				System.out.print((char)c);
			}
			in.close();
			fin.close();
		} catch (IOException e) {
			System.out.println("입출력 오류");
		}
	}
}
