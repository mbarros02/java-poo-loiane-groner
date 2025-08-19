package Aula27Exercicios;

public class TesteConta {
    public static void main(String[] args) {

        ContaCorrente c1 = new ContaCorrente(1,1000,"Normal", 5000);
        ContaCorrente c2 = new ContaCorrente(2, 5000, "Normal", 10000);

        c2.sacar(2500);
        c2.depositar(12000);
        c2.chequeEspecial();


    }
}
