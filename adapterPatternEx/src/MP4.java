package adapterPatternEx;

public class MP4 implements MediaPackage{
	
	@Override
	public void playFile(String fileName) {
		System.out.println(".MP4 ������ ����մϴ� : " + fileName);
	}
}
