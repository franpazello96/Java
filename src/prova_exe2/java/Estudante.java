package prova_exe2.java;

public class Estudante extends Pessoa{
    private int matricula;
    public Estudante (int identidade, int matricula){
        super(identidade);
        this.matricula = matricula;
    }
    public String show(){
        return super.show() + "Estudante: " + matricula;
    }

}
