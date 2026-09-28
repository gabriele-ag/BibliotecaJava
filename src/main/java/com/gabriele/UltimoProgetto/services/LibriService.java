package com.gabriele.UltimoProgetto.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gabriele.UltimoProgetto.Entities.Libro;
import com.gabriele.UltimoProgetto.repositories.LibroRepository;

@Service
public class LibriService {
	
	private final LibroRepository libroRepository;

	public LibriService(LibroRepository libroRepository) {
		this.libroRepository = libroRepository;
	}
	
	public List<Libro> getAllLibri() {
		return libroRepository.findAll();
	}
	
	
}
