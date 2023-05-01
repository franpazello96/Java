package prova_exe2.java;

public class Pessoa {
    private int identidade;

    public Pessoa (int identidade){
        this.identidade = identidade;
    }

    public String show(){
        return "Pessoa: " + identidade;
    }
}
