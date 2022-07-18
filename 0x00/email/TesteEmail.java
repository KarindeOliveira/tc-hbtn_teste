public class TesteEmail {

    static Pessoa op = new Pessoa();


    public static boolean testar_email_com_arroba(){

        if(op.emailValid("email_teste@dominio.com.br")){
            return true;
        }

        return false;
    }


    public static boolean testar_email_sem_arroba(){

        if(op.emailValid("email_teste@dominio.com.br")){
            return true;
        }

        return false;
    }

    public static boolean testar_email_mais_50_caracteres(){

        if(op.emailValid("email_teste_muito_longo_nao_deve_ser_valido@dominio.com.br")){
            return true;
        }

        return false;
    }


}
