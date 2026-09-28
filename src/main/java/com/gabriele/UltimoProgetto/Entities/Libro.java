package com.gabriele.UltimoProgetto.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.GenerationType;

@Entity
@Table(name = "libri")

public class Libro {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String titolo;
	private String autore;
	private Integer anno;
	
	public Libro() {
		
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getTitolo() {
		return titolo;
	}
	
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	
	public String getAutore() {
		return autore;
	}
	
	public void setAutore(String autore) {
		this.autore = autore;
	}
	
	public Integer getAnno() {
		return anno;
	}
	
	public void setAnno(Integer anno) {
		this.anno = anno;
	}
	
}
