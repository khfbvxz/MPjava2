package stream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx {
	public static void main(String[] args) {
		byte b [] = {1,51,3,4,-1,24};
		
		try {
			FileOutputStream fout = new FileOutputStream("C:\\work\\test.out");
			for(int i = 0 ; i < b.length;i++) {
				fout.write(b[i]);
			}
			fout.close();
		} catch (IOException e) {
			System.out.println("C:\\work\\test.out에 저장할 수 없습니다. 경로명을 확인해 주세요");
			return;
		}
		System.out.println("C:\\work\\test.out 를 저장하였습니다.");
	}
}
