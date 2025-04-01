package devdojo;

public class continue01 {
    public static void main(String[] args) {
        double valorTotal = 40000;
        for (int parcela = (int) valorTotal; parcela >= 1 ; parcela--) {
            double valorParcela = valorTotal / parcela;
            if(valorParcela < 1000);{
                continue;
            }

        }
    }
}

