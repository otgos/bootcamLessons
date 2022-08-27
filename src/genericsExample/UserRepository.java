package genericsExample;

import java.util.List;

public class UserRepository implements IRepository<User>{
    @Override
    public void save(User user) {

    }

    @Override
    public User find(User user) {
        return null;
    }

    @Override
    public void delete(User user) {

    }

    @Override
    public void update(User user) {

    }

    @Override
    public List<User> getAll() {
        return null;
    }
}
