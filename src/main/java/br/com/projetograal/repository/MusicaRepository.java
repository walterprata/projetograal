package br.com.projetograal.repository;

import java.math.BigDecimal;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.projetograal.model.Musica;

public interface MusicaRepository extends JpaRepository<Musica, BigDecimal> {

}
