package br.com.alura.principal;


import br.com.alura.minhasMusicas.MinhasPreferidas;
import br.com.alura.minhasMusicas.Musica;
import br.com.alura.minhasMusicas.PodCast;

public class PrincipalDesafio {
    public static void main(String[] args) {

        Musica musica = new Musica();
        musica.setTitulo("Até que o senhor venha");
        musica.setArtista("Cultura do Céu");

        for( int i = 0; i < 300; i++){
            musica.curte();
        }

        for( int i = 0; i < 1500; i++ ){
            musica.reproduz();
        }

        musica.totalDeCurtida();
        musica.totalDeReproducao();

        PodCast iafPodCast = new PodCast();

        iafPodCast.setTitulo("Iaf PodCast");
        iafPodCast.setHost("www.igrejaiaf.com.br");

        for( int i = 0; i < 3200; i++){
            iafPodCast.curte();
        }

        for( int i = 0; i < 12500; i++ ){
            iafPodCast.reproduz();
        }

        iafPodCast.totalDeCurtida();
        iafPodCast.totalDeReproducao();

        MinhasPreferidas preferidas =  new MinhasPreferidas();
         preferidas.inclui(musica);
         preferidas.inclui(iafPodCast);

    }
}
