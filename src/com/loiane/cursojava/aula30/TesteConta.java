package com.loiane.cursojava.aula30;

public class TesteConta {
    public static void main(String[] args) {

        ContaCorrente conta = new ContaCorrente();

        conta.setEspecial(true);
        conta.setAgencia("001");
        conta.setLimiteEspecial(10.0);

    }
}
