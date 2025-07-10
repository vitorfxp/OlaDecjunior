package introduçao;

public class ifeElse {
    public static void main(String[] args) {
        int idade = 15;
        boolean isAutorizado = idade >= 18;
        if(isAutorizado){
            System.out.println("autorizado chefe");
        }else{
            System.out.println("nao ta nao porra");
        }
        //!
        if (!isAutorizado) {
            System.out.println("Não autorizado chefe");
        }
    }
}
