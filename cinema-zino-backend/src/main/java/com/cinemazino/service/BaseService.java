public abstract class BaseService<T> {
    
    public abstract T save(T entity);
    
    public abstract T findById(Long id);
    
    public abstract List<T> findAll();
    
    public abstract void delete(Long id);
}