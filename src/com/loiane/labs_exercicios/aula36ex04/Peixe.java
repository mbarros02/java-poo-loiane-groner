package com.loiane.labs_exercicios.aula36ex04;

public class Peixe extends Animal{
    private int barbatanas;
    private int cauda;

    public Peixe(String nome, double comprimento, int patas, String cor, String ambiente, double velocidade, int barbatanas, int cauda) {
        super(nome, comprimento, patas, cor, ambiente, velocidade);
        this.barbatanas = barbatanas;
        this.cauda = cauda;
    }

    public int getBarbatanas() {
        return barbatanas;
    }

    public void setBarbatanas(int barbatanas) {
        this.barbatanas = barbatanas;
    }

    public int getCauda() {
        return cauda;
    }

    public void setCauda(int cauda) {
        this.cauda = cauda;
    }

    public String toString(){
        return super.toString() + "Barbatanas: " + barbatanas;
    }
}
