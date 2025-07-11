package javacore.introduçaometodos.dominio;

public class Calculadora {

    public void somaDoisNumeros(){
        System.out.println(10 + 10);
    }

    public void subtrairDoisNumeros(){
        System.out.println(15 - 10);
    }
    public void multiplicaDoisNumeros(int num1, int num2){
        System.out.println(num1 * num2);

    }
}

//void = um tipo de retorno, porem nao retorna nada, nos metodos e muito comum o retorno, porem utiliza-se void, quando voce quer nenhum retorno.
// public = public e como o nome disse, a classe e publica para importar em qualquer lugar do projeto.