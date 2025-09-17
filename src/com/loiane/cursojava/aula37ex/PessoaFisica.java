package com.loiane.cursojava.aula37ex;

public class PessoaFisica extends Contribuentes{

    private double imposto;
    private double rendaBruta;
    private double valaorPagar;

    public PessoaFisica() {
    }

    public PessoaFisica(String nome, double rendaBruta) {
        super(nome);
        this.rendaBruta = rendaBruta;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    public double getRendaBruta() {
        return rendaBruta;
    }

    public void setRendaBruta(double rendaBruta) {
        this.rendaBruta = rendaBruta;
    }

    public double getValaorPagar() {
        return valaorPagar;
    }

    public void setValaorPagar(double valaorPagar) {
        this.valaorPagar = valaorPagar;
    }

    public void calculaImposto() {
        if(getRendaBruta() <= 0) {
            setImposto(0.0);
            setValaorPagar(getRendaBruta()*getImposto());
        } else if (getRendaBruta() >= 1400 && getRendaBruta() <= 2100) {
            setImposto(0.10);
            setValaorPagar(getRendaBruta()*getImposto());
        } else if (getRendaBruta() >= 2100.01 && getRendaBruta() <= 2800) {
            setImposto(0.15);
            setValaorPagar(getRendaBruta()*getImposto());
        } else if (getRendaBruta() >= 2800.01 && getRendaBruta() <= 3600) {
            setImposto(0.20);
            setValaorPagar(getRendaBruta()*getImposto());
        } else {
            setImposto(0.30);
            setValaorPagar(getRendaBruta()*getImposto());
        }
    }
}
