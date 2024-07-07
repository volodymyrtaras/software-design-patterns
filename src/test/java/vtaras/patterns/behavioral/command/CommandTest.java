package vtaras.patterns.behavioral.command;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CommandTest {

    @Test
    void testLightOnCommand() {
        Light light = new Light();
        Command lightOnCommand = new LightOnCommand(light);

        Assertions.assertEquals("Light is on", lightOnCommand.execute());
    }

    @Test
    void testRemoteControlWithLightOnCommand() {
        Light light = new Light();
        Command lightOnCommand = new LightOnCommand(light);
        RemoteControl remote = new RemoteControl();

        remote.setCommand(lightOnCommand);

        Assertions.assertEquals("Light is on", remote.getCommand().execute());
    }
}
