import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PersonTest {

    Person person;

   @BeforeEach
    void setup(){
       person = new Person("Paul", "McCartney", 2000,  true,  true, true);


}

    @Test
    public void show_full_name() {

        Assertions.assertEquals("Paul McCartney", person.fullName());

    }

    @Test
    public void test_calculateYearlySalary() {
        person.setSalary(1200);
         Assertions.assertEquals("14400", person.calculateYearlySalary());
    }

    @Test
    public void person_is_MEI(){
        person = new Person("Karin", "Pinheiro", 1993,  false,  false, false);
        person.setSalary(10);
        Assertions.assertTrue(person.isMEI());

    }

    @Test
    public void person_is_not_MEI(){
        person = new Person("Karin", "Pinheiro", 1993,  false,  true, false);
        person.setSalary(10);
        Assertions.assertFalse(person.isMEI());

    }



}
