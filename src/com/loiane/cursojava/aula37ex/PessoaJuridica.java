package com.loiane.cursojava.aula37ex;

public class PessoaJuridica extends Contribuentes{

    private double valorEmpresa;
    private double imposto = 0.10;
    private double valorPagar;

    public PessoaJuridica() {
    }

    public PessoaJuridica(double valorEmpresa) {
        this.valorEmpresa = valorEmpresa;
    }

    public double getValorPagar() {
        return valorPagar;
    }

    public void setValorPagar(double valorPagar) {
        this.valorPagar = valorPagar;
    }

    public double getImposto() {
        return imposto;
    }

    public PessoaJuridica(String nome, double valorEmpresa) {
        super(nome);
        this.valorEmpresa = valorEmpresa;
    }

    public double getValorEmpresa() {
        return valorEmpresa;
    }

    public void setValorEmpresa(double valorEmpresa) {
        this.valorEmpresa = valorEmpresa;
    }

    public void calculaImposto() {
        setValorPagar(getValorEmpresa() * getImposto());
    }
}
