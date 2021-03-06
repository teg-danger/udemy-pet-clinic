package udemy.petclinic.model;

import java.io.Serializable;
import java.util.Objects;

public class BaseEntity<ID> implements Serializable {
    private ID id;


    public BaseEntity() {
    }

    public BaseEntity(ID id) {
        this.id = id;
    }


    public ID getId() {
        return id;
    }

    public void setId(ID id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BaseEntity)) return false;
        BaseEntity<?> that = (BaseEntity<?>) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
