package prova_exe1;

public class Geladeira extends Produto{
    private int volume;

    public Geladeira (int codigo, double peso, int volume){
        super(codigo, peso);
        this.volume = volume;
    }

    public double seguro()
    {
        return (super.seguro() + (volume * 5));
    }
}
