package vtaras.patterns.structural.proxy;

public class RealImage implements Image {

    private final String filename;
    private final String loadFromDiskOutput;

    public RealImage(String filename) {
        this.filename = filename;

        loadFromDiskOutput = loadFromDisk();
    }

    public String getLoadFromDiskOutput() {
        return loadFromDiskOutput;
    }

    private String loadFromDisk() {
        return "Loading " + filename;
    }

    @Override
    public String display() {
        return "Displaying " + filename;
    }
}
