package adapterPatternEx;

public class FormatAdapter implements MediaPlayer {

	private MediaPackage media;
	
	public FormatAdapter(MediaPackage m) {
		media = m;
	}
	
	@Override
	public void play(String fileName) {
		System.out.print("Using Adapter --> ");
		media.playFile(fileName);
	}

}
