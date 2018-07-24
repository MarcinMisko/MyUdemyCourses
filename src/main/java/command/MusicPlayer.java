package command;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class MusicPlayer {
    private List<String> tracks = Arrays.asList("Track 1", "Track 2", "Track 3");
    private int currentTrackNumber = 0;


    public void playFirstTrack() {
        currentTrackNumber = 0;
        System.out.println("Playing first track: " + tracks.get(currentTrackNumber));
    }

    public void playNextTrack() {
        currentTrackNumber++;
        if (currentTrackNumber > 2) {
            currentTrackNumber = 0;
        }
        System.out.println("Playing next track: " + tracks.get(currentTrackNumber));
    }

    public void playRandomTrack() {
        Random random = new Random();
        currentTrackNumber = random.nextInt(tracks.size());

        System.out.println("Playing random track: " + tracks.get(currentTrackNumber));
    }
}
