package vtaras.patterns.structural.adapter;

public class MediaAdapter implements MediaPlayer {

    private final VlcPlayer vlcPlayer;

    public MediaAdapter() {
        this.vlcPlayer = new VlcPlayer();
    }

    @Override
    public String getActionDescription(String playerType, String fileName) {
        if (playerType.equalsIgnoreCase("vlc")) {
            return vlcPlayer.getActionDescription(fileName);
        } else {
            throw new RuntimeException("Unsupported player type");
        }
    }
}
