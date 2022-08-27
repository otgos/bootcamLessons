package genericsExample;

import java.util.List;

public interface IRepository <T extends BaseClass>{
    public void save(T t);
    public T find(T t);
    public void delete(T t);
    public void update(T t);
    public List<T> getAll();
}
