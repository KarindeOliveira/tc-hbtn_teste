import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class PersonTest {

    Person op = new Person();

    @BeforeAll
   static void setup(){
        Person op = new Person();

    }

    @ParameterizedTest(name = "Valida o checkeruser")
    @ValueSource(strings = { "PaulMcCartney2", "NeilArms2" })
    void check_user_valid(String input){
        Assertions.assertTrue(op.checkUser(input));
    }


    @ParameterizedTest(name = "Não Valida o checkeruser")
    @ValueSource(strings = { "Paul#McCartney", "Neil@Arms" })
    void check_user_not_valid(String input){
        Assertions.assertTrue(op.checkUser(input));
    }

    @ParameterizedTest(name = "testa o metodo check_password()")
    @ValueSource(strings = { "123456789", "#$%1234" })
    void does_not_have_letters(String input){
        Assertions.assertFalse(op.checkPassword(input));
    }

    @ParameterizedTest(name = "testa o metodo check_password()")
    @ValueSource(strings = { "Abcabcdefgh@", "#hbtn@%tc"})
    void does_not_have_numbers(String input){
        Assertions.assertFalse(op.checkPassword(input));
    }

    @ParameterizedTest(name = "testa o metodo check_password()")
    @ValueSource(strings = { "Abc@123", "12$@hbt" })
    void does_not_have_eight_chars(String input){
        Assertions.assertFalse(op.checkPassword(input));
    }

    @ParameterizedTest(name = "testa o metodo check_password()")
    @ValueSource(strings = { "abC123456$", "Hbtn@1234", "Betty@1#2", "Hbtn@123" })
    void check_password_valid(String input){
        Assertions.assertFalse(op.checkPassword(input));
    }

    }




