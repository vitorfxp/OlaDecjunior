package devdojo;

public class ifeElse02 {
    public static void main(String[] args) {
        // idade < 15 infaltil
        // idade >= 15 && idade < 18 juvenil
        // idade > 18 adulto
        int idade = 17;
        String  categoria;

        if (idade < 15){
           categoria = "Categoria infantil";
        }else if(idade >= 15 && idade < 18){
            categoria = "Categoria juvenil";
        }else {
            categoria = "Categoria adulto";
        }
        System.out.println(categoria);
    }
}
