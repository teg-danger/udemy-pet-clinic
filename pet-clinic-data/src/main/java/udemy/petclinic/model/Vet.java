package udemy.petclinic.model;

public class Vet extends Person {
    public Vet(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public Vet(Long aLong, String firstName, String lastName) {
        super(aLong, firstName, lastName);
    }
}
