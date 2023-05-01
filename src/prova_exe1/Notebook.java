package prova_exe1;

public class Notebook extends Produto{
    private int memoria;

    public Notebook(int codigo, double peso, int memoria){
        super(codigo, peso);
        this.memoria = memoria;

    }

    public double seguro (){
        return (memoria * 500);
    }
}
