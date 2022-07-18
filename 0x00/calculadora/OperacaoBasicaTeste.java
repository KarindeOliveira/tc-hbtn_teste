public class OperacaoBasicaTeste {

    static OperacaoBasica op = new OperacaoBasica();


    public static boolean testar_soma(){

        if(op.somar(5,3) == 8){
            return true;
        }

        return false;
    }

    public static boolean testar_subtracao(){

        if(op.subtrair(5,3) == 2){
            return true;
        }

        return false;
    }

    public static boolean testar_multiplicacao(){

        if(op.multiplicar(5,3) == 15){
            return true;
        }

        return false;
    }

    public static boolean testar_divisao(){
        if(op.dividir(9,3) == 3){
            return true;
        }

        return false;
    }


}
