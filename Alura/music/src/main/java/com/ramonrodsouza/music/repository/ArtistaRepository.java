package com.ramonrodsouza.music.repository;

import com.ramonrodsouza.music.model.Artista;
import com.ramonrodsouza.music.model.Musica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface ArtistaRepository extends JpaRepository<Artista, Long> {

    Optional<Artista> findByNomeContainingIgnoreCase(String artistaNome);

    @Query("SELECT m FROM Artista a JOIN a.musicas m WHERE a.nome ILIKE %:nome%")
    List<Musica>buscaMusicaPorArtista(String nome);


}
