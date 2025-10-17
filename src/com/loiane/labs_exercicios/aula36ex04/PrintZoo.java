package com.loiane.labs_exercicios.aula36ex04;

public class PrintZoo {
    public static void main(String[] args) {

        Animal a1 = new Mamifero("Camelo", 1.50, 4, "Amarelo", "Terra", 2.0,"Água");
        Animal a2 = new Peixe("Tubarão", 300, 0, "Cinzenta", "Mar", 20, 5, 1);
        Animal a3 = new Mamifero("Urso-Canadá", 180, 4, "Vermelho", "Terra", 5.0, "Mel");

        Animal[] animais = {a1, a2, a3};

        System.out.println("----- ZOO: ------");

        for (Animal animal : animais) {
            System.out.println(animal.toString());
            System.out.println("-------------------");
        }
    }
}
