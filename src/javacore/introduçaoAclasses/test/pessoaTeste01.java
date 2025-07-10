package javacore.introduçaoAclasses.test;

import javacore.introduçaoAclasses.dominio.Estudante;

public class pessoaTeste01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "luffy";
        estudante.sexo = 'M';
        estudante.idade = 12;
        System.out.println(estudante.idade);
        System.out.println(estudante.nome);
        System.out.println(estudante.sexo);
    }
}
