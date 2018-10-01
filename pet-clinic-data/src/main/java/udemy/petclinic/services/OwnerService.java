package udemy.petclinic.services;

import udemy.petclinic.model.Owner;

public interface OwnerService extends CrudeService<Owner,Long> {

    Owner findByLastname(String lastname);


}
