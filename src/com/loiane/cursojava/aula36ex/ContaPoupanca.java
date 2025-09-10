package com.loiane.cursojava.aula36ex;

public class ContaPoupanca extends ContaBancaria {

    private float diaRendimento;

    public ContaPoupanca() {
    }

    public ContaPoupanca(String nomeCliente, String numConta, float saldo, float diaRendimento) {
        super(nomeCliente, numConta, saldo);
        this.diaRendimento = diaRendimento;
    }

    public float getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(float diaRendimento) {
        this.diaRendimento = diaRendimento;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void depositar(float valorDeposito) {
        if (valorDeposito > 0) {
            super.setSaldo(getSaldo() + valorDeposito);
        } else {
            System.out.println("Não houve rendimento!");
        }
    }

    public void novoSaldo() {
        super.setSaldo(getSaldo() + getDiaRendimento());
    }
}