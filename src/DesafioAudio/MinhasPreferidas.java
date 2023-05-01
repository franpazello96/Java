package DesafioAudio;

public class MinhasPreferidas {
    public void inclui(Audio audio){
        if(audio.getClassificacao() >= 9){
            System.out.println(audio.getTitulo() + "é considerado suceeso absoluto e preferido por todos");
        }else {
            System.out.println(audio.getTitulo() + "também é uns do que todo mundo está curtindo");
        }
    }
}
