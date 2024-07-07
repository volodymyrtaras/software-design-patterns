package vtaras.patterns.behavioral.mediator;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

@SuppressWarnings(value = "FieldCanBeLocal")
class MediatorTest {

    private ChatMediator mediator;
    private User user1;
    private User user2;
    private User user3;

    @BeforeEach
    public void setup() {
        mediator = new ChatMediatorImpl();
        user1 = new UserImpl(mediator, "User1");
        user2 = new UserImpl(mediator, "User2");
        user3 = new UserImpl(mediator, "User3");

        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);
    }

    @Test
    void testSendMessage() {
        user1.send("Hello everyone!");

        List<String> events = mediator.sendMessage("Hello everyone!", user1);

        Assertions.assertEquals(2, events.size());
        Assertions.assertEquals("User2: Received Message = Hello everyone!", events.get(0));
        Assertions.assertEquals("User3: Received Message = Hello everyone!", events.get(1));
    }

    @Test
    void testReceiveMessage() {
        String receivedMessage = user2.receive("Hi there!");

        Assertions.assertEquals("User2: Received Message = Hi there!", receivedMessage);
    }
}
