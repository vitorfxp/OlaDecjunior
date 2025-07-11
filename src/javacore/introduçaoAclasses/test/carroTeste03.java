package javacore.introduçaoAclasses.test;

import javacore.introduçaoAclasses.dominio.Carro;

public class carroTeste03 {
    public static void main(String[] args) {
        Carro ferrari = new Carro();
        Carro porsche = new Carro();

        ferrari.nome = "La ferrari";
        ferrari.modelo = "F150";
        ferrari.ano = 2013;


        porsche.nome = "911";
        porsche.modelo = "911 Carrera GTS";
        porsche.ano = 2025;

        ferrari = porsche; //para que um objeto receba os mesmos atributos guardados na memoria voce iguala os dois, e aquele que ficara com o atributo final sera o igualado, ou seja, carro1 = carro2, os atributos mostrados serao do carro 2.

        System.out.println(ferrari.nome + " - " + ferrari.modelo + " - "+ ferrari.ano);
        System.out.println("---------------------------------");
        System.out.println(porsche.nome + " - " + porsche.modelo + " - "+ porsche.ano);
    }
}
