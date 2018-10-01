package udemy.petclinic;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import udemy.petclinic.model.Owner;
import udemy.petclinic.services.map.OwnerSerivceMap;

import java.util.HashSet;

@SpringBootTest
public class OwnerServiceMapTests {

    private OwnerSerivceMap ownerSerivceMap;


    @Before
    public void setUp () {
        ownerSerivceMap = new OwnerSerivceMap();
    }
    @Test
    public void findBylastnameTest() {
        Owner teguia1 = new Owner((long) 1,"teguia","kevin1");
        Owner teguia2 = new Owner((long) 2,"teguia2","kevin2");
        ownerSerivceMap.save(teguia1);
        ownerSerivceMap.save(teguia2);

        Assert.assertEquals(ownerSerivceMap.findByLastname("kevin1"),teguia1);

    }

    @Test
    public void findAllTest() {
        Owner teguia1 = new Owner((long) 1,"teguia","kevin1");
        Owner teguia2 = new Owner((long) 2,"teguia2","kevin2");
        ownerSerivceMap.save(teguia1);
        ownerSerivceMap.save(teguia2);
        HashSet<Owner> set =  new HashSet<>();
        set.add(teguia1);
        set.add(teguia2);
        Assert.assertTrue(ownerSerivceMap.findAll().containsAll(set));
    }
}
