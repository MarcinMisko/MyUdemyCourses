package command.playercommands;

import command.MusicPlayer;

public class MusicPlayerPlayRandomTrackCommand implements MusicPlayerCommand {

    private MusicPlayer musicPlayer;

    MusicPlayerPlayRandomTrackCommand(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public void play() {
        musicPlayer.playRandomTrack();
    }
}
