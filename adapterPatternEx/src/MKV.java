package adapterPatternEx;

public class MKV implements MediaPackage{
		
	@Override
	public void playFile(String fileName) {
		System.out.println(".MKV ������ ����մϴ� : " + fileName);
	}
}
