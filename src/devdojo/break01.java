package devdojo;

public class break01 {
    public static void main(String[] args) {
        //imprima os primeiros 25 numeros de um dado valor
        int valormax = 50;
        for (int i = 0; i <= valormax; i++) {
            if (i > 25)
                break;
              System.out.println(i);
        }
    }
}
