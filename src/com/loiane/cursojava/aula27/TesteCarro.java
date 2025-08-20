package com.loiane.cursojava.aula27;

public class TesteCarro {
    public static void main(String[] args) {

        Carro car = new Carro();
        car.marca = "Fiat";
        car.modelo = "Ducato";
        car.numPassageiros = 10;
        car.capCombustivel = 100;
        car.consumoCombustivel = 0.2;

        System.out.println(car.marca);
        System.out.println(car.modelo);

        car.exibirAutonomia();

        double autonomia = car.obterAutonomia();

        System.out.println("A autonomia do carro é de " + car.obterAutonomia());

        double qtdeCombustivel = car.calcularCombustivel(10.0);
    }
}
