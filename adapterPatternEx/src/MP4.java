package adapterPatternEx;

public class MP4 implements MediaPackage{
	
	@Override
	public void playFile(String fileName) {
		System.out.println(".MP4 파일을 재생합니다 : " + fileName);
	}
}
