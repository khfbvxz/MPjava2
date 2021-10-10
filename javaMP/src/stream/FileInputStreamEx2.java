package stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamEx2 {
	public static void main(String[] args) {
		byte b [] = new byte[6]; // 비어있는 바이트 배열
		
		try {
			FileInputStream fin = new FileInputStream("C:\\work\\test.out");
			int n = 0 ,c;
			while ((c = fin.read())!= -1) {
				b[n] = (byte)c;
				n++;
			}
			System.out.println("C:\\work\\test.out 에서 읽은 배열을 출력합니다." );
			for(int i = 0 ; i < b.length ; i++) {
				System.out.print(b[i]+" ");
			}System.out.println();
			fin.close();
		} catch (IOException e) {
			System.out.println("C:\\work\\test.out를 읽지 못했습니다. 경로를 체크해주세요!");
			
		}
		
	}
}
