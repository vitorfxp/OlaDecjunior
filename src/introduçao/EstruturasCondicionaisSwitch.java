package introduçao;

public class EstruturasCondicionaisSwitch {
    public static void main(String[] args) {
        // imprima o dia da semana, considerando 1 como domingo
        byte dia = 1;
        // char,int,byte,short,enum,String no switch
        switch (dia) {
            default:
                System.out.println("Opção inválida");
                break;
            case 1:
                System.out.println("domingo");
                break;
            case 2:
                System.out.println("segunda");
                break;
            case 3:
                System.out.println("terça");
                break;
            case 4:
                System.out.println("quarta");
                break;
            case 5:
                System.out.println("quinta");
                break;
            case 6:
                System.out.println("sexta");
                break;
            case 7:
                System.out.println("sabado");
                break;


        }
        char sexo = 'M';
        switch (sexo) {
            case 'M':
                System.out.println("Homem");
                break;
            case 'F':
                System.out.println("Mulher");
                break;
            default:
                System.out.println("Opção Invalida");
        }
    }
}
