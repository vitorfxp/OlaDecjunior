package devdojo;

public class ex03 {
    public static void main(String[] args) {
        byte dia = 9;
        switch (dia) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("dia util");
                break;
            case 1:
            case 7:
                System.out.println("Final de semana");
                break;
            default:
                System.out.println("Opção Invalida");
        }
    }
}
