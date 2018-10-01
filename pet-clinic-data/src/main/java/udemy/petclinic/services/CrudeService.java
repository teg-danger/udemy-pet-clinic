package udemy.petclinic.services;


import java.util.Set;

public interface CrudeService<T, ID> {
    T findById(ID id);

    T save(T t);

    Set<T> findAll();

    void delete(T t);

    void deleteById(ID id);
    
}
