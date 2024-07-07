package vtaras.patterns.additional.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

public class InMemoryUserRepository implements UserRepository {

    private final Map<Long, User> userStorageMap = new HashMap<>();
    private final AtomicLong currentId = new AtomicLong(1L);

    @Override
    public User findById(Long id) {
        return userStorageMap.get(id);
    }

    @Override
    public List<User> findAll() {
        return new ArrayList<>(userStorageMap.values());
    }

    @Override
    public void save(User user) {
        if (user.getId() == null) {
            user.setId(currentId.incrementAndGet());
        }

        userStorageMap.put(user.getId(), user);
    }

    @Override
    public void delete(Long id) {
        userStorageMap.remove(id);
    }
}
