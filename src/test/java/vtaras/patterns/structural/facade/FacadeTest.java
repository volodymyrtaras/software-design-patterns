package vtaras.patterns.structural.facade;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FacadeTest {

    private final DVDPlayer dvdPlayer = new DVDPlayer();
    private final Amplifier amplifier = new Amplifier();
    private final Projector projector = new Projector();
    private final Screen screen = new Screen();
    private final HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(dvdPlayer, amplifier, projector, screen);

    @Test
    void testWatchMovie() {
        List<String> events = homeTheaterFacade.watchMovie("Inception");

        Assertions.assertEquals(8, events.size());

        Assertions.assertEquals("Get ready to watch a movie...", events.get(0));
        Assertions.assertEquals("Screen is down", events.get(1));
        Assertions.assertEquals("Projector is on", events.get(2));
        Assertions.assertEquals("Projector is in widescreen mode", events.get(3));
        Assertions.assertEquals("Amplifier is on", events.get(4));
        Assertions.assertEquals("Setting volume to 5", events.get(5));
        Assertions.assertEquals("DVD Player is on", events.get(6));
        Assertions.assertEquals("Playing movie: Inception", events.get(7));
    }

    @Test
    void testEndMovie() {
        List<String> events = homeTheaterFacade.endMovie();

        Assertions.assertEquals(5, events.size());

        Assertions.assertEquals("Shutting movie theater down...", events.get(0));
        Assertions.assertEquals("DVD Player is off", events.get(1));
        Assertions.assertEquals("Amplifier is off", events.get(2));
        Assertions.assertEquals("Projector is off", events.get(3));
        Assertions.assertEquals("Screen is up", events.get(4));
    }
}
