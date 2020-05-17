package adapterPatternEx;

public class MKV implements MediaPackage{
		
	@Override
	public void playFile(String fileName) {
		System.out.println(".MKV 파일을 재생합니다 : " + fileName);
	}
}
