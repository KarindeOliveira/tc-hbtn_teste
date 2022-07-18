public class Pessoa {

     boolean emailValid (String email){

        if (email.length() <= 50 || email.contains("@")){
            return true;
        }
        return false;




}}
