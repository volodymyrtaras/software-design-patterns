package vtaras.patterns.structural.proxy;

/*
 * The Proxy pattern provides a surrogate or placeholder object that controls access to another object, allowing additional functionality to be added without changing the underlying object
 *
 * Pattern usage delays the creation and initialization of the original object until it is actually needed, optimizing resource usage and enhancing performance by implementing lazy loading
 */
public class ProxyImage implements Image {

    private final String filename;

    private RealImage realImage;

    public ProxyImage(String filename) {
        this.filename = filename;
    }

    public String getFilename() {
        return filename;
    }

    public RealImage getRealImage() {
        return realImage;
    }

    @Override
    public String display() {
        if (realImage == null) {
            realImage = new RealImage(filename);
        }

        return realImage.display();
    }
}
