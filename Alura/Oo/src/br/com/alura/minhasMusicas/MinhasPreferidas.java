package br.com.alura.minhasMusicas;

public class MinhasPreferidas {

    public void inclui(Audio audio){
        if(audio.getClassificacao() >= 9){
            System.out.println(audio.getTitulo() + " é sucesso absoluto!");
        }else{
            System.out.println(audio.getTitulo() + " é uma boa musica.");
        }
    }
}
