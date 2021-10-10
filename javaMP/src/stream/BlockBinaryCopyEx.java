package stream;
import java.io.*;
public class BlockBinaryCopyEx {
	public static void main(String[] args) {
		File src = new File("C:\\Windows\\Web\\Wallpaper\\Theme1\\img2.jpg");// 원본 파일 경로면
		File dest = new File("c:\\Temp\\copyimg2.jpg"); // 복사 파일 경로명
		
		
		try {
			FileInputStream fi = new FileInputStream(src); // 파일 입력 바이트 스트림 생성
			FileOutputStream fo = new FileOutputStream(dest);// 파일 출력 바이트 스트림 생성
			byte [] buf = new byte[1024*10] ; // 10KB 버퍼
			
			while(true) {
				int n = fi.read(buf);
				fo.write(buf,0,n);
				if(n < buf.length)
					break;
			}
			fi.close();
			fo.close();
			System.out.println(src.getPath()+"를 "+dest.getPath()+"로 복사하였습니다.");
		} catch (IOException e) {
			System.out.println("파일 복사 오류 ");
		}
	}	
}

