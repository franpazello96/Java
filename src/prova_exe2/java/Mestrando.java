package prova_exe2.java;

public class Mestrando extends Estudante{
    private String area_de_pesquisa;
    public Mestrando (int identidade, int matricula, String area_de_pesquisa){
        super(identidade, matricula);
        this.area_de_pesquisa = area_de_pesquisa;
    }
    public String show(){
        return super.show() + "Mestrando: " + area_de_pesquisa;
    }
}
