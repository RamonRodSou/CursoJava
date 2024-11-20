package com.ramonrodsouza.music.model;

import jakarta.persistence.*;


@Entity
@Table(name = "musicas")
public class Musica {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String nome;

    @ManyToOne
    private Artista artista;

    public Musica(){}

    public Musica(String musicaNome) {
        this.nome = musicaNome;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    @Override
    public String toString() {
        return "Musica: " + nome +
                " Artista:" + artista.getNome();
    }
}
