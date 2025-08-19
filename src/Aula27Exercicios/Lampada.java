package Aula27Exercicios;

public class Lampada {

    private String marca;
    private boolean ligada;

    public Lampada(String marca) {
        this.marca = marca;
        this.ligada = false;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean isLigada() {
        return ligada;
    }

    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }

    public void ligarLampada() {
        if(!ligada) {
            this.ligada = true;
            System.out.println("A lamapada está ligada!");
        } else {
            System.out.println("Lampada já está ligada!");
        }
    }

    public void desligarLampada() {
        if(ligada) {
            this.ligada = false;
            System.out.println("A lampada foi desligada!");
        } else {
            System.out.println("A lampada já está desligada!");
        }
    }
}
