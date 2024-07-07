package vtaras.patterns.additional.mvvm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MVVMTest {

    private UserModel userModel;
    private UserViewModel userViewModel;

    @BeforeEach
    void setup() {
        userModel = new UserModel("JohnDoe", "john.doe@example.com");
        userViewModel = new UserViewModel(userModel);
    }

    @Test
    void testGetUsername() {
        Assertions.assertEquals("JohnDoe", userViewModel.getUsername());
    }

    @Test
    void testSetUsername() {
        userViewModel.setUsername("JaneDoe");

        Assertions.assertEquals("JaneDoe", userModel.getUsername());
    }

    @Test
    void testGetEmail() {
        Assertions.assertEquals("john.doe@example.com", userViewModel.getEmail());
    }

    @Test
    void testSetEmail() {
        userViewModel.setEmail("jane.doe@example.com");

        Assertions.assertEquals("jane.doe@example.com", userModel.getEmail());
    }
}
