package com.loiane.cursojava.aula30;

public class ContaCorrente {
    private String numero;
    private String agencia;
    boolean especial;
    double limiteEspecial;
    double saldo;

    public ContaCorrente() {
    }

    public ContaCorrente(String numero, String agencia, boolean especial,
                         double limiteEspecial, double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.especial = especial;
        this.limiteEspecial = limiteEspecial;
        this.saldo = saldo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public boolean isEspecial() {
        return especial;
    }

    public void setEspecial(boolean especial) {
        this.especial = especial;
    }

    public double getLimiteEspecial() {
        return limiteEspecial;
    }

    public void setLimiteEspecial(double limiteEspecial) {
        this.limiteEspecial = limiteEspecial;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void sacar(double valor) {
        if (getSaldo() > valor) {
            this.saldo = getSaldo() - valor;
            System.out.println("Valor " + valor + " sacado com sucesso!!");
            System.out.println("Saldo atual " + getSaldo());
        } else {
            System.out.println("Verifique seu saldo!");
        }
    }

    /*public void depositar(double valor) {
        if (valor > 0 && valor <= getLimite()) {
            this.saldo = getSaldo() + valor;
            System.out.println("O valor " + valor + " foi depositado com sucesso!");
            System.out.println("O seu saldo atual é: " + getSaldo());
        } else {
            System.out.println("O valor não pôde ser depositado. Verifique seu limite!");
        }
    }*/

    public void verificarSaldo() {
        System.out.println("===== SALDO ATUAL =====");
        System.out.println("Saldo: " + getSaldo());
    }

    public void chequeEspecial() {
        double chequeEspecial = -1;
        if (getSaldo() <= chequeEspecial) {
            System.out.println("O cliente está usando o cheque especial!");
        } else {
            System.out.println("O cliente não está usando o cheque especial!");
        }
    }
}
