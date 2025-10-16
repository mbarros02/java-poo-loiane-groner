package com.loiane.labs_exercicios.aula36ex01;

public class TestaBanco {
    public static void main(String[] args) {

        ContaBancaria c1 = new ContaBancaria("Marcello", "10", 800);
        ContaPoupanca c2 = new ContaPoupanca();
        ContaEspecial c3 = new ContaEspecial();

        c2.setDiaRendimento(15);
        c2.depositar(1500);
        c2.novoSaldo();
        System.out.println(c2.toString());

    }
}
