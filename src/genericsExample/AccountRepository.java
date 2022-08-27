package genericsExample;

import java.util.List;

public class AccountRepository implements IRepository<Account>{

    @Override
    public void save(Account account) {

    }

    @Override
    public Account find(Account account) {
        return null;
    }

    @Override
    public void delete(Account account) {

    }

    @Override
    public void update(Account account) {

    }

    @Override
    public List<Account> getAll() {
        return null;
    }
}
