import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TesteEmail {



    @Test
    public static boolean testar_email_com_arroba(){
        Pessoa op = new Pessoa();

          Assertions.assertTrue(op.emailValid("email_teste@dominio.com.br"));
        return false;
    }


    public static boolean testar_email_sem_arroba(){
        Pessoa op = new Pessoa();

        Assertions.assertFalse(op.emailValid("email_teste@dominio.com.br"));

        return false;
    }

    public static boolean testar_email_mais_50_caracteres() {

        Pessoa op = new Pessoa();

        Assertions.assertEquals("email_teste_muito_longo_nao_deve_ser_valido@dominio.com.br", op.emailValid("email_teste_muito_longo_nao_deve_ser_valido@dominio.com.br"));

        return false;
    }


}

