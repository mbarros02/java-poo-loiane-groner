package com.loiane.cursojava.aula27exer;

import java.util.Scanner;

public class TesteAluno {
    public static void main(String[] args) {

        Aluno a1 = new Aluno();
        Scanner scan = new Scanner(System.in);

        System.out.println("Nome Aluno: ");
        a1.setNome(scan.next());

        System.out.println("Matricula: ");
        a1.setMatricula(scan.next());

        System.out.println("Curso: ");
        a1.setCurso(scan.next());

        System.out.println("Disciplina 1: ");
        a1.setDisciplina1(scan.next());
        System.out.println(a1.toString());

    }
}
