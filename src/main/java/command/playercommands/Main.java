package command.playercommands;

import command.MusicPlayer;
import command.MusicPlayerRemote;

public class Main {
    public static void main(String[] args) {
        MusicPlayer musicPlayer = new MusicPlayer();
        MusicPlayerRemote remote = new MusicPlayerRemote();
        remote.setMusicPlayerCommand(new MusicPlayerPlayFirstTrackCommand(musicPlayer));
        remote.pressButton();
        remote.setMusicPlayerCommand(new MusicPlayerPlayNextTrackCommand(musicPlayer));
        remote.pressButton();
        remote.pressButton();
        remote.pressButton();
        remote.setMusicPlayerCommand(new MusicPlayerPlayRandomTrackCommand(musicPlayer));
        remote.pressButton();
        remote.pressButton();
    }
}
