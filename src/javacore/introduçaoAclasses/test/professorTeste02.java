package javacore.introduçaoAclasses.test;

import javacore.introduçaoAclasses.dominio.Professor;

public class professorTeste02 {
    public static void main(String[] args) {
         Professor professor = new Professor();
         professor.name = "luffy";
         professor.idade = 14;
         professor.sexo = 'M';
        System.out.println(professor.name + " - " + professor.idade + " - " + professor.sexo);

    }
}
