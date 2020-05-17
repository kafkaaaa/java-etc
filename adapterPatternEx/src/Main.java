package adapterPatternEx;

public class Main {

	public static void main(String[] args) {

		MediaPlayer player = new MP3();
	    player.play("Test_file.mp3");
	    
	    player = new FormatAdapter(new MP4());
	    player.play("Test_file.mp4");
	    
	    player = new FormatAdapter(new MKV());
	    player.play("Test_file.mkv");
		
	}
}
