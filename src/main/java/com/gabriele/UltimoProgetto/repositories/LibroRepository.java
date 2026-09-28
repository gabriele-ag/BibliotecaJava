package com.gabriele.UltimoProgetto.repositories;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gabriele.UltimoProgetto.Entities.Libro;


@Repository
public interface LibroRepository extends JpaRepository<Libro, Integer> {
	
	List<Libro> findByAutore(String autore);
	List<Libro> findByAnno(Integer anno);
	List<Libro> findByTitolo(String titolo);
	List<Libro> findByTitoloContaining(String titolo);
	List<Libro> findAll();
}