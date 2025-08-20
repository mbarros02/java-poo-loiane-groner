package com.loiane.cursojava.aula27;

public class Carro {

    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    void exibirAutonomia() {
        System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel);
    }

    double obterAutonomia() {
        System.out.println("Método obter autonomia foi chamado!");
        return capCombustivel * consumoCombustivel;
    }

    double calcularCombustivel(double km) {
        double qtdeCombustivel = km / consumoCombustivel;
        return qtdeCombustivel;
    }
}
