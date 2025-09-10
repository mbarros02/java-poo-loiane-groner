package com.loiane.cursojava.aula36ex;

public class ContaEspecial extends ContaBancaria{

    private float limite;

    public ContaEspecial() {
    }

    public ContaEspecial(String nomeCliente, String numConta, float saldo) {
        super(nomeCliente, numConta, saldo);
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public void sacar(float valorSaque) {

        if (valorSaque > 0) {
            if (getSaldo() >= valorSaque && getLimite() >= valorSaque) {
                super.setSaldo(getSaldo() - valorSaque);
                System.out.println("Valor: " + valorSaque + " sacado com sucesso!");
            }
        }
    }
}
