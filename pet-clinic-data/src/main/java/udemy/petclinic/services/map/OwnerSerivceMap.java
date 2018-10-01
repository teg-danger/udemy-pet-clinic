package udemy.petclinic.services.map;

import udemy.petclinic.model.Owner;
import udemy.petclinic.services.OwnerService;

public class OwnerSerivceMap extends AbstratMapService<Owner,Long> implements OwnerService {
    @Override
    public Owner findByLastname(String lastname) {
        return super
                .getMap()
                .entrySet()
                .stream()
                .filter(x-> lastname.equals(x.getValue().getLastName()))
                .map(x-> x.getValue())
                .findFirst()
                .orElse(null);
    }
}
