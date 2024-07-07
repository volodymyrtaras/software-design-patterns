package vtaras.patterns.additional.repository;

import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RepositoryTest {

    private InMemoryUserRepository userRepository;

    @BeforeEach
    public void setUp() {
        userRepository = new InMemoryUserRepository();
    }

    @AfterEach
    public void tearDown() {
        userRepository = null;
    }

    @Test
    void testSaveAndFindById() {
        User newUser = new User(null, "JohnDoe", "john.doe@example.com");

        userRepository.save(newUser);

        User retrievedUser = userRepository.findById(newUser.getId());

        Assertions.assertNotNull(retrievedUser);
        Assertions.assertEquals(newUser.getUsername(), retrievedUser.getUsername());
        Assertions.assertEquals(newUser.getEmail(), retrievedUser.getEmail());
    }

    @Test
    void testFindByIdNotFound() {
        User user = userRepository.findById(999L);

        Assertions.assertNull(user);
    }

    @Test
    void testFindAll() {
        User user1 = new User(null, "User1", "user1@example.com");
        User user2 = new User(null, "User2", "user2@example.com");

        userRepository.save(user1);
        userRepository.save(user2);

        List<User> allUsers = userRepository.findAll();

        Assertions.assertEquals(2, allUsers.size());
        Assertions.assertTrue(allUsers.contains(user1));
        Assertions.assertTrue(allUsers.contains(user2));
    }

    @Test
    void testDelete() {
        User userToDelete = new User(null, "ToDelete", "to.delete@example.com");

        userRepository.save(userToDelete);

        Assertions.assertNotNull(userRepository.findById(userToDelete.getId()));

        userRepository.delete(userToDelete.getId());

        Assertions.assertNull(userRepository.findById(userToDelete.getId()));
    }
}
