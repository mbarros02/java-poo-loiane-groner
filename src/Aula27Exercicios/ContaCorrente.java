package Aula27Exercicios;

public class ContaCorrente {

    private int numero;
    private double saldo;
    private String status;
    private double limite;

    public ContaCorrente(int numero, double saldo, String status, double limite) {
        this.numero = numero;
        this.saldo = saldo;
        this.status = status;
        this.limite = limite;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
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

    public void depositar(double valor) {
        if (valor > 0 && valor <= getLimite()) {
            this.saldo = getSaldo() + valor;
            System.out.println("O valor " + valor + " foi depositado com sucesso!");
            System.out.println("O seu saldo atual é: " + getSaldo());
        } else {
            System.out.println("O valor não pôde ser depositado. Verifique seu limite!");
        }
    }

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
