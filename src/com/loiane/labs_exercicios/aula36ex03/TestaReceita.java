package com.loiane.labs_exercicios.aula36ex03;

public class TestaReceita {
    public static void main(String[] args) {

        PessoaFisica pf = new PessoaFisica("Marcello", 3000);

        pf.calculaImposto();
        System.out.println("Vai pagar: " + pf.getValaorPagar());

    }
}
