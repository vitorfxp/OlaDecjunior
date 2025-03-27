package devdojo;

public class OpAritimeticos {
    public static void main(String[] args) {
        // + - / * aritimeticos
        int num01 = 10;
        double num02 = 20;
        double soma = num01 / num02;

        // % resto da divisao
        int resto = 21 % 2;
        System.out.println(resto);

        // < > <= => == != relacionais
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualQueVinte = 10 == 10;
        boolean isDezDiferenteQueVinte = 10 != 20;
        System.out.println("Dez e maior que vinte ?" + isDezMaiorQueVinte);
        System.out.println("Dez e maior que vinte ?" + isDezIgualQueVinte);
        System.out.println(isDezIgualQueVinte);
        System.out.println(isDezDiferenteQueVinte);
    }
}
