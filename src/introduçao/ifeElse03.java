package introduçao;

public class ifeElse03 {
    public static void main(String[] args) {
        double wage = 6000;
        String mensagemDoar = "eu vou doar 500";
        String mensagemNDoar = "Ainda n vou doar, mas vou ter!!";

        String resultado = wage > 5000 ? mensagemDoar : mensagemNDoar;

        System.out.println(resultado);
    }
}
