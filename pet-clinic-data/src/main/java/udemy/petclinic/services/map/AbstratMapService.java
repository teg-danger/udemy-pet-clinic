package udemy.petclinic.services.map;

import udemy.petclinic.model.BaseEntity;
import udemy.petclinic.services.CrudeService;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class AbstratMapService<T extends BaseEntity<ID>,ID> implements CrudeService<T,ID> {
    private HashMap<ID,T> map = new HashMap<>();

    @Override
    public T findById(ID id) {
        return map.get(id);
    }

    @Override
    public T save(T t) {
        return map.putIfAbsent(t.getId(),t);
    }

    @Override
    public Set<T> findAll() {
        return new HashSet<>(map.values());
    }

    @Override
    public void delete(T t) {
        this.deleteById(t.getId());
    }

    @Override
    public void deleteById(ID id) {
        map.remove(id);
    }

    public HashMap<ID, T> getMap() {
        return map;
    }

    public void setMap(HashMap<ID, T> map) {
        this.map = map;
    }
}
