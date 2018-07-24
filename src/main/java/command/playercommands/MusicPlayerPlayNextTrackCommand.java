package command.playercommands;

import command.MusicPlayer;

public class MusicPlayerPlayNextTrackCommand implements MusicPlayerCommand {

    private MusicPlayer musicPlayer;

    MusicPlayerPlayNextTrackCommand(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public void play() {
        musicPlayer.playNextTrack();
    }
}
