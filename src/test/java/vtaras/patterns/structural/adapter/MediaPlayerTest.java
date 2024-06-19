package vtaras.patterns.structural.adapter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MediaPlayerTest {

    @Test
    void testVlcPlayerActionDescription() {
        VlcPlayer vlcPlayer = new VlcPlayer();

        String fileName = "song1.vlc";
        String expected = "Playing file using: " + fileName;

        Assertions.assertEquals(expected, vlcPlayer.getActionDescription(fileName));
    }

    @Test
    void testMediaAdapterForVlc() {
        MediaAdapter mediaAdapter = new MediaAdapter();

        String playerType = "vlc";
        String fileName = "song1.vlc";
        String expected = "Playing file using: " + fileName;

        Assertions.assertEquals(expected, mediaAdapter.getActionDescription(playerType, fileName));
    }

    @Test
    void testMediaAdapterUnsupportedPlayerType() {
        MediaAdapter mediaAdapter = new MediaAdapter();

        String playerType = "mp3";
        String fileName = "song1.mp3";

        Assertions.assertThrows(RuntimeException.class, () -> mediaAdapter.getActionDescription(playerType, fileName));
    }
}
