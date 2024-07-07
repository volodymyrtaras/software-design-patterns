package vtaras.patterns.structural.facade;

public class DVDPlayer {

    public String on() {
        return "DVD Player is on";
    }

    public String play(String movie) {
        return "Playing movie: " + movie;
    }

    public String off() {
        return "DVD Player is off";
    }
}
