package vtaras.patterns.structural.adapter;

/*
 * The Adapter pattern allows incompatible interfaces to work together
 *
 * It acts as a bridge by converting the interface of a class into another interface expected by clients
 *
 * This pattern enables classes with different interfaces to collaborate seamlessly without modifying their source code
 */
interface MediaPlayer {

    String getActionDescription(String audioType, String fileName);
}
