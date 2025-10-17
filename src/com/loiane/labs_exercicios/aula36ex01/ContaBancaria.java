package com.loiane.labs_exercicios.aula36ex01;

public class ContaBancaria {

    private String nomeCliente;
    private String numConta;
    private float saldo;

    public ContaBancaria() {
    }

    public ContaBancaria(String nomeCliente, String numConta, float saldo) {
        this.nomeCliente = nomeCliente;
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "ContaBancaria{" +
                "nomeCliente='" + nomeCliente + '\'' +
                ", numConta='" + numConta + '\'' +
                ", saldo=" + saldo +
                '}';
    }

    public void sacar(float valorSaque) {

        if(valorSaque > 0) {
            if (getSaldo() >= valorSaque) {
                setSaldo(getSaldo() - valorSaque);
                System.out.println("Valor: " + valorSaque + " sacado com sucesso!");
            } else {
                System.out.println("Saldo insuficiente!!");
            }
        }
    }

    public void depositar(float valorDeposito) {
        if(valorDeposito > 0) {
            setSaldo(getSaldo()+valorDeposito);
            System.out.println("Valor: " + valorDeposito + " despositado com sucesso!");
            System.out.println("Seu saldo atual é de: " + getSaldo());
        } else {
            System.out.println("Valor inválido. Tente novamente!!");
        }
    }
}
