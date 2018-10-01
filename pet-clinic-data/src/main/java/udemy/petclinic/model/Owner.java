package udemy.petclinic.model;

public class Owner extends  Person {
    public Owner(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public Owner(Long aLong, String firstName, String lastName) {
        super(aLong, firstName, lastName);
    }

}
