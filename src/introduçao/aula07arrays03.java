package introduçao;

public class aula07arrays03 {
    //formas de inicializar arrays
    public static void main(String[] args) {
        int [] numeros = new int [3];
        String[] numeros2 = {"maria","joao","lucas","pedro"};
        int[] numero3 = new int []{1,2,3,4,5};

        for (int i = 0; i < numeros2.length; i++) {
            System.out.println(numeros2[i]);
        }
        for(int num: numero3){
            System.out.println(num);
        }
    }
}
