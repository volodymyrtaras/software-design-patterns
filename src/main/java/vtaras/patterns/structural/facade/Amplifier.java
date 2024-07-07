package vtaras.patterns.structural.facade;

public class Amplifier {

    public String on() {
        return "Amplifier is on";
    }

    public String setVolume(int level) {
        return "Setting volume to " + level;
    }

    public String off() {
        return "Amplifier is off";
    }
}
