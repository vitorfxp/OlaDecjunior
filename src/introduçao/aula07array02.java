package introduçao;

public class aula07array02 {
    public static void main(String[] args) {
        //  byte, short, int, long, double e float = 0
        // char '\u0000' ''
        // boolean false
        // String null

        String [] nomes = new String [3] ;;
        nomes[0] = "goku";
        nomes[1] = "naruto";
        nomes [2] = "luffy";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }
}
