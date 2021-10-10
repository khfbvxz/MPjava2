package stream;
import java.io.File;

public class FileEx {
	public static void listDirectory(File dir) {
		System.out.println("-----"+dir.getParent()+"의 서브리스트 입니다. ------");
		File[] subFiles = dir.listFiles(); //디렉토리에 포한된 파이로가 디렉토리 이름의 리스트 얻기 
		
		for(int i = 0 ; i<subFiles.length ; i++) { // subfile 배열의 각 파일에 대한 루프
			File f = subFiles[i];
			long t = f.lastModified(); // 마지막으로 수정된 시간.
			System.out.print(f.getName());
			System.out.print("\t 파일 크기는 "+f.length());
			System.out.printf("\t 수정한 시간: %td %td %ta %tT\n ",t,t,t,t);
		}
	}
	public static void main(String[] args) {
		File f1 = new File("c:\\windows\\system.ini");
		System.out.println(f1.getPath()+", "+ f1.getParent()+ ", "+f1.getName());
		
		String res="";
		if(f1.isFile()) res = "파일";// 파일 타입이면 
		else if(f1.isDirectory()) res = "디렉토리"; // 디렉토리 타입이면
		System.out.println(f1.getPath() + "은 "+ res + "입니다.");
		
		File f2 =new File("c:\\Temp\\java_smaple");
		if(!f2.exists()) { //f2 디렉토리가 존재하는지 검사
			f2.mkdir(); // 존재하지 않으면 디렉토리 생성
		}
		listDirectory(new File("c:\\Temp")); //c:\\Temp에 있는 파일 리스트 출력
		f2.renameTo(new File("c:\\Temp\\javasample")); // 이름 변경
		listDirectory(new File("c:\\Temp")); //c:\\Temp에 있는 파일 리스트 출력 이름 변경되었는지 확인 
	}
}
