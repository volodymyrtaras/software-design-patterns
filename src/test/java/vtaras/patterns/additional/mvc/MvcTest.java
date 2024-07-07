package vtaras.patterns.additional.mvc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MvcTest {

    @Test
    void testUpdateUserView() {
        UserModel model = new UserModel("JohnDoe", "john.doe@example.com");
        UserView view = new UserView();

        UserController controller = new UserController(model, view);

        Assertions.assertEquals("Username: JohnDoe, Email: john.doe@example.com", controller.updateUserView());
    }

    @Test
    void testSetUsername() {
        UserModel model = new UserModel("JohnDoe", "john.doe@example.com");
        UserView view = new UserView();

        UserController controller = new UserController(model, view);
        controller.setUsername("JaneDoe");

        Assertions.assertEquals("Username: JaneDoe, Email: john.doe@example.com", controller.updateUserView());
    }

    @Test
    void testSetEmail() {
        UserModel model = new UserModel("JohnDoe", "john.doe@example.com");
        UserView view = new UserView();

        UserController controller = new UserController(model, view);
        controller.setEmail("jane.doe@example.com");

        Assertions.assertEquals("Username: JohnDoe, Email: jane.doe@example.com", controller.updateUserView());
    }
}
