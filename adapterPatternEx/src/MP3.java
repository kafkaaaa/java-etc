package adapterPatternEx;

public class MP3 implements MediaPlayer{
	
	@Override
	public void play(String fileName) {
		System.out.println(".MP3 ������ ����մϴ� : " + fileName);
	}
}
