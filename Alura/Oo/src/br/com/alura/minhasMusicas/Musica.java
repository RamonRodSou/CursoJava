package br.com.alura.minhasMusicas;

    public class Musica extends Audio  {

    private String artista;
    private String album;
    private String Genero;

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String genero) {
        Genero = genero;
    }

        @Override
        public int getClassificacao() {
            if(this.getTotalDeReproducao() > 2000) {
                return 10;
            }else{
                return 7;
            }
        }
    }
