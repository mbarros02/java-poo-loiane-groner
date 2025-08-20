package com.loiane.cursojava.aula27exer;

public class Aluno {

    private String nome;
    private String matricula;
    private String curso;
    private String disciplina1, disciplina2, disciplina3;


    public Aluno(String nome, String matricula, String curso, String disciplina1, String disciplina2, String disciplina3) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.disciplina1 = disciplina1;
        this.disciplina2 = disciplina2;
        this.disciplina3 = disciplina3;
    }

    public Aluno(){}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getDisciplina1() {
        return disciplina1;
    }

    public void setDisciplina1(String disciplina1) {
        this.disciplina1 = disciplina1;
    }

    public String getDisciplina2() {
        return disciplina2;
    }

    public void setDisciplina2(String disciplina2) {
        this.disciplina2 = disciplina2;
    }

    public String getDisciplina3() {
        return disciplina3;
    }

    public void setDisciplina3(String disciplina3) {
        this.disciplina3 = disciplina3;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", matricula='" + matricula + '\'' +
                ", curso='" + curso + '\'' +
                ", disciplina1='" + disciplina1 + '\'' +
                ", disciplina2='" + disciplina2 + '\'' +
                ", disciplina3='" + disciplina3 + '\'' +
                '}';
    }
}