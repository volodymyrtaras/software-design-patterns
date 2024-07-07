package vtaras.patterns.structural.facade;

import java.util.ArrayList;
import java.util.List;

/*
 * The Facade pattern provides a simplified interface to a complex subsystem, making it easier to use
 *
 * It abstracts the complexity of the subsystem by providing a higher-level interface, thus facilitating client interaction with the system
 */
public class HomeTheaterFacade {

    private final DVDPlayer dvdPlayer;
    private final Amplifier amplifier;
    private final Projector projector;
    private final Screen screen;

    public HomeTheaterFacade(DVDPlayer dvdPlayer, Amplifier amplifier, Projector projector, Screen screen) {
        this.dvdPlayer = dvdPlayer;
        this.amplifier = amplifier;
        this.projector = projector;
        this.screen = screen;
    }

    public List<String> watchMovie(String movie) {
        List<String> eventList = new ArrayList<>();

        eventList.add("Get ready to watch a movie...");

        eventList.add(screen.down());
        eventList.add(projector.on());
        eventList.add(projector.wideScreenMode());
        eventList.add(amplifier.on());
        eventList.add(amplifier.setVolume(5));
        eventList.add(dvdPlayer.on());
        eventList.add(dvdPlayer.play(movie));

        return eventList;
    }

    public List<String> endMovie() {
        List<String> eventList = new ArrayList<>();

        eventList.add("Shutting movie theater down...");

        eventList.add(dvdPlayer.off());
        eventList.add(amplifier.off());
        eventList.add(projector.off());
        eventList.add(screen.up());

        return eventList;
    }
}
