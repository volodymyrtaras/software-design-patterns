package vtaras.patterns.structural.proxy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ProxyTest {

    @Test
    void testRealImageDisplay() {
        RealImage realImage = new RealImage("image1.jpg");

        Assertions.assertEquals("Displaying image1.jpg", realImage.display());
    }

    @Test
    void testRealImageLoadFromDisk() {
        RealImage realImage = new RealImage("image2.jpg");

        Assertions.assertEquals("Loading image2.jpg", realImage.getLoadFromDiskOutput());
    }

    @Test
    void testProxyImageDisplay() {
        ProxyImage proxyImage = new ProxyImage("image3.jpg");

        Assertions.assertEquals("Displaying image3.jpg", proxyImage.display());
    }

    @Test
    void testProxyImageLazyLoading() {
        ProxyImage proxyImage = new ProxyImage("image4.jpg");

        Assertions.assertEquals("image4.jpg", proxyImage.getFilename());
        Assertions.assertEquals("Displaying image4.jpg", proxyImage.display());
        Assertions.assertNotNull(proxyImage.getRealImage());
        Assertions.assertEquals("Loading image4.jpg", proxyImage.getRealImage().getLoadFromDiskOutput());
    }
}
