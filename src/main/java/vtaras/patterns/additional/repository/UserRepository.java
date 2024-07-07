package vtaras.patterns.additional.repository;

import java.util.List;

/*
 * The Repository pattern abstracts the data access layer in software applications, providing a clean separation between business logic and data persistence details
 *
 * It centralizes data access operations for specific entities, enhancing maintainability, testability, and flexibility by decoupling domain objects from the underlying data storage mechanisms
 */
public interface UserRepository {

    User findById(Long id);

    List<User> findAll();

    void save(User user);

    void delete(Long id);
}
