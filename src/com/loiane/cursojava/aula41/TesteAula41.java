package com.loiane.cursojava.aula41;

import com.loiane.cursojava.aula40.Aluno;
import com.loiane.cursojava.aula40.Pessoa;
import com.loiane.cursojava.aula40.Professor;

public class TesteAula41 {
    public static void main(String[] args) {

        com.loiane.cursojava.aula40.Pessoa pessoa = new com.loiane.cursojava.aula40.Pessoa();
        com.loiane.cursojava.aula40.Pessoa aluno = new Aluno();
        Pessoa professor = new Professor();

        pessoa.setEndereco("Rua 01, número 01");
        aluno.setEndereco("Rua 02, número 02");
        professor.setEndereco("Rua 03, número 03");
    }
}
