package vtaras.patterns.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatMediatorImpl implements ChatMediator {

    private final List<User> userList;

    public ChatMediatorImpl() {
        this.userList = new ArrayList<>();
    }

    public void addUser(User user) {
        this.userList.add(user);
    }

    public List<String> sendMessage(String message, User user) {
        List<String> eventList = new ArrayList<>();

        for (User u : userList) {
            if (u != user) {
                eventList.add(u.receive(message));
            }
        }

        return eventList;
    }
}
