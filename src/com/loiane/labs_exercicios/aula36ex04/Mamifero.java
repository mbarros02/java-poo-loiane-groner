package com.loiane.labs_exercicios.aula36ex04;

public class Mamifero extends Animal{
    private String alimento;

    public Mamifero(String nome, double comprimento, int patas, String cor, String ambiente, double velocidade, String alimento) {
        super(nome, comprimento, patas, cor, ambiente, velocidade);
        this.alimento = alimento;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public String toString(){
        return super.toString() + "Alimento: " + alimento;
    }
}
