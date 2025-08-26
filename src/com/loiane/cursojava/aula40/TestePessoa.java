package com.loiane.cursojava.aula40;

public class TestePessoa {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();
        Pessoa aluno = new Aluno();
        Pessoa professor = new Professor();

        pessoa.setEndereco("Rua 01, número 01");
        aluno.setEndereco("Rua 02, número 02");
        professor.setEndereco("Rua 03, número 03");

        System.out.println(pessoa.obterEtiquetaEnderco());
        System.out.println(aluno.obterEtiquetaEnderco());
        System.out.println(professor.obterEtiquetaEnderco());
    }
}
