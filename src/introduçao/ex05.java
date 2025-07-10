package introduçao;

public class ex05 {
    public static void main(String[] args) {
        double valorTotal = 40000;
        for (int parcela = 0; parcela <= valorTotal; parcela++) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela < 1000) {
                break;
            }
            System.out.println("parcela"+ parcela+ "r$"+valorParcela);
        }
    }
}
