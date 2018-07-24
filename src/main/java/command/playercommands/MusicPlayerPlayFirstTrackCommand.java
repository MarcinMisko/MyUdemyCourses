package command.playercommands;

import command.MusicPlayer;

public class MusicPlayerPlayFirstTrackCommand implements MusicPlayerCommand {

    private MusicPlayer musicPlayer;

    MusicPlayerPlayFirstTrackCommand(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public void play() {
        musicPlayer.playFirstTrack();
    }
}
