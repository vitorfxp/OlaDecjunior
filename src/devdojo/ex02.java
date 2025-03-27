package devdojo;

public class ex02 {
    public static void main(String[] args) {
        double wage1 = 25000;
        double cobranca1 = 9.70/10 ;
        double cobranca2 = 37.35/100;
        double cobranca3 = 49.50/100;
        String quantoVoupagar = "";

        if (wage1 <= 34712){
            quantoVoupagar = String.valueOf(wage1 * cobranca1);
        }else if ( wage1 > 34712 && wage1 <= 68507){
            quantoVoupagar = String.valueOf(wage1 * cobranca2);
        }else {
            quantoVoupagar = String.valueOf(wage1 * cobranca3);
        }
        System.out.println(quantoVoupagar);
    }
}
