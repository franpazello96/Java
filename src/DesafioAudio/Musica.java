package DesafioAudio;

public class Musica extends Audio{
    private String album;
    private String cantor;
    private String genero;

    public String getAlbum() {
        return album;
    }

    public String getCantor() {
        return cantor;
    }

    public String getGenero() {
        return genero;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public void setCantor(String cantor) {
        this.cantor = cantor;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getClassificacao(){
        if(this.getTotalDeReproducoes() > 2000){
            return 10;
        } else {
            return 7;
        }
    }
}
