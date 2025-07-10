package introduçao;

public class oplogicoAND {
    public static void main(String[] args) {
        //  && (and) || (or) ! (negaçao)

        // && (and)
        int idade = 29;
        float wage = 3500F;
        boolean isDentroDaLei1 = idade > 30 && wage >= 4612;
        boolean isDentroDaLei2 = idade < 30 && wage >= 3381;

    // ||(or)
        double valorTotalCC = 200;
        double valorTotalP = 10000;
        float valorPS5 = 5000F;
        boolean isPS5compravel = valorTotalCC > valorPS5 || valorTotalP > valorPS5;
        System.out.println(isPS5compravel);


    }
}
