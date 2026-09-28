package com.gabriele.UltimoProgetto.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gabriele.UltimoProgetto.Entities.Libro;
import com.gabriele.UltimoProgetto.services.LibriService;

@RestController
@RequestMapping("/api/libri")
public class LibroController {
	
	public final LibriService libriService;
	
	public LibroController(LibriService libriService) {
		this.libriService = libriService;
	}
	
	@GetMapping("")
	List <Libro> getAllLibri() {
		return libriService.getAllLibri();
		
	}
	
	
}
